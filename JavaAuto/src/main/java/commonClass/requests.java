package commonClass;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class requests {
    public static String doGet(String url) {
        return doGet(url, null);
    }
    public static String doGet(String url, Map<String, String> params) {
        // 建立http 链接
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String result = "";
        CloseableHttpResponse response = null;
        try {
            // 新建一个URL
            URIBuilder builder = new URIBuilder(url);
            if (params != null) {
                for (String key : params.keySet()) {
                    builder.addParameter(key, params.get(key));
                }
            }
            URI uri = builder.build();
            // 新建一个get请求
            HttpGet httpGet = new HttpGet(uri);
//            httpGet.setHeader("cookie", "loginTokenken=ZjJlNzhlZGItYjE5ZS00MTU1LWFhZTMtMWI1NDdjZWRiYzBk;dwu=d8910438-f266-4620-8a3e-d904565cea2b");
            httpGet.setHeader("cookie","experimentation_subject_id=ImIxYjUyYWYzLTc1ZTgtNDMwMC05NzlhLWJlNTE5OGJhYzAzZSI%3D--b54904c74bdf17b8ebd774bc2af7ed9c944c812e; sso2bToken=4e595490-cdc7-4b39-af48-f422dd8f5cd1; loginToken=007eede0-aff6-400a-96ea-c84abc74cb5f");
            httpGet.setHeader("Content-Type", "application/json");
            // ִ获取接口返回值
            response = httpclient.execute(httpGet);
            // 判断接口返回状态是不是200
            if (response.getStatusLine().getStatusCode() == 200) {
                result = EntityUtils.toString(response.getEntity(), "UTF-8");
            }else{
                System.out.println("接口请求失败");
                result = EntityUtils.toString(response.getEntity(), "UTF-8");
            }


//            Cookie[] cookies = httpGet.g;
//            if (cookies.length == 0) {  //如果获取cookies为空
//                System.out.println("None");
//            } else {
//                for (int i = 0; i < cookies.length; i++) {
//                    System.out.println(cookies.length);
//                    String a = cookies[i].toString();//获取cookies里面所有信息
//                    System.out.println(a);
//                }

//            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static String doGetweixin(String url) {
        return doGet(url, null);
    }
    public static String doGetweixin(String url, Map<String, String> params) {
        // 创建Httpclient链接
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String result = "";
        CloseableHttpResponse response = null;
        try {
            // new一个uri
            URIBuilder builder = new URIBuilder(url);
            if (params != null) {
                for (String key : params.keySet()) {
                    builder.addParameter(key, params.get(key));
                }
            }
            URI uri = builder.build();
            // 新建一个http get 请求
            HttpGet httpGet = new HttpGet(uri);
//            httpGet.setHeader("_head", "{\"token\":\"a9d3a876-675a-42cb-bda5-e07fdb34f6e3\",\"userId\":\"\",\"channel\":\"h5\",\"channelCode\":\"\",\"device\":\"h5\",\"come_from\":\"\",\"platformId\":\"1\",\"appName\":\"health-weapp\",\"version\":201911151425,\"source\":\"1001-001\",\"timestamp\":1574060662759}");
            httpGet.setHeader("cookie","csrfToken=NmFf35WgBCt74dMuHHdfCG_x; experimentation_subject_id=ImIxYjUyYWYzLTc1ZTgtNDMwMC05NzlhLWJlNTE5OGJhYzAzZSI%3D--b54904c74bdf17b8ebd774bc2af7ed9c944c812e; loginToken=2f72d73d-d710-4479-a6cf-c0cc80e76ce4");
            httpGet.setHeader("Content-Type", "application/json");
            // ִ获取返回值
            response = httpclient.execute(httpGet);
            // 判断接口返回值是不是200
            if (response.getStatusLine().getStatusCode() == 200) {
                result = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static String doPost(String url) {
        return doPost(url, null);
    }
    public static String doPost(String url, Map<String, String> params) {
        //
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = "";
        try {
            //
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("cookie","csrfToken=NmFf35WgBCt74dMuHHdfCG_x; experimentation_subject_id=ImIxYjUyYWYzLTc1ZTgtNDMwMC05NzlhLWJlNTE5OGJhYzAzZSI%3D--b54904c74bdf17b8ebd774bc2af7ed9c944c812e; loginToken=16af0052-d246-48af-8295-277e0dac2144");
//            httpPost.setHeader("cookie", "loginToken=NDU1MmI2NWYtYThiZi00ZWRlLTlmZmUtMTg1OGNiZjcxODg3;dwu=d8910438-f266-4620-8a3e-d904565cea2b");
            httpPost.setHeader("Content-Type", "application/json");
            //
            if (params != null) {
                List<NameValuePair> paramList = new ArrayList<>();
                for (String key : params.keySet()) {

                    paramList.add(new BasicNameValuePair(key, params.get(key)));
                }
                //
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList,"utf-8");
                httpPost.setEntity(entity);
            }
            // ִ

            response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;
    }
    public static String doPostJson(String url, String json) {
        //
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = "";
        try {
            //
            HttpPost httpPost = new HttpPost(url);
            //
            httpPost.setHeader("cookie", "loginToken=16af0052-d246-48af-8295-277e0dac2144");
            httpPost.setHeader("Content-Type", "application/json");
            //
            StringEntity entity = new StringEntity(json.toString(),"UTF-8");//���������������
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            // ִ
            response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;
    }

    public static String doPostJsonweixin(String url, String json) {
        //
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = "";
        try {
            //
            HttpPost httpPost = new HttpPost(url);
            //
            httpPost.setHeader("cookie", "loginToken=ZjJlNzhlZGItYjE5ZS00MTU1LWFhZTMtMWI1NDdjZWRiYzBk; dwu=d8910438-f266-4620-8a3e-d904565cea2b");
            httpPost.setHeader("Content-Type", "application/json");
            //
            StringEntity entity = new StringEntity(json.toString(),"UTF-8");//���������������
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            //
            response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;
    }


}
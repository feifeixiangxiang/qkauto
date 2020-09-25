package debug;


import commonClass.requests;
import org.testng.annotations.Test;


import java.util.HashMap;

public class requestTest {
//    String host = "http://api-dev.doctorwork.com";
    String host = "https://webxr-dev.doctorwork.com";

    @Test(enabled = false)
    public void test(){
        requests re = new requests();
        System.out.println("接口请求开始");
        String url = host+"/doc-dash/v1/product/detail?";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("skuCode", "34214132423423");
        String res = re.doGet(url, params);
        System.out.println(res);

    }

    @Test
    public void testone(){
        System.out.println("添加企业");
//        requests request = new  requests();
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/add";
        HashMap<String,String> par = new HashMap<String, String>();
        par.put("name","自动化评论新增4");
        par.put("remark","评论数据");
        par.put("logo","https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W");
        par.put("employeeCount","100");
        String res = requests.doPost(url,par);
        System.out.println(res);
        }

    @Test
    public void testtow(){
        System.out.println("企业信息分页查询");
        requests re = new requests();
        System.out.println("接口请求开始");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/list/page";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("pageSize", "10");
        params.put("pageNum","1");
        String res = re.doGet(url, params);
        System.out.println(res);
    }




}

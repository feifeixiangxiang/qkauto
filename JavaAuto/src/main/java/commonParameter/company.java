package commonParameter;

import com.google.gson.JsonObject;
import commonClass.publicClass;
import commonClass.random;
import commonClass.requests;
import commonClass.strtojson;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class company {
//    String host = "https://webxr-dev.doctorwork.com";
    JSONObject company = new JSONObject();
    int radom = random.radomint(1000);
    String host =  publicClass.URL;
    //企业ID
    public static String conpanyid = "";
    //分部ID
    public static String conpanystationid = "";
    //userid
    public static String userid="";
    //获取四位随机数
    String  forecode = random.getCode();
    //获取6位随机数
    String SEXcode = random.getsexCode();

    @Test(priority = 0)
    public void testone(){
        System.out.println("添加企业");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/add";
        JsonObject json = new JsonObject();
        json.addProperty("name","自动化评论新增"+radom);
        json.addProperty("remark","评论数据");
        json.addProperty("logo","https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W");
        json.addProperty("employeeCount","100");
        String conpany = json.toString();
        System.out.println("企业BODY信息"+conpany);
//        String body = "{\"name\":\"自动化评论新增7\",\"remark\":\"评论数据\",\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"employeeCount\":\"100\"}";
        String res = requests.doPostJson(url,conpany);
        String company = "data";
        conpanyid = strtojson.starjson(res,company);
        System.out.println("企业ID："+conpanyid);
        System.out.println(res);
    }

    @Test(priority = 5)
    public void requestcompay(){
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
    @Test(priority = 5)
    public void requestcompaylist(){
        System.out.println("企业信息列表查询");
        requests re = new requests();
        System.out.println("接口请求开始");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/list/all";
        HashMap<String, String> params = new HashMap<String, String>();
//        params.put("pageSize", "10");
//        params.put("pageNum","1");
        String res = re.doGet(url, params);
        System.out.println(res);
    }
    @Test(priority = 3)
    public void updatacompay(){
        System.out.println(conpanyid);
        System.out.println("更新企业");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/update";
        JsonObject json = new JsonObject();
        json.addProperty("id",conpanyid);
        json.addProperty("name","自动化评论新增"+radom);
        json.addProperty("remark","评论数据");
        json.addProperty("logo","https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W");
        json.addProperty("employeeCount","100");
        String conpany = json.toString();
        String result = requests.doPostJson(url,conpany);
        System.out.println(result);
    }

    @Test(priority = 4)
    public void compaydetail(){
        System.out.println("企业详情");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/detail";
        System.out.println(url);
        HashMap<String,String> pars = new HashMap<String, String>();
        pars.put("id",conpanyid);
        String result = requests.doGet(url,pars);
        System.out.println(result);
    }
    @Test(priority = 10)
    public void compaydelete(){
        System.out.println("删除企业");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/delete";
        JsonObject json = new JsonObject();
        json.addProperty("id",conpanyid);
        String body = json.toString();
        String result = requests.doPostJson(url,body);
        System.out.println(result);
    }
    @Test(priority = 1)
    public void compaytationadd(){
        System.out.println("添加企业分部");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/station/add";
        System.out.println(url);
        JsonObject json = new JsonObject();
        json.addProperty("enterpriseId",conpanyid);
        json.addProperty("name","自动分部添加"+radom);
        json.addProperty("location","成都万科大厦");
        json.addProperty("stationCode",forecode);
        String pars = json.toString();
        System.out.println("分部BODY"+pars);
//        String pars = "{\"enterpriseId\":97,\"name\":\"分部1\",\"location\":\"成都万科大厦\",\"stationCode\":\"1234\"}";
        String result = requests.doPostJson(url,pars);
        //获取分部ID
        String company = "data";
        conpanystationid = strtojson.starjson(result,company);
        System.out.println("企业分部ID："+conpanystationid);
        System.out.println(result);
    }
    @Test(priority = 3)
    public void compaytationupdate(){
        System.out.println("更新企业分部");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/station/update";
        System.out.println(url);
        JsonObject json = new JsonObject();
        json.addProperty("id",conpanystationid);
        json.addProperty("enterpriseId",conpanyid);
        json.addProperty("name","自动分部添加"+radom);
        json.addProperty("location","成都万科大厦");
        json.addProperty("stationCode",forecode);
        String pars = json.toString();
        System.out.println("分部BODY"+pars);
        String result = requests.doPostJson(url,pars);
        System.out.println(result);
    }

    @Test(enabled = false)
    public void compaytationlist(){
        System.out.println("企业分部列表查询");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/station/list";
        System.out.println(url);
        JsonObject json = new JsonObject();
        json.addProperty("enterpriseId",conpanyid);
        String pars=json.toString();
        String result = requests.doPostJson(url,pars);
        String code = strtojson.starjson(result,"errcode");
        Assert.assertEquals(code,0);
        System.out.println(result);
    }
    @Test(priority = 9)
    public void compaystationdelete() {
        System.out.println("删除企业分部");
        String url = host + "/gateway/qhealth-op-admin-web/enterprise/station/delete";
        System.out.println(url);
        JsonObject json = new JsonObject();
        json.addProperty("id",conpanystationid);
        String pars = json.toString();
        String result = requests.doPostJson(url, pars);
        System.out.println(result);
    }

    @Test(priority = 4)
    public void compaysettation(){
        System.out.println("设置企业默认分部");
        String url = host+"/gateway/qhealth-op-admin-web/enterprise/station/default";
        System.out.println(url);
        JsonObject json = new JsonObject();
        json.addProperty("id",conpanystationid);
        json.addProperty("enterpriseId",conpanyid);
        String pars = json.toString();
//        String pars = "{\"id\":\"69\",\"enterpriseId\":97}";
        String result = requests.doPostJson(url,pars);
        System.out.println(result);
    }

    @Test(priority = 4)
    public void accountAlloctionlist(){
        System.out.println("账号分配-管理员分页查询");
        String url = host+"/gateway/qhealth-op-admin-web/administrator/page";
        System.out.println(url);
        HashMap<String,String> pars = new HashMap<String, String>();
        pars.put("account","");
        pars.put("pageNum","1");
        pars.put("pageSize","10");
//        String pars = "{\"id\":\"69\",\"enterpriseId\":97}";
        String result = requests.doGet(url,pars);
        userid = strtojson.userid(result,"userId");
        System.out.println("userid:"+userid);
        String code = strtojson.starjson(result,"errcode");
        Assert.assertEquals(code,0);
        System.out.println(result);
    }
    @Test(priority = 2)
    public void accountAlloctionadd(){
        System.out.println("账号分配_管理员新增");
        String url = host+"/gateway/qhealth-op-admin-web/administrator/add";
        System.out.println(url);
        JsonObject json = new JsonObject();
        json.addProperty("enterpriseId",conpanyid);
        json.addProperty("branchId",conpanystationid);
        json.addProperty("operator","杨天");
        json.addProperty("account","17313"+SEXcode);
        json.addProperty("password","123456");
        String pars = json.toString();
//        String pars = "{\"enterpriseId\":97,\"branchId\":69,\"operator\":\"杨天\",\"account\":\"17313150063\",\"password\":\"123456\"}";
        String result = requests.doPostJson(url,pars);
        String code = strtojson.starjson(result,"errcode");
        Assert.assertEquals(code,0);
        System.out.println(result);
    }

    @Test(enabled = false)
    public void accountAlloctiondelete(){
        System.out.println("账号分配_管理员删除");
        String url = host+"/gateway/qhealth-op-admin-web/administrator/delete";
        System.out.println(url);
//        JsonObject json = new JsonObject();
//        System.out.println("userid:"+userid);
//        json.addProperty("userId","710432581778145280");
//        String pars = json.toString();
        String pars = "{\"userId\":\"710432581778145280\"}";
        System.out.println(pars);
        String result = requests.doPostJson(url,pars);
        //返回结果验证
        String code = strtojson.starjson(result,"errcode");
        Assert.assertEquals(code,0);

        System.out.println(result);
    }

}

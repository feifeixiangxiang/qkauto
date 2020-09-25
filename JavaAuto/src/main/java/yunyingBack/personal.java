package yunyingBack;

import commonClass.publicClass;
import commonClass.random;
import commonClass.requests;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

public class personal {
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
        System.out.println("员工查询");
        String url = host+"/gateway/qhealth-op-web/employee/page";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("pageSize", "10");
        params.put("pageNum","1");
//        String body = "{\"name\":\"自动化评论新增7\",\"remark\":\"评论数据\",\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"employeeCount\":\"100\"}";
        String res = requests.doGet(url,params);
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
}

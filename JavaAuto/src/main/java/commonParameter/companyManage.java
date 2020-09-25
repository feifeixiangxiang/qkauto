package commonParameter;

import commonClass.requests;
import org.testng.annotations.Test;

import java.util.HashMap;

public class companyManage {
    String host = "https://webxr-dev.doctorwork.com";

    @Test
    public void companymanagelist(){
        System.out.println("服务管理服务列表全部服务信息");
        String url = host+"/gateway/qhealth-op-admin-web/svr-manage/list";
        System.out.println(url);
        HashMap<String,String> pars = new HashMap<String, String>();
        pars.put("name","");
        pars.put("svrCode","");
        pars.put("type","");
//        String pars = "{\"id\":\"69\",\"enterpriseId\":97}";
        String result = requests.doGet(url,pars);
        System.out.println(result);
    }
    @Test
    public void companymanagelistliliao(){
        System.out.println("服务管理服务列表理疗服务信息");
        String url = host+"/gateway/qhealth-op-admin-web/svr-manage/list";
        System.out.println(url);
        HashMap<String,String> pars = new HashMap<String, String>();
        pars.put("name","");
        pars.put("svrCode","");
        pars.put("type","2");
//        String pars = "{\"id\":\"69\",\"enterpriseId\":97}";
        String result = requests.doGet(url,pars);
        System.out.println(result);
    }
    @Test
    public void companymanagelistjichu(){
        System.out.println("服务管理服务列表基础服务信息");
        String url = host+"/gateway/qhealth-op-admin-web/svr-manage/list";
        System.out.println(url);
        HashMap<String,String> pars = new HashMap<String, String>();
        pars.put("name","");
        pars.put("svrCode","");
        pars.put("type","1");
//        String pars = "{\"id\":\"69\",\"enterpriseId\":97}";
        String result = requests.doGet(url,pars);
        System.out.println(result);
    }
    @Test
    public void companymanagecompany(){
        System.out.println("服务管理_服务的企业列表");
        String url = host+"/gateway/qhealth-op-admin-web/svr-manage/enterprise-list";
        System.out.println(url);
        HashMap<String,String> pars = new HashMap<String, String>();
        pars.put("id","3");
//        pars.put("svrCode","");
//        pars.put("type","1");
//        String pars = "{\"id\":\"69\",\"enterpriseId\":97}";
        String result = requests.doGet(url,pars);
        System.out.println(result);
    }
    @Test
    public void companymanagedetail(){
        System.out.println("获取服务详情");
        String url = host+"/gateway/qhealth-op-admin-web/svr-manage/detail";
        System.out.println(url);
        HashMap<String,String> pars = new HashMap<String, String>();
        pars.put("id","3");
//        pars.put("svrCode","");
//        pars.put("type","1");
//        String pars = "{\"id\":\"69\",\"enterpriseId\":97}";
        String result = requests.doGet(url,pars);
        System.out.println(result);
    }




}

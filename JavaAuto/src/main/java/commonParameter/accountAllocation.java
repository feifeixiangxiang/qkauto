package commonParameter;

import com.google.gson.JsonObject;
import commonClass.requests;
import org.testng.annotations.Test;

import java.util.HashMap;

public class accountAllocation {
    String host = "https://webxr-dev.doctorwork.com";
    @Test
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
        System.out.println(result);
    }
    @Test
    public void accountAlloctionadd(){
        System.out.println("账号分配_管理员新增");
        String url = host+"/gateway/qhealth-op-admin-web/administrator/add";
        System.out.println(url);
        JsonObject json = new JsonObject();

        String pars = "{\"enterpriseId\":97,\"branchId\":69,\"operator\":\"杨天\",\"account\":\"17313150062\",\"password\":\"123456\"}";
        String result = requests.doPostJson(url,pars);
        System.out.println(result);
    }

    @Test(enabled = false)
    public void accountAlloctiondelete(){
        System.out.println("账号分配_管理员删除");
        String url = host+"/gateway/qhealth-op-admin-web/administrator/delete";
        System.out.println(url);
//        HashMap<String,String> pars = new HashMap<String, String>();
//        pars.put("account","");
//        pars.put("pageNum","1");
//        pars.put("pageSize","10");
        String pars = "{\"userid\":710177090208530432}";
        String result = requests.doPostJson(url,pars);
        System.out.println(result);
    }


}

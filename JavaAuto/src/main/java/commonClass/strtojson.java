package commonClass;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class strtojson {

    public  static  String starjson(String a,String b){
        JSONObject jsonObject = JSON.parseObject(a);
        System.out.println(jsonObject);
        String companyid = jsonObject.getString(b);
        System.out.println(b+":"+companyid);
        return companyid;
    }

    public  static  String userid(String a,String b){
        JSONObject jsonone = JSON.parseObject(a);
        System.out.println(jsonone);
        JSONObject Jsondata = jsonone.getJSONObject("data");
        System.out.println(Jsondata);
        JSONArray list = Jsondata.getJSONArray("list");
//        System.out.println(list.toString());
         int len = list.size();
//         System.out.println(len);
         String id = list.getJSONObject(len-1).getString(b);
        return id;
    }



    public static void main(String[] args){
//        String aa = "{\"data\":{\"list\":[{\"employeeCount\":100,\"id\":93,\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"name\":\"自动化评论新增3\",\"remark\":\"评论数据\"},{\"employeeCount\":100,\"id\":92,\"logo\":\"https://avatar-qiniu.doctorwork.com/Fg6_0gVp34ZxkB-E_s8Qg7BCD5OT\",\"name\":\"小米1\",\"remark\":\"小米公司1\"},{\"employeeCount\":100,\"id\":91,\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"name\":\"1231312\",\"remark\":\"312312312\"},{\"employeeCount\":100,\"id\":90,\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"name\":\"???????2\",\"remark\":\"????\"},{\"employeeCount\":100,\"id\":89,\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"name\":\"???????1\",\"remark\":\"????\"},{\"employeeCount\":100,\"id\":88,\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"name\":\"???????\",\"remark\":\"????\"},{\"employeeCount\":1212,\"id\":87,\"logo\":\"https://avatar-qiniu.doctorwork.com/FmmokaEDKQZM4YRHpn_QjE9SWb_w\",\"name\":\"211\",\"remark\":\"1212\"},{\"employeeCount\":100,\"id\":79,\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"name\":\"滴滴出行\",\"remark\":\"????\"},{\"employeeCount\":500,\"id\":72,\"logo\":\"https://avatar-qiniu.doctorwork.com/FlMBRtijOXJLTvHKvocckvUWSFrc\",\"name\":\"测试权限1\",\"remark\":\"测试权限\"},{\"employeeCount\":500,\"id\":71,\"logo\":\"https://avatar-qiniu.doctorwork.com/FlMBRtijOXJLTvHKvocckvUWSFrc\",\"name\":\"测试权限\",\"remark\":\"测试权限\"}],\"pageNum\":1,\"pageSize\":10,\"totalCount\":11,\"totalPage\":2},\"errcode\":0,\"errmsg\":\"success\"}\n";
//        JSONObject jsonObject =  JSON.parseObject(aa);
//        System.out.println(jsonObject.getString("errcode").getClass().getName());
//
//        JSONObject cc = jsonObject.getJSONObject("data");
//        System.out.println(cc);
//        JSONArray dd = cc.getJSONArray("list");
//
//        System.out.println(dd);
//        System.out.println(dd.getJSONObject(0).getString("name"));

        String aaa= "{\"errcode\":0,\"data\":{\"totalPage\":1,\"pageSize\":10,\"list\":[{\"roleId\":\"710175756172394496\",\"roleName\":\"超级管理员\",\"stationName\":\"\",\"enterpriseName\":\"\",\"userId\":\"710177796084727808\",\"account\":\"17313150062\",\"operator\":\"杨天\"},{\"roleId\":\"710180253560995840\",\"roleName\":\"小站管理员\",\"stationName\":\"\",\"enterpriseName\":\"\",\"userId\":\"710180254852841472\",\"account\":\"18106227370\",\"operator\":\"三卡车1\"},{\"roleId\":\"710181750919135232\",\"roleName\":\"小站管理员\",\"stationName\":\"\",\"enterpriseName\":\"\",\"userId\":\"710181752320032768\",\"account\":\"18108227888\",\"operator\":\"企鹅火辣辣\"},{\"roleId\":\"710186431590432768\",\"roleName\":\"小站管理员\",\"stationName\":\"\",\"enterpriseName\":\"\",\"userId\":\"710186432571899904\",\"account\":\"18108227300\",\"operator\":\"任正非\"},{\"roleId\":\"710180253560995840\",\"roleName\":\"小站管理员\",\"stationName\":\"\",\"enterpriseName\":\"\",\"userId\":\"710214645859745792\",\"account\":\"18012356781\",\"operator\":\"成都分部\"},{\"roleId\":\"710236729818218496\",\"roleName\":\"超级管理员\",\"stationName\":\"\",\"enterpriseName\":\"\",\"userId\":\"710236731185561600\",\"account\":\"bai@baidu.com\",\"operator\":\"百百百\"},{\"roleId\":\"710175756172394496\",\"roleName\":\"超级管理员\",\"stationName\":\"\",\"enterpriseName\":\"\",\"userId\":\"710247278966734848\",\"account\":\"17313150063\",\"operator\":\"杨天\"}],\"totalCount\":7,\"pageNum\":1},\"errmsg\":\"success\"}";
        String BBB = "userId";
        String ccc = strtojson.userid(aaa,BBB);
        System.out.println(ccc);




//        System.out.println(jsonObject.getString(""));
//        JSONObject dd = JSON.parseObject(cc);
//        JSONArray array =dd.getJSONArray("list");
//        //输出返回状态吗
//        String errcode = jsonObject.getString("errcode");
//        System.out.println(errcode);
//        //输入返回状态值
//        String errmsg = jsonObject.getString("errmsg");
//        System.out.println(errmsg);
//
//        //输入JSON后的第一个
//        System.out.println(cc);
//
//        //获取json中的第一个list
//        System.out.println(array);
//
//        int a = array.size();
//        System.out.println("list长度"+a);
////        String abc = (String) array.getJSONObject(1).getString("name");
////        System.out.println(abc);
//
//        for (int i =0 ;i<array.size();i++){
//            String employeeCount = array.getJSONObject(i).getString("employeeCount");
//            System.out.println(employeeCount);
//            String id = array.getJSONObject(i).getString("id");
//            System.out.println(id);
//            String logo = array.getJSONObject(i).getString("logo");
//            System.out.println(logo);
//            String name = array.getJSONObject(i).getString("name");
//            System.out.println(name);
//            String remark = array.getJSONObject(i).getString("remark");
//            System.out.println(remark);
//
//        }






    }
}

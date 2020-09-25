package commonClass;

import java.util.Random;

public class random {
    //随机生成XX以下的数字一位
    public static int radomint(int a){
        Random radom = new Random();
        int strone = radom.nextInt(a);
        return  strone;
    }
    //随机生成4位码
    public  static String getCode() {
        StringBuffer code=new StringBuffer();
        int num;
        for (int i=0;i<4;i++){
            num=(int)(Math.random()*10);
            code.append(String.valueOf(num));
        }
        return code.toString();
    }
    //随机生成6位码
    public  static String getsexCode() {
        StringBuffer code=new StringBuffer();
        int num;
        for (int i=0;i<6;i++){
            num=(int)(Math.random()*10);
            code.append(String.valueOf(num));
        }
        return code.toString();
    }


    public static void main(String[] args){
        for (int i=0;i<10;i++){
            int  aa = random.radomint(10);
            System.out.println(aa);
            System.out.println("\n");
        }

//        String body = "{\"name\":\"自动化评论新增+aa\",\"remark\":\"评论数据\",\"logo\":\"https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W\",\"employeeCount\":\"100\"}";
//
//        int aa =random.radomint(1000);
//        System.out.println(aa);
//        HashMap<String,String> par = new HashMap<String, String>();
//        par.put("name","自动化评论新增99"+aa);
//        par.put("remark","评论数据");
//        par.put("logo","https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W");
//        par.put("employeeCount","100");
//        String bb = par.get("name");
//        String cc = par.toString();
//        System.out.println(bb);
//        System.out.println(cc);
//        //        jsonObject jsonObject = new JSONObject();
//        JsonObject json = new JsonObject();
//        json.addProperty("name","自动化评论新增"+aa);
//        json.addProperty("remark","评论数据");
//        json.addProperty("logo","https://avatar-qiniu.doctorwork.com/Fl15tFxq7xxBvZRHUftBO4Vz4v9W");
//        json.addProperty("employeeCount","100");

//        String dd = json.toString();
//        System.out.println(dd);

//        for (int i=0;i<par.size();i++){
//            String bb = par.get("name");
//        }
//

    }

}

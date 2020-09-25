package debug;


import org.json.JSONObject;

public class testsendmail {
    public  static void main(String[] args){
        JSONObject json = new JSONObject();
        json.put("name","123");
        json.put("id","4544");
        System.out.println(json.get("name"));

    }


}

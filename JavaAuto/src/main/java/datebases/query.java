package datebases;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class query {
    public static void main(String[] args){
        String sql = "select * from `ehm_user`.`user` where `phone` = '15982111370'";

        connectDatabases querysql = new connectDatabases();
        List<Map<String, Object>> res= null;
        res = querysql.connect(sql);
        Iterator<Map<String, Object>> it = res.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }}

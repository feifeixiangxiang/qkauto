package datebases;

import com.mysql.jdbc.Statement;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class connectDatabases {
    public static List<Map<String, Object>> connect(String sql){
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";

        String JDBC_URL = "jdbc:mysql://10.10.99.2:3306/ehm_user?useSSL=false&serverTimezone=UTC";
        String JDBC_NAME = "doctorwork_dev";

        String JDBC_PASSWORD = "NelFr4CKBow9jcw6kD2XXg";

        List<Map<String,Object>> I = new ArrayList<Map<String,Object>>();

        Connection connection = null;

        Statement statement = null;
        try {
            //注册驱动
            Class.forName(JDBC_DRIVER);
            //连接数据库
            connection = DriverManager.getConnection(JDBC_URL, JDBC_NAME, JDBC_PASSWORD);

            //实例化statment对象
            statement = (Statement) connection.createStatement();

            ResultSet res= statement.executeQuery(sql);

            ResultSetMetaData MD = res.getMetaData();

            int count = MD.getColumnCount();

            while(res.next()){
                Map<String,Object> rowData = new HashMap<String,Object>();
                for(int i =1;i<=count;i++){
                    rowData.put(MD.getColumnName(i),res.getObject(i));
                    I.add(rowData);
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return I;

    }
}

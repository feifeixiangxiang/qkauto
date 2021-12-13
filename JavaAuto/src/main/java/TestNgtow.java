import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestNgtow {

    public static class Test2 {
        public String time(){
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String D = dateFormat.format(date);
            return D;
        }
        @BeforeSuite
        public void suti(){
            System.out.println("BeforeSuite");
        }

        @Test
        public void aa(){
            String ti = new Test2().time();
            System.out.println(ti);
            System.out.println("test");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println("Got an exception!");
            }

        }
        @AfterTest
        public void bb(){
            String ti = new Test2().time();
            System.out.println(ti);
            System.out.println("aftertest");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println("Got an exception!");
            }
        }

        @BeforeTest
        public void cc(){
            String ti = new Test2().time();
            System.out.println(ti);
            System.out.println("BeforeTesttest");
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println("Got an exception!");
            }
        }
    }
}

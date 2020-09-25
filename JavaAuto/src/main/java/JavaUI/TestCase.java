package JavaUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.xml.bind.Element;

import static java.lang.Thread.sleep;

public class TestCase {
    public static void main(String[] args) throws InterruptedException {

        String URL = "https://webxr-qa.doctorwork.com/rapp/eoh/";

        System.setProperty("webdriver.chrome.driver",
                "/Users/yangfei/Desktop/Java/driver/chromedriver");
        //设置浏览器的参数
        ChromeOptions options = new ChromeOptions();
        //最大化浏览器
        options.addArguments("--test-type", "--start-maximized");
        options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        //打开浏览器
        WebDriver driver = new ChromeDriver(options);
        driver.get(URL);
        sleep(3000);
        //获取当前元素
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());

        //登录
        driver.findElement(By.id("userName")).sendKeys("17313150010");
        driver.findElement(By.id("password")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[4]/div/div/div/button")).click();
        sleep(2000);


//        //进入banner菜单
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/aside/div/ul/li[8]"));
//        element.click();
//        sleep(2000);
//
//        //添加banner
//        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/main/div/div/div/div[1]/div/div/button[1]"));
//        element1.click();
//        sleep(2000);
//
//        //添加banner名称
//        WebElement element2 = driver.findElement(By.id("bannerName"));
//        element2.sendKeys("autobaner");
//        //添加banner图片
//        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/main/div/div/div/div[2]/div/div/div/div/div/div[1]/div/form/div[2]/div[2]/div/div/span/div/span/input"));
//        element3.sendKeys("/Users/yangfei/Desktop/素材类/图片/u=4024418666,217421917&fm=26&gp=0.jpg");
//
//
//        //选择自定义
//        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"bannerType\"]/label[2]/span[1]/input"));
//        element4.click();
//        sleep(2000);
//
//        //保存banner
//        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/main/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/button"));
//        element5.click();
//        sleep(2000);


        Actions actions = new Actions(driver);
        Element element = driver.findElement("//*[@id=\"root\"]/div/section/aside/div/ul/li[1]");
        Element element1 = driver.findElement("//*[@id=\"root\"]/div/section/aside/div/ul/li[8]");
        actions.dragAndDrop(element1,element1);






        //退出浏览器
        try {
            sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}

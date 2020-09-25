package javaTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenDriver {
    public static void openDirver() {
        //设置浏览器的driver路径

        System.setProperty("webdriver.chrome.driver", "/Users/yangfei/Desktop/Java/driver/chromedriver");
//            System.setProperty("webdriver.chrome.driver", "/Users/yangfei/Desktop/Java/driver/chromedriver");
        //设置浏览器参数
        ChromeOptions options = new ChromeOptions();
        //最大化浏览器
        options.addArguments("--test-type", "--start-maximizad");
        //指定浏览器位置
        options.setBinary("Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        //打开浏览器
        WebDriver driver = new ChromeDriver(options);


    }

    public static void main(String[] args) {
        OpenDriver dri = new OpenDriver();
        dri.openDirver();
    }
}


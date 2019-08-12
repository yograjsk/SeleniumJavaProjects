package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class Sample {

        public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        String url = "http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login";

        driver.get(url);


    }

    public void setValues(By by, String value){
        driver.findElement(by).sendKeys(value);
    }

}

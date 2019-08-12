package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class Utils extends setupWebDriver{
    public void setValues(By by, String value){
        driver.findElement(by).sendKeys(value);
    }

    public void click(By by){
        driver.findElement(by).click();
    }

    public boolean selectFromDropdown(By by, String value){
        boolean flag = false;
        try{
            Select dropdown = new Select(driver.findElement(by));
            dropdown.selectByVisibleText(value);
            flag = true;
        }catch (Exception e){

        }
        return flag;
    }

    public boolean checkElementPresent(By by){
        boolean present = false;
        try{
            turnOffImpliciteWait();
            present = driver.findElement(by).isDisplayed();
        }catch (Exception e){
            turnOnImpliciteWait();
        }
        return present;
    }

    private void turnOnImpliciteWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private void turnOffImpliciteWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public boolean waitUntilElementPresent(){
        boolean present = false;

        try{
//            turnOffImpliciteWait();
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(30, TimeUnit.SECONDS)
                    .pollingEvery(5, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class);

        }catch (Exception e) {

        }
        return present;
    }


}

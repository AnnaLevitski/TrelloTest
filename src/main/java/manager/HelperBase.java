package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void pause(int time){
        wd.manage().timeouts().setScriptTimeout(time, TimeUnit.SECONDS);
    }
    private WebElement findElementBase(By locator){
        System.out.println(locator);
        return wd.findElement(locator);
    }
    private List<WebElement> findElementsBase(By locator){
        System.out.println(locator);
        return wd.findElements(locator);
    }
    public void typeBase(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        if(text!=null){
            element.sendKeys(text);
        }
    }
    public void clickBase(By locator){
        WebElement element = wd.findElement(locator);
        element.click();
    }

    public boolean isElementPresent(By locator){
       // wd.manage().timeouts().setScriptTimeout(1000, TimeUnit.SECONDS); //wtf
           System.out.println(findElementsBase(locator).isEmpty());
//        System.out.println(findElementsBase(locator).isEmpty());
        return !findElementsBase(locator).isEmpty();

    }
    public boolean isTextInElIsEqual(By locator, String text){
        WebElement el = findElementBase(locator);
        return el.getText().equals(text);
    }

}


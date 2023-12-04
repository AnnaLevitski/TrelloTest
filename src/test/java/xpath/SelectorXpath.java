package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectorXpath {
    WebDriver wd;

    @BeforeClass
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://trello.com/");
    }
    @Test
    public void test1(){
        System.out.println("test1");
        WebElement el = wd.findElement(By.xpath("//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']"));
        System.out.println(el.getText());
        WebElement el2 = wd.findElement(By.xpath("//*[text()='Get Trello for free' and @data-uuid]"));
        System.out.println(el2.getAttribute("class"));

        // We go down the tree    / - we go down one level       // - we go down by any amount
        WebElement el3 = wd.findElement(By.xpath("//main[@id='skip-target']/section[@class='UiSectionstyles__Section-sc-4xxafg-0 cDvxpF ui-section']//h1"));
        System.out.println(el3.getText());
        WebElement el4 = wd.findElement(By.xpath("//main/*[5]"));
        System.out.println("------> " + el4.getText());

        WebElement el5 = wd.findElement(By.xpath("//main/*[5]//div[contains(@class, 'ScrollBar')]"));
        System.out.println("------> " + el4.getClass());

        // go up the tree      .. - to the parent
        WebElement el6 = wd.findElement(By.xpath("//div[contains(@class, 'ScrollBar')]/../../.."));
        System.out.println("------> " + el4.getAttribute("id"));

    }
    @Test
    public void test2(){
        System.out.println("test2");

    }
    @AfterClass
    public void tearDown(){
        wd.quit();

    }
}

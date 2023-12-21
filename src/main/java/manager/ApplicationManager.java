package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    HelperUser helperUser;
    HelperBoard helperBoard;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/");
        helperUser = new HelperUser(wd);
        helperBoard = new HelperBoard(wd);

    }

    public HelperUser getHelperUser() {
        return helperUser;
    }

    public HelperBoard getHelperBoard() {
        return helperBoard;
    }

    public void stop(){

        wd.quit();
    }
}

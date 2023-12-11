package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    By buttonLogin = By.xpath("//*[]");
    public void clickButtonLogin(){
        clickBase(buttonLogin);
    }
}

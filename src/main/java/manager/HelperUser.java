package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    By buttonLogin = By.xpath("//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']");
    By inputLogin = By.cssSelector("#username");
    By inputPassword = By.cssSelector("#password");
    By buttonContinue = By.cssSelector("#login-submit");
    By buttonLoginSubmit = By.cssSelector("#login-submit");
    By buttonHederMemberMenu = By.xpath("//div[@data-testid='header-member-menu-avatar']");



    public void clickButtonLogin(){
        clickBase(buttonLogin);
    }

    public void login(String mail, String password) {
        clickBase(buttonLogin);
        typeBase(inputLogin, mail);

        clickBase(buttonContinue);
        typeBase(inputPassword, password);

        clickBase(buttonLoginSubmit);
    }
    public boolean isLogged(){
        return isElementPresent(buttonHederMemberMenu);
    }



}

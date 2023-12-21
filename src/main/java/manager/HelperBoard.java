package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HelperBoard extends HelperBase{
    public HelperBoard(WebDriver wd) {
        super(wd);
    }

    By buttonCreateNewBoard = By.cssSelector("div[class='board-tile mod-add']");
    By inputBoardTitle = By.xpath("//input[@data-testid='create-board-title-input']");

    By buttonCreateBoard = By.xpath("//button[@data-testid='create-board-submit-button']");

    By textBoardTitle = By.cssSelector("h1[data-testid='board-name-display']");

    public void createNewBoard(String title) {
        clickBase(buttonCreateNewBoard);
        System.out.println(2);
        typeBase(inputBoardTitle, title);
        System.out.println(3);
        clickBase(buttonCreateBoard);
        System.out.println(4);
    }
    public boolean isBoardTitleEquals(String text){
        wd.manage().timeouts().setScriptTimeout(300000, TimeUnit.SECONDS);
        System.out.println("--> "+wd.findElements(textBoardTitle));
       // wd.manage().timeouts().setScriptTimeout(200, TimeUnit.SECONDS);

        return isTextInElIsEqual(textBoardTitle, text);


    }

}

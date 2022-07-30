package Kadir.pageObjects;

import Kadir.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOutPage extends BrowserUtils {

    public logOutPage(){
        PageFactory.initElements(driver,this
        );
    }
    @FindBy(id = "userData")
    private WebElement userData;
    @FindBy(css = "[data-bind='click: logout']")
    private WebElement logOut;


    public void setLogOut(){
     Actions actions=new Actions(driver);
     actions.moveToElement(userData).click(logOut).build().perform();
    }
    public String getTitle(){
        return driver.getTitle();
    }


}

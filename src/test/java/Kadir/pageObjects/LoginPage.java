package Kadir.pageObjects;

import Kadir.utils.BrowserUtils;
import Kadir.utils.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BrowserUtils {


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "authUser")
    private WebElement userName;
    @FindBy(id = "clearPass")
    private WebElement password;
    @FindBy(css = "[name='languageChoice']:nth-child(1)")
    private WebElement selectLanguage;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(xpath = "//div[contains(text(),'Invalid username or password')]")
    private WebElement errorMessage;




    public void setUserName(){
        userName.sendKeys(ConfigurationReader.getProperties("userName"));
    }
    public void setPassword(){
        password.sendKeys(ConfigurationReader.getProperties("password"));
    }
    public void setSelectLanguage(String language){
        Select select=new Select(selectLanguage);
        select.selectByVisibleText(language);
    }
    public void setLoginButton(){
        loginButton.click();
    }
    public String getTitle(){
        return driver.getTitle();
    }

    public String setErrorMessage(){
        return errorMessage.getText();
    }
    public void invalidUsername(){
        userName.sendKeys("");
    }
    public void invalidPassword(){
        password.sendKeys("");
    }

}

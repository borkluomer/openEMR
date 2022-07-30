package Kadir.pageObjects;

import Kadir.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BrowserUtils {



    public AdminPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//div[contains(text(),'Admin')])[1]")
    private WebElement admin;
    @FindBy(xpath = "(//div[contains(text(),'Clinic')])[1]")
    private WebElement clinic;
    @FindBy(xpath = "(//div[contains(text(),'Facilities')])[1]")
    private WebElement facilities;
    @FindBy(xpath = "//h2[@class='clearfix']")
    private WebElement facilitiesText;
    @FindBy(name = "adm")
    private WebElement iframe;
    @FindBy(xpath = "//a[contains(text(),'Add Facility')]")
    private WebElement addFacilities;
    @FindBy(name = "facility")
    private WebElement name ;
    @FindBy(css = "#ncolor")
    private WebElement color ;





    public void setFacilities(){
        Actions actions=new Actions(driver);
        actions.click(admin).click(clinic).click(facilities).build().perform();

    }
    public String setFacilitiesText(){
        driver.switchTo().frame(iframe);
        return facilitiesText.getText();

    }
    public void setAddFacilities(){
        addFacilities.click();
    }
    public void setName(String setname){
        name.sendKeys(setname);
    }
    public void setColor(String setColor){
        color.sendKeys(setColor);
    }




}

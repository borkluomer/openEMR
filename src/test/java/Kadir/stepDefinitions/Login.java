package Kadir.stepDefinitions;

import Kadir.pageObjects.LoginPage;
import Kadir.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;

public class Login extends BrowserUtils {

   LoginPage loginPage=new LoginPage();

    @Given("User navigates to website")
    public void user_navigates_to_website() {
        System.out.println(driver.getTitle());
    }
    @When("user enters valid Username")
    public void user_enters_valid_username() {
        loginPage.setUserName();
    }
    @Then("user enters valid Password")
    public void user_enters_valid_password() {
        loginPage.setPassword();
    }
    @Then("user select {string}")
    public void user_select(String language) {
         loginPage.setSelectLanguage(language);
    }
    @Then("user click Login Button")
    public void user_click_login_button() {
          loginPage.setLoginButton();
    }
    @Then("User verifies Home Page Title as {string}")
    public void user_verifies_home_page_title_as(String title) {
        Assert.assertEquals(title,loginPage.getTitle());
    }
    @Test
    public void hello(){
        System.out.println("Hello");
    }
}

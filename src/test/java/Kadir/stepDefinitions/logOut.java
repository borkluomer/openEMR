package Kadir.stepDefinitions;

import Kadir.pageObjects.logOutPage;
import Kadir.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logOut extends BrowserUtils {

     logOutPage logOutPage=new logOutPage();
    @Given("User logOut when navigates to HomePage")
    public void user_log_out_when_navigates_to_home_page() {
         logOutPage.setLogOut();
    }

    @When("user navigates to login page with the title {string}")
    public void user_navigates_to_login_page_with_the_title(String loginTitle) {
        Assert.assertEquals(loginTitle,logOutPage.getTitle());
    }

}

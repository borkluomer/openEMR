package Kadir.stepDefinitions;

import Kadir.pageObjects.AdminPage;
import Kadir.utils.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Admin extends BrowserUtils {
AdminPage adminPage=new AdminPage();
    @When("user navigates to Admin\\/\\/clinic\\/Facilities")
    public void user_navigates_to_admin_clinic_facilities() {
       adminPage.setFacilities();
    }
    @When("User validates that user can see text as {string}")
    public void user_validates_that_user_can_see_text_as(String facilities) {
        Assert.assertEquals(facilities,adminPage.setFacilitiesText());
    }
}

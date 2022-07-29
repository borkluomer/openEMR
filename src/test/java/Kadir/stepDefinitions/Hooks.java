package Kadir.stepDefinitions;

import Kadir.utils.BrowserUtils;
import Kadir.utils.ConfigurationReader;
import Kadir.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BrowserUtils {

    @Before
    public void instantiateDriver() {
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(ConfigurationReader.getProperties("url"));

    }

    @After
    public void TearDown(Scenario scenario) {
        System.out.println("=========================================");
        if (scenario.isFailed()) {
            try {
                byte[] data=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(data,"image/png",scenario.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

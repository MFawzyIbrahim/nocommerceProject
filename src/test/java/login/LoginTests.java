package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTests {

    @Test
    public void TestSuccessfulLogin()
    {
        LoginPage loginPage =homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }

}

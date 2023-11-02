package SiteName.TestCases;

import SiteName.Pages.*;
import SiteName.Util.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    public LoginTest(){
        super();
    }

    @Test
    public void loginShouldSuccess() throws InterruptedException {
        BasePage basePage = new BasePage();
        basePage.clickLoginButton();
        LoginPage loginPage = new LoginPage();
        loginPage.clickUserEmailfld("");
        loginPage.clickNextbtn();
        loginPage.clickUserPasswordfld("");
        DashboardPage dashboardPage = loginPage.clickLoginbtn();
        VisaRecommendationTest visaRecommendationTest = new VisaRecommendationTest();
        visaRecommendationTest.visaRecommendationShouldSuccess();
        PaymentTest paymentTest = new PaymentTest();
        paymentTest.paymentShouldSuccess();

    }
}

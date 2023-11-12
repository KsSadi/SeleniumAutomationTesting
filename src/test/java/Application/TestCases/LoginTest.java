package Application.TestCases;

import Application.Pages.*;
import Application.Util.Base;
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
        loginPage.clickUserEmailfld(getEmail());
        loginPage.clickNextbtn();
        loginPage.clickUserPasswordfld(getPassword());

        DashboardPage dashboardPage = loginPage.clickLoginbtn();
        VisaRecommendationTest visaRecommendationTest = new VisaRecommendationTest();
        visaRecommendationTest.visaRecommendationShouldSuccess();
        PaymentTest paymentTest = new PaymentTest();
        paymentTest.paymentShouldSuccess();
    }
}

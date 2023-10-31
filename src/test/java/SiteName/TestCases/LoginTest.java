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
        loginPage.clickUserEmailfld("testcompanyapplicant1@gmail.com");
        loginPage.clickNextbtn();
        loginPage.clickUserPasswordfld("123456a@");
        DashboardPage dashboardPage = loginPage.clickLoginbtn();
        dashboardPage.VisaRecommendationbtn();
        dashboardPage.NewVisaRecommendationbtn();
        VisaListPage visaListPage = new VisaListPage();
        visaListPage.clickNewApplicationbtn();
        FormPage formPage = new FormPage();
        formPage.clickvisaTypebtn();
        formPage.clickeTypeChecked_1();
        formPage.clicknextbtn1();
        formPage.country();
        formPage.highCommision();
        formPage.clickempName("Test Company");
        formPage.clickempDesignation("Test Company Applica");
        formPage.clickbriefJobDescription("Test Company Applicant 1");
        formPage.clickempPhoto();
        formPage.clickempPassportNo("123456789");
        formPage.clickempPersonalNo("123456789");
        formPage.clickempSurname("Test");
        formPage.clickplaceOfIssue("Test Company Applicant 1");
        formPage.clickempGivenName("Test Company Applicant 1");
        formPage.clickempPlaceOfBirth("Dhaka");
        formPage.nationality();
        formPage.dateOfBirthday("31-Oct-2023");
        formPage.dateOfissue("31-Oct-2023");
        formPage.dateOfexpiry("31-Oct-2023");
        formPage.basicPaymentType();
        formPage.clickbasicLocalAmount("1000");
        formPage.basicCurrency();
        formPage.officeDivision();
        formPage.officeDistrict();
        formPage.officeThana();
        formPage.clickexOfficePostCode("1212");
        formPage.clickexOfficeAddress("Test Company Applicant 1");
        formPage.clickexOfficeTelephone("123456789");
        formPage.clickexOfficeMobileNo("123456789");
        formPage.clickexOfficeEmail("sadi@gmail.com");
        formPage.clicknextbtn2();

    }
}

package SiteName.TestCases;

import SiteName.Pages.DashboardPage;
import SiteName.Pages.LoginPage;
import SiteName.Util.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    public LoginTest(){
        super();
    }

    @Test
    public void loginShouldSuccess() throws InterruptedException {
        DashboardPage dashboardPage = new LoginPage()
                .clickUserEmailfld(getUserEmail())
                .clickUserPasswordfld(getPassword())
                .clickLoginbtn();
        Assert.assertTrue(dashboardPage.isDashboardtxt());
    }
}

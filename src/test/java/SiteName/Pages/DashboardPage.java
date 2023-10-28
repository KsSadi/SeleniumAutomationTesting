package SiteName.Pages;

import SiteName.Util.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Base {
    @FindBy(xpath = "//*[@id=\"formId\"]/div/div[3]/div/div/button")
    WebElement dashboardtxt;


    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isDashboardtxt(){
        return dashboardtxt.isDisplayed();
    }



}

package SiteName.Pages;

import SiteName.Util.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {

    @FindBy(name = "email")
    WebElement userEmailid;

    @FindBy(name = "password")
    WebElement userPasswordid;

    @FindBy(xpath = "//button[@class='theme_btn text-center w-100']")
    WebElement Loginbtn;

}

package Application.TestCases;

import Application.Util.Base;
import org.testng.annotations.Test;

public class MainTest extends Base {
    public MainTest(){
        super();
    }

    @Test
    public void mainTest() throws InterruptedException {
        LoginTest loginTest = new LoginTest();
        loginTest.loginShouldSuccess();

    }

}

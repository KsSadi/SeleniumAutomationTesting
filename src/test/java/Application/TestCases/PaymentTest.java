package Application.TestCases;

import Application.Pages.*;
import Application.Util.Base;
import org.testng.annotations.Test;

public class PaymentTest extends Base {

    public PaymentTest() {
        super();
    }

    @Test
    public void paymentShouldSuccess() throws InterruptedException {
       FormPage formPage = new FormPage();
        formPage.account();
        formPage.confirm();
        formPage.accountNo(getAccountNumber());
        formPage.accountName(getAccountName());
        formPage.accountMobile(getAccountMobile());
        formPage.accountNext();
        formPage.otp(getPaymentOtp());
        formPage.otpConfirm();
    }
}

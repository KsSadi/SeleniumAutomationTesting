package Application.Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base  {
    private Properties properties;
    public static WebDriver driver;
    //Url
    public String getUrl(){
        return properties.getProperty("url");
    }
    //Browser
    public String getbrowser(){
        return properties.getProperty("browser");
    }
    //Login Credentials
    public String getEmail(){
        return properties.getProperty("mail");
    }
    public String getPassword(){
        return properties.getProperty("password");
    }
    //Payment Credentials
    public String getAccountNumber(){
        return properties.getProperty("account_number");
    }
    public String getAccountName(){
        return properties.getProperty("account_name");
    }
    public String getAccountMobile(){
        return properties.getProperty("account_mobile");
    }
    public String getPaymentOtp(){
        return properties.getProperty("otp");
    }

    public Base(){
        try {
            String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
            properties = new Properties();

            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @BeforeMethod
    public void browserSetup(){

        String browserName = getbrowser();
        if (browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("headless")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setHeadless(true);
            driver = new FirefoxDriver(firefoxOptions);
        }
        driver.get(getUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

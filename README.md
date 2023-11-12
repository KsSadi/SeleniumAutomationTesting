<p align="center"><a href="https://www.selenium.dev" target="_blank"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="150"></a></p>


## #About Selenium
Selenium is like a smart tool that helps test websites or web apps automatically. It can pretend to be a person clicking on links, filling out forms, and checking if things work on a website. So, instead of a human tester doing these tasks, Selenium does it for them. It's great because it works with many different web browsers and computers. Plus, it's free and lots of people use it, so it's really popular in the testing world. With Selenium, you can make sure websites work properly without having to click around yourself. It's like having a robot helper for website testing!




## #Requirements

### Integrated Development Environment (IDE):
Select an IDE like Eclipse or IntelliJ IDEA for writing and managing your automation scripts in Java. These IDEs provide powerful features, code highlighting, and debugging capabilities.
Download and install the latest version of Eclipse or IntelliJ IDEA.
* Download : [IntelliJ IDEA](https://www.jetbrains.com/idea/download)

### Java Development Kit (JDK):
Ensure that you have the Java Development Kit (JDK) installed on your system. Selenium with Java relies on Java libraries to interact with web elements and execute test scripts.
* You can download the latest version of JDK from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html). or,
* Download [JDK 11](https://www.oracle.com/java/technologies/javase-downloads.html).

## #Dependencies For Selenium WebDriver:
Selenium WebDriver is a collection of open-source APIs that are used to automate the testing of a web application. It supports many browsers such as Firefox, Chrome, IE, and Safari. Selenium WebDriver is the successor to Selenium RC and is used to carry out tests on various browsers. It is also used to simulate user interaction by entering text into text fields, selecting checkboxes, and clicking on buttons. Selenium WebDriver is a collection of open-source APIs that are used to automate the testing of a web application. It supports many browsers such as Firefox, Chrome, IE, and Safari. Selenium WebDriver is the successor to Selenium RC and is used to carry out tests on various browsers. It is also used to simulate user interaction by entering text into text fields, selecting checkboxes, and clicking on buttons.

```sh
dependencies {
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    testImplementation 'org.seleniumhq.selenium:selenium-java:4.10.0'

    // https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation 'io.github.bonigarcia:webdrivermanager:5.4.1'

    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation 'org.testng:testng:7.8.0'
}
```
* Use those dependencies in your `build.gradle` file.
*  Also use TestNG for testing purpose in your `build.gradle` file.
  ```sh 
test {
   useTestNG()
   }
```

## Find Element Using Selenium WebDriver:
Selenium WebDriver provides a variety of methods to locate elements on a web page. These methods are called locators. Locators are used to find and match the elements of a web page that we want to interact with. The following are the most commonly used locators in Selenium WebDriver:
* ID
```sh
driver.findElement(By.id("id"));
```
* Name
```sh
driver.findElement(By.name("name"));
```
* Class Name
```sh
driver.findElement(By.className("class"));
```
* Tag Name
```sh
driver.findElement(By.tagName("tagname"));
```
* Link Text
```sh
driver.findElement(By.linkText("linktext"));
```
* Partial Link Text
```sh
driver.findElement(By.partialLinkText("partiallinktext"));
```
* CSS Selector
```sh
driver.findElement(By.cssSelector("cssselector"));
```
* XPath
```sh
driver.findElement(By.xpath("xpath"));
```
## #Some Useful Code Snippets:
* To open a browser:
```sh
WebDriver driver = new ChromeDriver();
```
* To open a URL:
```sh
driver.get("https://www.google.com");
```
* To maximize the browser window:
```sh
driver.manage().window().maximize();
```
* To get the title of the page:
```sh
driver.getTitle();
```
* To get the current URL:
```sh
driver.getCurrentUrl();
```
* To get the page source:
```sh
driver.getPageSource();
```
* To close the browser:
```sh
driver.close();
```
* To quit the browser:
```sh
driver.quit();
```
* To navigate to a URL:
```sh
driver.navigate().to("https://www.google.com");
```
* To navigate back:
```sh
driver.navigate().back();
```
* To navigate forward:
```sh
driver.navigate().forward();
```
* To refresh the page:
```sh
driver.navigate().refresh();
```
* Scroll down the page:
```sh
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
```
* Scroll up the page:
```sh
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,-1000)");
```
* To get the text of an element:
```sh
driver.findElement(By.id("id")).getText();
```
* To get the attribute value of an element:
```sh
driver.findElement(By.id("id")).getAttribute("attribute");
```
## #Some Functions :
* Input Text Field :
```sh
 public FormPage officeAddress(String OfficeAddress) throws InterruptedException {
        WebElement officeAddress = driver.findElement(By.name("office_address"));
        foreignExecutive.isDisplayed();
        foreignExecutive.clear();
        foreignExecutive.sendKeys(OfficeAddress);
        return this;
    }
```
* Click Button :
```sh
public FormPage clickSubmitButton() throws InterruptedException {
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        return this;
    }
```
* Select Dropdown :
```sh
public FormPage country() throws InterruptedException {   
        WebElement country_dropdown = driver.findElement(By.id("country_id"));
        Select objSelect = new Select(country_dropdown);
        objSelect.selectByValue("2"); //Select by value
        Thread.sleep(2000); //Wait 2 Seconds
        return this;
    }
```
* Upload File :
```sh
public FormPage passportUpload() throws InterruptedException {
    WebElement passportUpload = driver.findElement(By.xpath("//*[@id=\"file11\"]"));
    String relativeFilePath = "/src/test/java/Application/File/file.pdf";
    String projectFolderPath = System.getProperty("user.dir");
    String absoluteFilePath = projectFolderPath + relativeFilePath;
    passportUpload.sendKeys(absoluteFilePath);
    Thread.sleep(5000); // Wait 5 seconds (you may consider using explicit waits instead)
    
  return this;
}
```

## #How to run the test:
* Clone the repository.
* Open the project in IntelliJ IDEA.
* Update user credentials and Base URL in `src/test/resources/config.properties` file.
* Run the test from `src/test/java/Application/TestCases` folder.

## #Tutorial:
* View [Presentation](https://www.guru99.com/selenium-tutorial.html)
* Selenium Tutorial for Beginners: [Part-1](https://www.youtube.com/watch?v=8hjNG9GZGnQ)
* Selenium Tutorial for Beginners: [Part-2](https://www.youtube.com/watch?v=8hjNG9GZGnQ)

## #About Me:
* Name: Md. Khaled Saifullah Sadi
* Email: mdsadi4@gmail.com
* LinkedIn: [Khaled Saifullah Sadi](https://www.linkedin.com/in/kssadi)
* Github: [KsSadi](https://github.com/KsSadi)
* Facebook: [Khaled Saifullah Sadi](https://www.facebook.com/sadi.bd)

package stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class conversationpost {
    WebDriver driver;

    @Given("^User is on ADDA Resident page$")
    public void User_is_on_ADDA_Resident_page() throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adda.io/login");
        driver.findElement(By.xpath("//input[@id='loginEmail']")).sendKeys("thomastiju@yahoo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("adda1234");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Sign In ')]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }

   /* @When("^User click on fab icon to select conversation$")
    public void user_click_on_fab_icon_to_select_conversation() {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='new-button-id' and @class='fab hidden-xs mfb-component--br mfb-zoomin mfb-component--br mfb-zoomin']")));
            driver.findElement(By.xpath("//ul[@id='new-button-id' and @class='fab hidden-xs mfb-component--br mfb-zoomin mfb-component--br mfb-zoomin']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/myadda-banner[1]/div[3]/div[2]/div[2]/ui-view[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")));
            driver.findElement(By.xpath("//body/div[1]/myadda-banner[1]/div[3]/div[2]/div[2]/ui-view[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
        }catch (Exception e){
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click;",driver.findElement(By.xpath("//ul[@id='new-button-id']")));
            jse.executeScript("arguments[0].click;",driver.findElement(By.xpath("//body/div[1]/myadda-banner[1]/div[3]/div[2]/div[2]/ui-view[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")));
            }
        }**/


    @When("^User enter title and description$")
    public void user_enter_title_and_description(DataTable credential) throws InterruptedException {
        List<Map<String, String>> data1 = credential.asMaps(String.class, String.class);
        for (Map<String, String> data : data1) {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(driver, 60);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='new-button-id' and @class='fab hidden-xs mfb-component--br mfb-zoomin mfb-component--br mfb-zoomin']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/myadda-banner[1]/div[3]/div[2]/div[2]/ui-view[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='topic-1' and @name='topic']")));
            driver.findElement(By.xpath("//input[@id='topic-1' and @name='topic']")).sendKeys(data.get("title"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class='text-editor ng-pristine ng-untouched ng-isolate-scope ng-pending']")));
            driver.findElement(By.xpath("//textarea[@class='text-editor ng-pristine ng-untouched ng-isolate-scope ng-pending']")).sendKeys(data.get("description"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[contains(@class,'blue-button')]")).click();
            Thread.sleep(3000);


        }

    }

    @Then("^close the Browser$")
    public void close_the_Browser() {
        driver.quit();

    }
}


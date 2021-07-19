package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginstepdef {
WebDriver driver;

    @Given("^user is on OrangeHrm Login Page$")
    public void user_is_on_OrangeHrm_Login_Page(){

        System.setProperty("webDriver.chrome.driver","/Users/addauser/IdeaProjects/cucumberdemo/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }
    @When("^page title is OrangeHrm$")
    public void page_title_is_OrangeHrm(){
       String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title);

    }
    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password){
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button(){
        driver.findElement(By.id("btnLogin")).click();
    }
}

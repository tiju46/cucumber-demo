package stepdefinition;

import basepack.base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class dropdwondef {
  WebDriver driver;

    @Given("^User is on Automationpractise website$")
    public void user_is_on_Automationpractise_website() throws InterruptedException {
        System.setProperty("webDriver.chrome.driver","/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adda.io/login");
        driver.findElement(By.xpath("//input[@id='loginEmail']")).sendKeys("thomastiju@yahoo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("adda1234");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Sign In ')]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);



    }
   @When("^User opens tshirt page$")
    public void user_opens_tshirt_page(){
       WebDriverWait wait = new WebDriverWait(driver, 60);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='facilities-tab']")));
       driver.findElement(By.xpath("//li[@id='facilities-tab']")).click();
//      WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/myadda-banner[1]/div[3]/div[2]/div[2]/div[1]/ul[1]/div[1]/div[1]/li[6]"));
//      element.click();

    }

    @Then("^prints dropdown values in ascending order$")
    public void prints_dropdown_values_in_ascending_order(){
        WebDriverWait wait1 = new WebDriverWait(driver,60);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='fac_name']")));
       WebElement element = driver.findElement(By.xpath("//select[@id='fac_name']"));
       /* Select select = new Select(element);
        List<String> Originallist = new ArrayList();
        for(WebElement value : select.getOptions()){
            Originallist.add(value.getText());
            //System.out.println(Originallist);
             }
        List<String> templist= Originallist;
        Collections.sort(templist, Collections.<String>reverseOrder());
        System.out.println(templist);
        //Assert.assertEquals(templist,Originallist);
        if(templist == Originallist){
            System.out.println("Values are not in Ascending order");
        }else{
            System.out.println("Descending order");
        }**/
       Select select = new Select(element);
       select.selectByValue("3190");



    }
    @Then("^close Browser$")
    public void close_Browser() {
        driver.quit();

    }
}

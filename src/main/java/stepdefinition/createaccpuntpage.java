package stepdefinition;

import basepack.base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class createaccpuntpage extends base {
   basepack.base bs = new base();
   // createaccpuntpage create = new createaccpuntpage();


    @Given("^user is on sign in page$")
    public void user_is_on_sign_in_page() throws Throwable {
        bs.setup();
        //create.setup();

    }

    @When("^user enters email address$")
    public void user_enters_email_address(DataTable email) throws Throwable {
       List<List<String>> data = email.raw();
        driver.findElement(By.id("email_create")).sendKeys(data.get(0).get(0));

    }

    @Then("^user clicks on Create an Account button$")
    public void user_clicks(){
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]")).click();
    }



}

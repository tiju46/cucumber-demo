package basepack;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;

public class base {

    public final WebDriver driver = new ChromeDriver();


    public void setup() throws IOException {
        System.setProperty("webDriver.chrome.driver","/Users/addauser/IdeaProjects/cucumberdemo/chromedriver/chromedriver");
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        TakesScreenshot take = ((TakesScreenshot)driver);
        File srcfile = take.getScreenshotAs(OutputType.FILE);
        File dstfile = new File("/Users/addauser/IdeaProjects/cucumberdemo/chromedriver/test.png");
        FileUtils.copyFile(srcfile,dstfile);
        }

        public void newSetup() {
//        System.setProperty("webDriver.chrome.driver", "/usr/bin/safaridriver");
//        driver = new SafariDriver();
            System.setProperty("webDriver.chrome.driver","/usr/local/bin/chromedriver");
            //driver = new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");


        }

}


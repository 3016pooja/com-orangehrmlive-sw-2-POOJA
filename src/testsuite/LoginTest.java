package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
      //find Username filed and enter Admin
        WebElement emailField= driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");
        //find password field and enter Admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //verify Dashboard Text
        String expectedMessage="Dashboard";
        WebElement actualtextMessage=driver.findElement(By.xpath("//span[text()='Dashboard']"));
        String actualMessage=actualtextMessage.getText();
        //Validate actual and expected message
        Assert.assertEquals("you are not Logged in ",expectedMessage,actualMessage);


    }
    @After
    public  void testDown(){
        //closeBrowser();
    }
}


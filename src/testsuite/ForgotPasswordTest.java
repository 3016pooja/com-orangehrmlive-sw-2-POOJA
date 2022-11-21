package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on Forgot Password Button
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
     //Verify the text ‘Reset Password’
        String expectedMessage="Reset Password";
        WebElement actualtextMessage=driver.findElement(By.xpath("//button[@type='submit']"));
        String actualMessage=actualtextMessage.getText();
        //Validate actual and expected message
        Assert.assertEquals("you are not Logged in ",expectedMessage,actualMessage);
    }
    @After
    public void testDown(){
       // closeBrowser();
    }
}

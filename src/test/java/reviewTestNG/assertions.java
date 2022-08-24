package reviewTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class assertions {

    //open the Browser
    //enter your name
    //hit submit
    //get the name and make sure it is what u entered
    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        String url="https://demoqa.com/text-box";
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test
    public void Task1(){
        WebElement userName= driver.findElement(By.xpath("//input[@id='userName']"));
        userName.sendKeys("Keroles");
        WebElement sumbitBT= driver.findElement(By.xpath("//button[@id='submit']"));
        sumbitBT.click();
        WebElement textFromOT= driver.findElement(By.xpath("//p[@id='name']"));
        String actualRes=textFromOT.getText();
        //System.out.println("actualRes = " + actualRes);
        String expectedRes="Name:Keroles";

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualRes, expectedRes);
       // softAssert.assertAll();
        WebElement emailB= driver.findElement(By.xpath("//label[@id='userEmail-label']"));
        String actualEmail=emailB.getText();
        String expectedEmail="Email";
        softAssert.assertEquals(actualEmail, expectedEmail);
        softAssert.assertAll();



    }



}

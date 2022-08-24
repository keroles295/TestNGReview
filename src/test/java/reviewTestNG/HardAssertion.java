package reviewTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class HardAssertion {
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
        Assert.assertEquals(actualRes, expectedRes);
        WebElement emailB= driver.findElement(By.xpath("//label[@id='userEmail-label']"));
        String actualEmail=emailB.getText();
        String expectedEmail="Email";
        Assert.assertEquals(actualEmail, expectedEmail);



    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("aaaaaaaaaaaa before class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("aaaaaaaaaaaaaaaaaa Iam AFTER TEST");
    }



}



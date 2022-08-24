package reviewTestNG;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Iam before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Iam AFTER Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Iam before TEST");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Iam AFTER TEST");
    }

    @BeforeClass
    public void  beforeClass(){
        System.out.println("Iam before Classsssssssssssssss");
    }
    @AfterClass
    public void  afterClass(){
        System.out.println("Iam Afteeeeeeeeeeeeeeeeeeeer Classsssssssssssssss");
    }

    @BeforeMethod
    public void  beformathod(){
        System.out.println("Iam A Before Method");
    }

    @Test
    public void Test1(){
        System.out.println("I am Test1");
    }
    @Test
    public void Test2(){
        System.out.println("I am Test2");
    }
    @AfterMethod
    public void aferMethod(){
        System.out.println("Iam After Method");
    }
}

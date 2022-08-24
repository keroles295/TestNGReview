package reviewTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
   public void onTestSuccess(ITestResult result){
        System.out.println("Hol the test is successful :"+result.getName());
    }
    public void onTestFailure(ITestResult result){
        System.out.println("Hol the test is failed :"+result.getName());
    }
}

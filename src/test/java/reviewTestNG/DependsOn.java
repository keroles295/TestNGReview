package reviewTestNG;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println("I am a beatiful Test");
        System.out.println(0/0);
    }
    @Test(dependsOnMethods = "login")
    public void dashBord(){
        System.out.println("I am a beatiful Dash Board");
    }
}

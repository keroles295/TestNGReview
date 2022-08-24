package reviewTestNG;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3)
    public void Atest(){
        System.out.println("I am Atest");
    }
    @Test(priority = 2)
    public void Btest(){
        System.out.println("I am Btest");
    }
    @Test(priority = 1)
    public void Ctest(){
        System.out.println("I am Ctest");
    }
}

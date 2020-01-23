import org.testng.annotations.*;

public class TestClass {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("before class method");
    }

    @BeforeMethod
    public void a() {
        System.out.println("Executing before method with testNG");
    }

    @Test
    public void trialTest() {
        System.out.println("Executing in Test ");
    }

    @AfterMethod
    public void trialTestFinish() {
        System.out.println("Executing after test");
    }

    @AfterClass
    public void afterClassMethod() {
        System.out.println("Executing after class");
    }
}

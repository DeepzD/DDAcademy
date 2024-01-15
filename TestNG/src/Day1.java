import org.testng.annotations.*;

public class Day1 {

    @BeforeMethod
    public void UseridGeneration()
    {
        System.out.println("This block executes before each Test");
    }
    @BeforeTest
    public void Cookies()
    {
        System.out.println("This block executes Before all  Testcases");
        //delete cookies
    }
    @AfterTest
    public void Cookiesclose()
    {
        System.out.println("This block executes after all  Testcases");
        //close the browesers
    }
    @AfterMethod
    public void Reportadding()
    {
        System.out.println("This block executes after each Test");
    }

    @Test
    public void demo()
    {
        System.out.println("Demo Test");
    }

    @Test
    public void demoOne()
    {
        System.out.println("Demo ONE Test");
    }
//
//    @Test
//    public void demoTwo()
//    {
//        System.out.println("Demo TWO Test");
//    }
}

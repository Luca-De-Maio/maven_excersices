import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DirectorySearch {
    WebDriver driver;

    @BeforeClass
    public void setUp ()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Open Chrome & Application");
    }

    @Test
    public void signIn () {
        WebElement textUserName = driver.findElement(By.id("txtUsername"));
        Highlighter.highlightElement(driver, textUserName);

    }
}

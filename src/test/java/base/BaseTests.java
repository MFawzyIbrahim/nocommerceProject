package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import reader.ReaderDataFromJson;

import java.io.FileNotFoundException;

public class BaseTests {
    WebDriver driver;
    protected HomePage homePage;
    protected ReaderDataFromJson readerDataFromJson;
    @BeforeClass
    public void setUp() {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() throws FileNotFoundException {
        readerDataFromJson=new ReaderDataFromJson();
        driver.get(readerDataFromJson.readerJsonFile().URL);
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}

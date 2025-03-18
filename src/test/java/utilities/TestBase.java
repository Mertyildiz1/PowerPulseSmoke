package utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {
        bekle(3);
        //driver.quit();
    }

    // Hard Wait
    public void bekle(int saniye) {
        try {
            Thread.sleep(1000*saniye);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

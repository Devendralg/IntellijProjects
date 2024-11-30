import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumTest {


    @Test
    public void launchBrowser()
    {
        System.out.println("Hell0 selenium");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> list=driver.findElements(By.xpath("//a"));
        for (WebElement w:list)
        {
            System.out.println(w.getText());
        }
    }
    @Test
    public void amazonLaunch()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
    }
}

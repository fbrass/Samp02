import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.xml.ws.WebEndpoint;

/**
 * Created by said on 15.04.2015.
 */
public class GoogleSearchTest {

    public GoogleSearchTest(){

    }

    @Test
    public void main(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("SPQR Informatik GmbH");
        searchBox.submit();

        //close browser with
        //driver.quit();
    }
}

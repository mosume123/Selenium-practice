import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Mitu/Desktop/ch/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("184 Cherry Lane, Floral Park, NY, USA");
        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        driver.quit();
    }
}

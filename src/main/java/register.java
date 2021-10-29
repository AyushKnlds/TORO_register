import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {
    public static void main(String[] args){
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:/Users/ayush/Downloads/Compressed/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://secured.3tlstaging.com/signup");

        driver.findElement(By.id("fname")).sendKeys("Ayush");
        driver.findElement(By.id("lname")).sendKeys("xyz");
        driver.findElement(By.id("email")).sendKeys("ayush35@knol.com");
        driver.findElement(By.id("confirmEmail")).sendKeys("ayush35@knol.com");
        driver.findElement(By.id("password")).sendKeys("knol123@");
        driver.findElement(By.id("comfirmPassword")).sendKeys("knol123@");

        driver.quit();
    }
}

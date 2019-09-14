package seleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "/Users/fortunecookie/IdeaProjects/PntClass_July2019/browser-driver/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("USBC CABLE");
        driver.findElement(By.cssSelector(".nav-input"));


        driver.close();

    }
}

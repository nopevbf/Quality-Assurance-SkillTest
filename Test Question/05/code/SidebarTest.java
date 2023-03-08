// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SidebarTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void sidebar() {
    driver.get("https://www.demoblaze.com/index.html");
    driver.manage().window().setSize(new Dimension(1074, 618));
    driver.findElement(By.id("itemc")).click();
    driver.findElement(By.id("itemc")).click();
    driver.findElement(By.linkText("Sony xperia z5")).click();
    driver.findElement(By.cssSelector(".active > .nav-link")).click();
    driver.findElement(By.linkText("Laptops")).click();
    driver.findElement(By.linkText("MacBook Pro")).click();
    driver.findElement(By.cssSelector(".active > .nav-link")).click();
    driver.findElement(By.linkText("Monitors")).click();
    driver.findElement(By.linkText("ASUS Full HD")).click();
    driver.findElement(By.cssSelector(".active > .nav-link")).click();
    driver.close();
  }
}

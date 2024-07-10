package Test;
import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Loginpage;

import static org.testng.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

	public class RULETEST {
	  public WebDriver driver;
	  public String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.get("https://app.myiq.ai/");
			driver.manage().window().maximize();
			Loginpage login = new Loginpage(driver);
			String newuserbusinessemail1 ="admintesting@iqai.shop";
			login.setBusiness_email(newuserbusinessemail1);
			String userPassword1 ="Test@123";
			login.setPwd(userPassword1);
			login.login_bt();
	
			// baseUrl = "https://www.blazedemo.com/";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testRuletestSelenium() throws Exception {
	    // Label: Test
	    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 772,815 | ]]
	    //driver.get("https://app.myiq.ai/admin-setting");
		  System.out.println("hi isai");
		driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[2]/button[3]"))	.click();
		driver.findElement(By.xpath("//a[normalize-space()='Settings']")).click();
		driver.findElement(By.xpath("//a[@href='/invoice-rule']")).click();
		
	    //driver.findElement(By.xpath("//*[text() = \"Effortlessly manage invoice assignments using Rule Master. Automate tasks by setting custom filters based on value, vendor names, and more, streamlining workflow with precision.\"]")).click();
	    driver.findElement(By.xpath("//button[@title = \"To create new Rule\"]")).click();
	    //driver.findElement(By.xpath("//*[contains(text(), \"Dashboard\")]")).click();
	    driver.findElement(By.xpath("//*[text() = \"Vendor Name\"]")).click();
	   // driver.findElement(By.xpath("//*[contains(text(), \"Dashboard\")]")).click();
	    driver.findElement(By.xpath("//*[text() = \"Starts with\"]")).click();
	    driver.findElement(By.xpath("//input[@placeholder = \"Input Value and Enter\"]")).click();
	    driver.findElement(By.id("tags-filled")).clear();
	    driver.findElement(By.id("tags-filled")).sendKeys("A");
	    driver.findElement(By.xpath("//input[@placeholder = \"Rule Name\"]")).click();
	    driver.findElement(By.xpath("//input[@placeholder = \"Rule Name\"]")).clear();
	    driver.findElement(By.xpath("//input[@placeholder = \"Rule Name\"]")).sendKeys("RULE TEST_1");
	    driver.findElement(By.xpath("//button[@title = \"Save\"]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}




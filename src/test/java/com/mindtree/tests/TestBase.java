package com.mindtree.tests;

import java.io.FileReader;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.StaleElementReferenceException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mindtree.stepdef.AddToCartStepDef;
import com.mindtree.stepdef.Hooks;
import com.mindtree.stepdef.LoginStepDef;
import com.mindtree.utility.TestUtility;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriverWait wait;
	public static ExtentReports extentReport;
	public static ExtentHtmlReporter htmlReport;
	public static String ApplicationURL = "";

	public void waitAndClick(WebElement element) {
		boolean clicked = false;
		this.wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(600));
		int attemps = 0;
		while (!clicked && attemps <= 10) {
			try {
				this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
				System.out.println("=========Clicked on given locator=========");
				clicked = true;
			} catch (Exception e) {
				System.out.println("=======unable to wait and click on given locator============");
			}
			attemps++;
		}
	}

	public static WebDriver getDriver(String string) {
		WebDriver driver;
		if (string.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		} else if (string.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver();
			driver = new ChromeDriver();
			return driver;
		} else if (string.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else
			driver = null;
		return driver;

	}

	public static ExtentReports startReport() {
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		htmlReport = new ExtentHtmlReporter("./ExtentReports/report  " + date.format(new Date()) + "ExtentReport.html");
		extentReport = new ExtentReports();
		extentReport.attachReporter(htmlReport);
		return extentReport;

	}

	public static void ReadProperties() throws Exception {
		FileReader read = new FileReader(
				System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
		Properties properties = new Properties();
		properties.load(read);

		LoginStepDef.userName = properties.getProperty("Username");
		LoginStepDef.Password = properties.getProperty("Password");
		Hooks.screenshotPath = properties.getProperty("screenShotpath");
		Hooks.failedScreenshotPath = properties.getProperty("failedscreenshotpath");
		Hooks.browserSelection = properties.getProperty("browserSelection");
		AddToCartStepDef.cardNumber = properties.getProperty("cardNumber");

	}

	public static void applyWeight(Duration time, WebDriver driver) throws Exception {

		driver.manage().timeouts().implicitlyWait(time);
	}

	public void sendData(WebElement searchBox, String data) {
		this.wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(60));
		try {
			this.wait.until(ExpectedConditions.visibilityOf(searchBox));
			searchBox.clear();
			searchBox.sendKeys(data);
			System.out.println("============data send sccesfully============");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void actionMoveAndClick(WebElement element) {
		Actions ac = new Actions(Hooks.driver);
		this.wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
			ac.moveToElement(element).click().build().perform();
			System.out.println("=====clicked sccessflly by action move and click======");
		} catch (StaleElementReferenceException e) {
			WebElement elementClick = element;
			Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(elementClick)).isEnabled();
			if (elementPresent == true) {
				ac.moveToElement(elementClick).click().build().perform();
				System.out.println("=====staleException & moved and clicked sccessflly by action=====");
			}
		} catch (Exception e) {
			System.out.println("===== unable to click======");
			Assert.fail("unable to click on element " + e.getMessage());

		}
	}

	public void SelectValueFromDropDown(WebElement element, String selector) {
		this.wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

		try {
			Select dropdown = new Select(element);
			dropdown.selectByValue(selector);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void jSClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
		js.executeScript("arguments[0].click", element);
	}

	public void isDisplayed(WebElement logOutIcon) {
		logOutIcon.isDisplayed();

	}

	public void wait(int sec) {
		WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(sec));
	}

	public void creatingExtentReport(ExtentTest extentTest, WebDriver driver, String screenshotPath,
			String failedScreenshotPath, Scenario scenario) throws Exception {
		String file = TestUtility.takeScreenshot(driver, screenshotPath);
		extentTest.addScreenCaptureFromPath(file);
		if (scenario.isFailed()) {
			String failedOnes = TestUtility.takeScreenshot(driver, failedScreenshotPath);
		}

	}
}
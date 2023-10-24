package org.junit;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		driver = new EdgeDriver();
		return driver;

	}
	public static void maximizeWnd() {
	driver.manage().window().maximize();

	}
	public static void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
	}
	public static void loadurl(String url) {
		driver.get(url);

	}
	public static void enterValue(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void elementClick(WebElement element) {
		element.click();

	}
	public static void selectOption(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	public static void selectOption1(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	public static void selectOption2(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	public static void selectOption3(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void clearIndate(WebElement element) {
		element.clear();

	}
	public static void enterIndate(WebElement element, String data) {
		element.sendKeys(data);

	}
	public static void clearOutdate(WebElement element) {
		element.clear();

	}
	public static void enterOutdate(WebElement element, String data) {
		element.sendKeys(data);

	}
	public static void selectOption4(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectOption5(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void elementSearch(WebElement element) {
		element.click();

	}

	public static void radioButton(WebElement element) {
		element.click();

	}
	public static void elementCont(WebElement element) {

		element.click();
	}
	public static void enterFname(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void enterLname(WebElement element, String data) {
		element.sendKeys(data);
		
	}
	public static void enterAdd(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void enterCCno(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void selectTypeption(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectEdate(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectYear(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void enterCVV(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void btnBook(WebElement element) {
		element.click();

	}
	public static void implicitWait1(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
	}
	public static void orderNo(WebElement element, String data) {

		System.out.println(data);
	}
	public static void closeBrowser() {
		driver.close();

		}
	
	

	}

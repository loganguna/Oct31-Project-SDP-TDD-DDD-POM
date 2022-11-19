package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Files {

	public static WebDriver driver;
	
	public static String value;

	public static WebDriver browser_Launch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "C:\\edge driver\\edgedriver_win64\\msedgedriver.exe");

			driver = new EdgeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "");

			driver = new FirefoxDriver();
		}

		return driver;
	}
	
	public static void get_Url(String url) {

		driver.get(url);
	}

	public static String get_Title() {

		String title = driver.getTitle();

		return title;
	}

	public static String get_CurrentUrl() {

		String currentUrl = driver.getCurrentUrl();

		return currentUrl;
	}

	public static String get_PageSource() {

		String pageSource = driver.getPageSource();

		return pageSource;
	}

	public static void close() {

		driver.close();
	}

	public static void quit() {

		driver.quit();
	}

	public static void navigate_To(String url) {

		driver.navigate().to(url);
	}

	public static void navigation_Commands(String commands) {

		if (commands.equalsIgnoreCase("refresh")) {

			driver.navigate().refresh();
		}

		else if (commands.equalsIgnoreCase("back")) {

			driver.navigate().back();
		}

		else if (commands.equalsIgnoreCase("forward")) {

			driver.navigate().forward();
		}

	}

	public static void delete_Allcookies() {

		driver.manage().deleteAllCookies();
	}

	public static void window_Commands(String commands) {

		if (commands.equalsIgnoreCase("maximize")) {

			driver.manage().window().maximize();
		}

		else if (commands.equalsIgnoreCase("fullscreen")) {

			driver.manage().window().fullscreen();
		}

	}

	public static Dimension window_Command_getSize() {

		Dimension getsize = driver.manage().window().getSize();

		return getsize;
	}

	public static void window_Command_setSize(int width, int height) {

		Dimension d = new Dimension(width, height);

		driver.manage().window().setSize(d);
	}

	public static void click_On_Element(WebElement element) {

		element.click();
	}

	public static void clear(WebElement element) {

		element.clear();
	}

	public static void sendkeys(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static String get_Text(WebElement element) {

		String text = element.getText();

		return text;
	}

	public static boolean enabled(WebElement element) {

		boolean enabled = element.isEnabled();

		return enabled;
	}

	public static boolean displayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		return displayed;
	}

	public static boolean selected(WebElement element) {

		boolean selected = element.isSelected();

		return selected;
	}

	public static String get_Attribute(WebElement element, String attributeName) {

		String attribute_Value = element.getAttribute(attributeName);

		return attribute_Value;
	}

	public static String get_TagName(WebElement element) {

		String tagName = element.getTagName();

		return tagName;
	}

	public static Point get_Location(WebElement element) {

		Point location = element.getLocation();

		return location;
	}

	public static Dimension get_Size(WebElement element) {

		Dimension size = element.getSize();

		return size;
	}

	public static String get_CSSValue(WebElement element, String propertyName) {

		String cssValue = element.getCssValue(propertyName);

		return cssValue;
	}

	public static Rectangle get_Rectangle(WebElement element) {

		Rectangle rectValue = element.getRect();

		return rectValue;
	}

	public static void select_By_Value(WebElement element, String value) {

		Select s = new Select(element);

		s.selectByValue(value);
	}

	public static void select_By_Index(WebElement element, int index) {

		Select s = new Select(element);

		s.selectByIndex(index);
	}

	public static void select_By_VisibleText(WebElement element, String visible_Text) {

		Select s = new Select(element);

		s.selectByVisibleText(visible_Text);
	}

	public static boolean multiple(WebElement element) {

		Select s = new Select(element);

		boolean multiple = s.isMultiple();

		return multiple;
	}

	public static List<WebElement> get_Options(WebElement element) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		return options;
	}

	public static List<WebElement> get_AllSelected_Options(WebElement element) {

		Select s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		return allSelectedOptions;
	}

	public static WebElement get_FirstSelected_Options(WebElement element) {

		Select s = new Select(element);

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		return firstSelectedOption;
	}

	public static void deselect_By_Value(WebElement element, String value) {

		Select s = new Select(element);

		s.deselectByValue(value);
	}

	public static void deselect_By_Index(WebElement element, int index) {

		Select s = new Select(element);

		s.deselectByIndex(index);
	}

	public static void deselect_By_VisibleText(WebElement element, String visible_Text) {

		Select s = new Select(element);

		s.deselectByVisibleText(visible_Text);
	}

	public static void deselect_All(WebElement element) {

		Select s = new Select(element);

		s.deselectAll();
	}

	public static void sleep(long milliseconds) throws InterruptedException {

		Thread.sleep(milliseconds);
	}

	public static void implicitwait(long seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public static void pageLoadTimeout(long seconds) {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
	}

	public static void js_ScrollIntoView(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void js_Click(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", element);
	}

	public static void mouse_move_To_Element(WebElement element) {

		Actions a = new Actions(driver);

		a.moveToElement(element).build().perform();
	}

	public static void mouse_Click() {

		Actions a = new Actions(driver);

		a.click().build().perform();
	}

	public static void mouse_Element_Click(WebElement element) {

		Actions a = new Actions(driver);

		a.click(element).build().perform();
	}

	public static void mouse_RightClick() {

		Actions a = new Actions(driver);

		a.contextClick().build().perform();
	}

	public static void mouse_Element_RightClick(WebElement element) {

		Actions a = new Actions(driver);

		a.contextClick(element).build().perform();
	}
	
	public static void Takes_Screenshot(String path) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
		
	}
	
		public static String particular_cell_data(String path,int sheet,int row,int cell) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(sheet);
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			 value = c.getStringCellValue();
			
		}
		else if (type.equals(CellType.NUMERIC)) {
			
			double d = c.getNumericCellValue();
			
			int a = (int) d;
			
			 value = String.valueOf(a);
			
		}
		wb.close();
		return value;
		
	}
		
}

/*	public static void js_Sendkeys(WebElement element) {

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("arguments[0].value =''", element);
}

public static void disable_Notifications() {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-notifications");
		
		driver = new ChromeDriver(options);
	}
	
	public static void incognito() {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("incognito");
		
		driver = new ChromeDriver(options);
	}

public static void js_Highlight(WebElement element) {

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("arguments[0].setAttribute('style','color:red')", element);
}
*/
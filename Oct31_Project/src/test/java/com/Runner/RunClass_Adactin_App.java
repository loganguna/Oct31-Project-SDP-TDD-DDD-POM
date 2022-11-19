package com.Runner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RunClass_Adactin_App {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.xpath("//table[@class='login']//descendant::input[@id='username']"));
		username.sendKeys("maari1995");
		
		WebElement pass = driver.findElement(By.xpath("//td//child::input[@name='password']"));
		pass.sendKeys("Guna@2221");
		
		WebElement login_btn = driver.findElement(By.xpath("//tr//descendant::input[@name='login']"));
		login_btn.click();
		
		Thread.sleep(5000);
		
		WebElement location = driver.findElement(By.xpath("//tbody//descendant::select[@id='location']"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");
		
		WebElement hotel = driver.findElement(By.xpath("//td//child::select[@name='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.xpath("//td//child::select[@id='room_type']"));
		Select s2 = new Select(room);
		s2.selectByValue("Deluxe");
		
		WebElement room_nos = driver.findElement(By.xpath("//tr//descendant::select[@id='room_nos']"));
		Select s3 = new Select(room_nos);
		s3.selectByValue("1");
		
		WebElement check_in= driver.findElement(By.xpath("//tr//descendant::input[@id='datepick_in']"));
		check_in.clear();
		check_in.sendKeys("24/10/2022");
		
		WebElement check_out = driver.findElement(By.xpath("//td//child::input[@id='datepick_out']"));
		check_out.clear();
		check_out.sendKeys("25/10/2022");
		
		WebElement adult = driver.findElement(By.xpath("//td//child::select[@id='adult_room']"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");
		
		WebElement child = driver.findElement(By.xpath("//td//child::select[@name='child_room']"));
		Select s5 = new Select(child);
		s5.selectByVisibleText("2 - Two");
		
		WebElement search_btn = driver.findElement(By.xpath("//tr//descendant::input[@name='Submit']"));
		search_btn.click();
		
		Thread.sleep(5000);
		
		WebElement radio_btn = driver.findElement(By.xpath("//tbody//descendant::input[@type='radio']"));
		radio_btn.click();
		
		WebElement continue_btn = driver.findElement(By.xpath("//td//child::input[@type='submit']"));
		continue_btn.click();
		
		Thread.sleep(5000);
		
		WebElement first_name = driver.findElement(By.xpath("//td//child::input[@name='first_name']"));
		first_name.sendKeys("logan");
		
		WebElement last_name = driver.findElement(By.xpath("//tr//descendant::input[@id='last_name']"));
		last_name.sendKeys("x");
		
		WebElement address = driver.findElement(By.xpath("//tr//descendant::textarea[@id='address']"));
		address.sendKeys("no 5 ,vivekanandar street ,dubai main road ,dubai");
		
		WebElement cc_num = driver.findElement(By.xpath("//tr//descendant::input[@name='cc_num']"));
		cc_num.sendKeys("1234567891011121");
		
		WebElement cc_type = driver.findElement(By.xpath("//td//child::select[@name='cc_type']"));
		Select s6 = new Select(cc_type);
		s6.selectByVisibleText("American Express");
		
		WebElement cc_exp_month = driver.findElement(By.xpath("//td//child::select[@name='cc_exp_month']"));
		Select s7 = new Select(cc_exp_month);
		s7.selectByValue("12");
		
		WebElement cc_exp_year = driver.findElement(By.xpath("//td//child::select[@name='cc_exp_year']"));
		Select s8 = new Select(cc_exp_year);
		s8.selectByValue("2022");
		
		WebElement cc_cvv= driver.findElement(By.xpath("//td//child::input[@name='cc_cvv']"));
		cc_cvv.sendKeys("123");
		
		WebElement booknow_btn = driver.findElement(By.xpath("//td//child::input[@name='book_now']"));
		booknow_btn.click();
		
		Thread.sleep(5000);
		
		WebElement my_itinerary = driver.findElement(By.xpath("//td//child::input[@name='my_itinerary']"));
		my_itinerary.click();
		
		Thread.sleep(5000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='order_id_749998']//preceding::input[@name='ids[]']"));
		checkbox.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\ScreenShots\\Adactin.png");
		FileUtils.copyFile(src, des);
		
		Thread.sleep(5000);
		
		WebElement cancel_btn = driver.findElement(By.xpath("//td//child::input[@name='cancelall']"));
		cancel_btn.click();
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
		Thread.sleep(5000);
		
		WebElement logout = driver.findElement(By.xpath("//td[@align='center']//child::input[@name='logout']"));
		logout.click();	
	}

}

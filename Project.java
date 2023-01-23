package org.project;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project {
	
	static WebDriver d;
	
	@BeforeClass
	public static void test01() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
		d.manage().window().maximize();
	}
		
	
		@AfterClass
		public static void test02() throws InterruptedException {
			Thread.sleep(3000);
			
	}
		
		@Before
		public void test03() {
			long start = System.currentTimeMillis();
			System.out.println(start);
		}
		 
		@After
		public void test04() {
			long end = System.currentTimeMillis();
			System.out.println(end);
		}
		
		@Test
		public void test05() throws InterruptedException {
			d.findElement(By.id("username")).sendKeys("Manikandan1701");
			d.findElement(By.id("password")).sendKeys("manikandan");
			d.findElement(By.id("login")).click();
			
			//location
			WebElement locbox = d.findElement(By.id("location"));
			Select obj=new Select(locbox);
			obj.selectByIndex(5);
			
			//Hotel
			WebElement hotbox = d.findElement(By.id("hotels"));
			Select obj1=new Select(hotbox);
			obj1.selectByValue("Hotel Creek");
			
			d.findElement(By.id("room_type")).sendKeys("Super Deluxe");
			d.findElement(By.id("room_nos")).sendKeys("1");
			d.findElement(By.id("datepick_in")).sendKeys("05/01/2023");
			d.findElement(By.id("datepick_out")).sendKeys("06/01/2023");
			d.findElement(By.id("adult_room")).sendKeys("2");
			d.findElement(By.id("child_room")).sendKeys("1");
			d.findElement(By.id("Submit")).click();
			
			d.findElement(By.id("radiobutton_0")).click();
			d.findElement(By.id("continue")).click();
			
			d.findElement(By.id("first_name")).sendKeys("Manikandan");
			d.findElement(By.id("last_name")).sendKeys("K");
			d.findElement(By.id("address")).sendKeys("12/1 Mettukkuppam,Chennai");
			d.findElement(By.id("cc_num")).sendKeys("1234567891012345");
			d.findElement(By.id("cc_type")).sendKeys("VISA");
			d.findElement(By.id("cc_exp_month")).sendKeys("January");
			d.findElement(By.id("cc_exp_year")).sendKeys("2022");
			d.findElement(By.id("cc_cvv")).sendKeys("1234");
			d.findElement(By.id("book_now")).click();
			
			
			
			Thread.sleep(5000);
			WebElement orderid = d.findElement(By.id("order_no"));
			String attribute = orderid.getAttribute("value");
			System.out.println(attribute);
			
		    
		}
		
	

}

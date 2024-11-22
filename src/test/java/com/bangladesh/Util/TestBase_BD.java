package com.bangladesh.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase_BD {
	public static Properties prop;
	public static WebDriver driver;

	public TestBase_BD() {
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\bangladesh\\config\\configBD.properties");
			prop = new Properties();
			prop.load(fls);
			System.out.println(fls);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void initz() {
		String Browsername = prop.getProperty("browser1");
		if(Browsername.equals("Chrome")) {
//			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(utillll.implicitlyWait_wait, TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(utillll.pageLoadTimeout_wait, TimeUnit.SECONDS);
		}
		else{
			Browsername.equals("FF");
		}			
		System.out.println("Browser found");
	}
	public static void lunchh(String URL) {
		driver.get(prop.getProperty("URL"));
	}

}

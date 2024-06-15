package UTILITIES;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basesetup {
	
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	static {
		
		try {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		File files =new File ("C:\\Users\\syss\\eclipse-workspace\\POM\\input.properties");
		
		FileInputStream fis=new FileInputStream(files);
		
		prop=new Properties();
		
		prop.load(fis);
		}
		
		catch(Exception e) {
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
		
	}

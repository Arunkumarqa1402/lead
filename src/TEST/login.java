package TEST;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PAGES.register;
import UTILITIES.basesetup;


public class login {
	

	public static WebDriver driver;
	public static Properties prop;
	
	basesetup setup=new basesetup();
	
	
	 
	
	 @Test
	  public void f() {
		  
		    
		 register login=new register (driver);
				  
		  
	        String URL=prop.getProperty("URL");		  
		    		
	        driver.get(URL);
	        
	       
	        
			  
	  }
	  @AfterMethod
	  public void afterMethod() {
		  
		 System.out.println("i am after method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  
		  
	  this. driver=setup.driver ;
	  this.  prop=setup.prop;
		  
		  
	  }

	}

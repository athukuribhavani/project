package sample.Mavenproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver d;
  @Test
  public void f() {
	  d=new FirefoxDriver();
	  d.get("http://www.gmail.com");
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  d.findElement(By.name("Email")).sendKeys("bhavani.athukuri85");
	  
  }
}

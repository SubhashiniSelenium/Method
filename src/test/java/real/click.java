package real;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/OLD/Selenium Jars/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.linkText("Log in")).click();
       //		(or)
      //WebElement we=driver.findElement(By.linkText("Log in")).click();
		List<WebElement> rb=driver.findElements(By.name("pollanswers-1"));
		//driver.findElement(By.name("pollanswers-1"));
		((WebElement) rb.get(0)).click();
}
}
package real;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/OLD/Selenium Jars/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/store/Default.php");
		WebElement w=driver.findElement(By.name("category_id"));
		Select s=new Select(w);
		s.selectByVisibleText("Databases");

}
}
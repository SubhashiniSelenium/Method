package real;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/OLD/Selenium Jars/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		WebElement fromDateBox= driver.findElement(By.id("ddate"));
		fromDateBox.clear();
		fromDateBox.sendKeys("22/02/2020");
		WebElement toDateBox= driver.findElement(By.id("rdate"));
		toDateBox.clear();
		toDateBox.sendKeys("26/02/2020");

}
}
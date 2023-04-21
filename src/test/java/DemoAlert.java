import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement Coldriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));

		System.out.println(Coldriver.findElements(By.tagName("a")).size());

		List<WebElement> items = Coldriver.findElements(By.tagName("a"));

		for (WebElement ele : items) {
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ele.sendKeys(clickOnLink);
			Thread.sleep(2000);
		}
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it= abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		
		

	}

}

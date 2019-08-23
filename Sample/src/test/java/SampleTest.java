import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class SampleTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("http://google.com");
		/*
		 * driver.findElement(By.className("gLFyf gsfi")).sendKeys("mega star");
		 * driver.findElement(By.className("gNO89b")).click();
		 */
		 //Setting the webdriver.chrome.driver property to its executable's location
	       
	    WebElement searchtext=driver.findElement(By.name("q"));
	    		 searchtext.sendKeys("Thalapathy vijay");
	    		 
	    WebElement searchsub=driver.findElement(By.className("gNO89b"));
	    searchsub.click();
	
		
		
		
		/*
		 * driver.get("https://mvnrepository.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.linkText("Kotlin Reflection")).click();
		 * driver.findElement(By.linkText("1.3.31")).click();
		 * driver.findElement(By.linkText("Gradle")).click();
		 * driver.findElement(By.linkText("SBT")).click();
		 * driver.findElement(By.linkText("Ivy")).click();
		 * driver.findElement(By.linkText("Grape")).click();
		 * driver.findElement(By.linkText("Leiningen")).click();
		 * driver.findElement(By.linkText("Buildr")).click();
		 * driver.findElement(By.linkText("Android Development with Kotlin")).click();
		 */
/*
		driver.manage().window().maximize();
		driver.findElement(By.tagName(a.contains["https://accounts.google.com/AccountChooser?service=mail&amp;continue=https://mail.google.com/mail/\" class=\"h-c-header__nav-li-link \" target=\"_blank\" ga-on=\"click\" ga-event-category=\"ab experiment\" ga-event-action=\"sign in\" ga-event-label=\"nav\">\r\n");
*/
	}
}


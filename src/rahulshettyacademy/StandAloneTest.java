package rahulshettyacademy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://rahulshettyacademy.com/client");
		 * 
		 * driver.findElement(By.id("userEmail")).sendKeys("arjunsingh@gmail.com");
		 * driver.findElement(By.id("userPassword")).sendKeys("Arjunsingh@123");
		 * 
		 * driver.findElement(By.id("login")).click();
		 * 
		 * List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		 * 
		 * // the below code can be done from for loop also,but now latest
		 * implementation // is of streams , so we will use stream to do this filtering
		 * .
		 * 
		 * WebElement prod = products.stream() .filter(product ->
		 * product.findElement(By.cssSelector("b")).getText().equals("adidas original"))
		 * .findFirst().orElse(null);
		 * 
		 * prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		 * 
		 * // this css ".card-body button:last-of-type" is generating three results but
		 * as // we have already narrowed down to the desired element // then there is
		 * no need to specify the element exactly.
		 */	
		
		String productName = "ZARA COAT 3";

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");

		//LandingPage landingPage = new LandingPage(driver);

		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");

		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");

		driver.findElement(By.id("login")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

		//List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

		List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class, 'mb-3')]"));

		    WebElement prod = products.stream().filter(product->

		product.findElement(By.xpath("//div[@class='card-body']//b")).getText().equals(productName)).findFirst().orElse(null);

		prod.findElement(By.xpath("//div[@class='card-body']/button[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

		//ng-animating

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		
		//here ,in above line,we can give only element only , but giving the full webelement is making the process fast in automation ,
		//so sometimes its preferable to use the complete webelement in place of only element.

		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

		List <WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));

		    Boolean match = cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));

		    Assert.assertTrue(match);

		    driver.findElement(By.cssSelector(".totalRow button")).click();

		    Actions a = new Actions(driver);

		    a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

		    driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();

		    driver.findElement(By.cssSelector(".action__submit")).click();

		    String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();

		    Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

		    driver.close();

		}

}

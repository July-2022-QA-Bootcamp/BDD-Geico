package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {

	WebDriver driver;
	WebElement element;
	
	@Given("user navigate to homepage")
	public void user_navigate_to_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.geico.com/");
		System.out.println("This is Given");
	}

	@Given("user input zipcode")
	public void user_input_zipcode() {
		element = driver.findElement(By.id("ssp-service-zip"));
		element.sendKeys("11418");
		System.out.println("This is Given");
	}

	@Given("user select auto")
	public void user_select_auto() {
		element = driver.findElement(By.xpath("//div[@class='product-cards']/div[@class='card' and contains(.,'Auto')]"));
		element.click();
		System.out.println("This is Given");
	}

	@When("click start quote")
	public void click_start_quote() {
		element = driver.findElement(By.id("bundleModalBtn"));
		element.click();
		System.out.println("This is When");
	}

	@Then("user will be in about you page")
	public void user_will_be_in_about_you_page() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Continue Pop Up");
	}

	@Then("title of the page will be <About You>")
	public void title_of_the_page_will_be_about_you() {
		driver.quit();
		System.out.println("Title of About You");
	}

	
}

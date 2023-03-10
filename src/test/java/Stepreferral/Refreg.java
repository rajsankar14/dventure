package Stepreferral;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Refreg {
	public  static WebDriver driver ;

	
	@Given("^I am on the referral registration page$")
	public void i_am_on_the_referral_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karup\\neweclipse\\Referral\\chromedriver\\chromedriver.exe");
	    driver= new ChromeDriver();

		driver.get("https://www.dventuresworld.in/referral_sign_up/RFYzMDE4NjU%3D");
	}

	@When("^I enter my name$")
	public void i_enter_my_name() throws Throwable {
		driver.findElement(By.id("c_name")).sendKeys("TestAuto");
	}

	@When("^I enter the my email$")
	public void i_enter_the_my_email() throws Throwable {
		driver.findElement(By.id("c_email")).sendKeys("Autotest@gmail.com");
	}

	@When("^I enter the mobile number$")
	public void i_enter_the_mobile_number() throws Throwable {
		driver.findElement(By.id("n_mobile")).sendKeys("1236541230");
		
	}

	@When("^I enter the Address$")
	public void i_enter_the_Address() throws Throwable {
		driver.findElement(By.id("c_address")).sendKeys("4-240H east street ");
		
	}

	@When("^I select the country$")
	public void i_select_the_country() throws Throwable {
		WebElement country = driver.findElement(By.id("c_country"));
		Select select = new Select( country);
		select.selectByValue("99");
	
	}

	@When("^I enter the Pincode$")
	public void i_enter_the_Pincode() throws Throwable {
		driver.findElement(By.id("n_zipcode")).sendKeys("628401");
	}

	@When("^I Enter the Nominee name$")
	public void i_Enter_the_Nominee_name() throws Throwable {
		driver.findElement(By.id("c_nominee")).sendKeys("autoselenium");
	}

	@When("^I enter the Nominee Relation$")
	public void i_enter_the_Nominee_Relation() throws Throwable {
		driver.findElement(By.id("c_nominee_relation")).sendKeys("autoselenium relation");
	}

	@When("^I enter the password$")
	public void i_enter_the_password() throws Throwable {
		driver.findElement(By.id("c_password")).sendKeys("123456"); 
	}

	@When("^I enter the confirmpassword$")
	public void i_enter_the_confirmpassword() throws Throwable {
		driver.findElement(By.id("c_confirm_password")).sendKeys("123456");
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\karup\\neweclipse\\Referral\\target.png");
		Files.copy(source,destination);
	}

	@When("^I click the \"([^\"]*)\" button$")
	public void i_click_the_button(String arg1) throws Throwable {
		driver.findElement(By.id("submit")).click();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\karup\\neweclipse\\Referral\\target1.png");
		Files.copy(source,destination);
		
	}

}

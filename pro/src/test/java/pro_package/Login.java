package pro_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
    public static WebDriver driver;
	
	
	
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver(); 
	}

	@Given("I want to enter the URL")
	public void i_want_to_enter_the_URL() {
		driver.get("http://192.168.40.4:8083/TestMeApp1");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();	
	}

	@Then("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	    driver.findElement(By.name("userName")).sendKeys(string);
	    driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.name("Login")).click();
	}


}

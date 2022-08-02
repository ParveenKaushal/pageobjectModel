package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
    System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium_Jars\\geckodriver.exe");
	 driver= new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^title of page is facebook lgoin$")
public void title_of_page_is_facebook_lgoin() throws Throwable {
	String title= driver.getTitle();
	String actualTilte="Facebook - log in or sign up";
	System.out.println(title);
	Assert.assertEquals(title, actualTilte);
    
}

@Then("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("dgffhgfhgjh");
    driver.findElement(By.id("pass")).sendKeys("hgjbkjl"); 
}

@Then("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
	driver.findElement(By.name("login")).click();
    
    Thread.sleep(2000);
}

@Then("^user quit window$")
public void message_dispalyed_that_you_are_login_in() throws Throwable {
    driver.close();
}


}

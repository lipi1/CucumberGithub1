package stepDefinition;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class wordpress {
	

	WebDriver driver;
@Given("^Open FIrefox and start application$")
public void open_FIrefox_and_start_application() throws Throwable {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
    //throw new PendingException();
}

@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
public void i_enter_valid_username_and_valid_passowrd(String uname, String pass) throws Throwable {
	driver.findElement(By.id("usernameOrEmail")).sendKeys(uname);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(500);
    driver.findElement(By.id("password")).sendKeys(pass);
    //throw new PendingException();
}

@Then("^user must be able to login successfully$")
public void user_must_be_able_to_login_successfully() throws Throwable {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(500);
	//System.out.println("Page Title verified - user is able to login successfully");
    System.out.println(driver.getTitle());
    driver.quit();
    //throw new PendingException();
}



}

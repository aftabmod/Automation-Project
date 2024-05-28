package pagepackage;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	public  WebDriver driver;

	@FindBy(className = "ico-register")
	WebElement RegisterButton1;
	
	@FindBy(name="Gender")
	WebElement GenderRadButton;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(name="Email")
	WebElement mailid;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(id="ConfirmPassword")
	WebElement conpassword;
	
	@FindBy(name="register-button")
	WebElement RegisterButton2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement LogIn;
	
	public Registration (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); }
	
	public void SetRegValues(){
		RegisterButton1.click();
		GenderRadButton.click();;
		firstname.sendKeys("Ferran");
		lastname.sendKeys("Toliso");
		mailid.sendKeys("heyitsferran@gmail.com");
		pass.sendKeys("hi123456");
		conpassword.sendKeys("hi123456");
		RegisterButton2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LogIn.click(); }	
}

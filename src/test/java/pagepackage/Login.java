package pagepackage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")
	WebElement LogEmail;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input")
	WebElement LogPassword;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement LogInButton;
	
	
	public  Login (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this); } 
	
		
	public void setvalues (String emailid,String password){
		LogEmail.clear();
		LogEmail.sendKeys(emailid);
		LogPassword.clear();
		LogPassword.sendKeys(password);	}
	
	public void loginfinish(){
		LogInButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
}

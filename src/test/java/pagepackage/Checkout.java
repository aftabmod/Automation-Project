package pagepackage;
import java.io.File;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Checkout {
	
	WebDriver driver;
	
	@FindBy(id="termsofservice")
	WebElement terms;
	
	@FindBy(id="checkout")
	WebElement checkoutbttn;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div/div/div/div/div[7]/input")
	WebElement city1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div/div/div/div/div[8]/input")
	WebElement Address1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div/div/div/div/div[10]/input")
	WebElement zip1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div/div/div/div/div[11]/input")
	WebElement phoneno1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")
	WebElement continuebttn1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/form/div/div/div/ul/li[1]/div/div[2]/input")
	WebElement codbttn;
	              
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input")
	WebElement continuebttn2;
	
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input")
	WebElement continuebttn3;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[6]/div[2]/div[2]/input")
	WebElement confirmbttn;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
	WebElement homepage;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[1]/a")
	WebElement facebook;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/form/div/div/div[1]/div[2]/div/div/div/div[7]/input")
	WebElement city2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/form/div/div/div[1]/div[2]/div/div/div/div[8]/input")
	WebElement Address2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/form/div/div/div[1]/div[2]/div/div/div/div[10]/input")
	WebElement zip2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/form/div/div/div[1]/div[2]/div/div/div/div[11]/input")
	WebElement phoneno2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")
	WebElement continuebttn4;
	
	@FindBy(name="shippingoption")
	WebElement shipcheck;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input")
	WebElement continuebttn5;
	
	public Checkout (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}

	public void check1() {
		terms.click();
		checkoutbttn.click();
		Select dp = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[1]/div/select")));
		dp.selectByVisibleText("New Address");}
	
	public void billsetvalues() {
		
		Select country = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div/div/div/div/div[5]/select")));
		country.selectByValue("41");
		city1.sendKeys("Kochi");
		Address1.sendKeys("Villa1,Edappally");
		zip1.sendKeys("12345");
		phoneno1.sendKeys("9876543210");
		continuebttn1.click(); }
	
	public void check2() {
		Select ds = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/form/div/div/div[1]/div[1]/div/select")));
		ds.selectByVisibleText("New Address");}
	
	public void shipsetvalues() {
		
		Select shcountry = new Select (driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/form/div/div/div[1]/div[2]/div/div/div/div[5]/select")));
		shcountry.selectByValue("41");
		city2.sendKeys("Kochi");
		Address2.sendKeys("Villa1,Edappally");
		zip2.sendKeys("12345");
		phoneno2.sendKeys("9876543210");
		continuebttn4.click();
		shipcheck.click();
		continuebttn5.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); }
		
	public void proceed() {
		codbttn.click();
		continuebttn2.click();
		continuebttn3.click();
		confirmbttn.click(); }
	
	public void windowhandle() {
		
		homepage.click();
		String parentwindow = driver.getWindowHandle();
		facebook.click();
		Set<String>allwindowhandles=driver.getWindowHandles();
		for (String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
			}
		}
		
	}
	
	public void screenshot() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div/div[5]/div/div/div[1]/div/span/span")));
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("./Screenshot/Facebookscreenshot.png")); }
	
	
	public void urlassertchck() {
		String actualtitle = "NopCommerce | Facebook";
		String expectedtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle); }
}



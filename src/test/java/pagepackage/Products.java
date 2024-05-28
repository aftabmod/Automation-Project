package pagepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Products {
	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
	WebElement Logo;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	WebElement Product1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[5]/div/input[1]")
	WebElement Qtybox;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[5]/div/input[2]")
	WebElement Addtocart1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")
	WebElement Shoppingcart;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")
	WebElement apparel;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	WebElement Product2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[6]/div/input[3]")
	WebElement addwishlist;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")
	WebElement wishlist;
	
	@FindBy(name="addtocart")
	WebElement checkbox;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[2]")
	WebElement Addtocart2;
	
	public Products (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); }
		
	public void logocheck() {
		
		if (Logo.isDisplayed())
		{
			System.out.println("The logo is present");
		}
		else
		{
			System.out.println("The logo is not present");
		}
	}
	
	public void categories(){
		List<WebElement>li = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li"));
		for (WebElement ele:li)
		{
			if(ele.getText().equalsIgnoreCase("digital downloads"))
			{
				ele.click();
			}
		}	
	}
	
	public void dropdown(){
		Select object = new Select(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/select")));
		object.selectByVisibleText("List");	}
	
	public void cart(){
		Product1.click();
		Qtybox.clear();
		Qtybox.sendKeys("2",Keys.ENTER);
		Addtocart1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		apparel.click();
		Product2.click();
		addwishlist.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		wishlist.click();
		checkbox.click();
		Addtocart2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Shoppingcart.click(); }
}

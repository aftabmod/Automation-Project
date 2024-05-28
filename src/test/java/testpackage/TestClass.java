package testpackage;

import org.testng.annotations.Test;
import basepackage.InitialClass;
import pagepackage.Checkout;
import pagepackage.Login;
import pagepackage.Products;
import pagepackage.Registration;
import utilitypackage.ExcelClass;

public class TestClass extends InitialClass {
	
	@Test(priority=1)
	public void logoverification(){
		Products p = new Products(driver);
		p.logocheck();}
	
	@Test(priority=2)
	public void registrationmethod(){
		Registration r = new Registration(driver);
    	r.SetRegValues();}
	
	@Test(priority=3)
	public void loginverification() throws Exception 
	{
		Login l1 = new Login(driver);
		String y = "D:\\SOFTWARE TESTING\\Project Docs\\Book1.xlsx";
		String Sheet = "Sheet1";
		int rowcount = ExcelClass.GetRowCount(y, Sheet);
		
		for (int i=1;i<=rowcount;i++)
		{
			String emailid = ExcelClass.GetCellValues(y, Sheet, i, 0);
			System.out.println("The mailid is " +emailid);
			String password = ExcelClass.GetCellValues(y, Sheet, i, 1);
			System.out.println("The password is " +password);
			l1.setvalues(emailid, password);
			l1.loginfinish();
			
		}
		
		String expectedurl = "https://demowebshop.tricentis.com/";
		String actualurl = driver.getCurrentUrl();
		if (expectedurl.equals(actualurl))
		{
			System.out.println("The process is passed");
		}
		else
		{
			System.out.println("The process is not passed");
		}
		
	}

	@Test(priority=4)
	public void categorisation() {
		Products p = new Products(driver);
		p.categories();}
	
	@Test(priority=5)
	public void dropdownprocess(){
		Products p = new Products(driver);
		p.dropdown();}
	
	@Test(priority=6)
		public void cartmethod() {
		Products p = new Products(driver);
		p.cart(); }
	
	@Test(priority=7)
	public void checking1() {
		Checkout c = new Checkout(driver);
		c.check1(); }
	
	@Test(priority=8)
	public void billpayment() {
		Checkout c = new Checkout(driver);
		c.billsetvalues(); }
	
	@Test(priority=9)
	public void checking2() {
		Checkout c = new Checkout(driver);
		c.check2(); }
	
	@Test(priority=10)
	public void shippayment() {
		Checkout c = new Checkout(driver);
		c.shipsetvalues();	}

	@Test(priority=11)
	public void checkoutproceed() {
		Checkout c = new Checkout(driver);
		c.proceed(); }
	
	@Test(priority=12)
	public void winhandscreensht() throws Exception {
		Checkout c = new Checkout(driver);
		c.windowhandle(); }
	
	@Test(priority=13)
	public void screenshotpgm() throws Exception {
		Checkout c = new Checkout(driver);
		c.screenshot(); }
	
	@Test(priority=14)
	public void urlcheck() {
		Checkout c = new Checkout(driver);
		c.urlassertchck(); }
	
}
	
	
	
	

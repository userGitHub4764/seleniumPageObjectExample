package tests;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.*;


public class LoginTest2 {
	
	//protected WebDriver driver;

	 //Create firefox driver's instance
    public WebDriver driver;
    BasePage base;
    
	@Before
	public void setUp(){
		 base = new BasePage(driver);
	     driver = base.getDriver();
	}

	@Test
	public void loginTest() throws Exception {
		
		//definimos objectos y variables
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		MyAccountPage accountPage= new MyAccountPage(driver);
		boolean exists = false;
		
		//funcionalidad automatizada
		homePage.loadHomepage();
		
		//driver.findElement(By.xpath("(//h5/a[@title='Printed Dress'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[@title='Printed Dress' and @class='product-name'])[2]")).click();
		
	}
	
	@After
	public void tearDown() {
		//base.closeDriver();
	}

}

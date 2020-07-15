package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Ordering_page {

    WebDriver driver;
	public Product_Ordering_page(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath=" //ul[@class='menu_links']//child::li[3]//child::a")
	WebElement clickOnThreeLine;
	
	
	@FindBy(xpath="//div[@id='mCSB_1_container']//child::li[2]//child::a")
	WebElement clickOnSignInButton;
	
	@FindBy(xpath="//input[@id='loginMail']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='loginPwd']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login-form\"]//child::button")
	WebElement LoginButoon;
	
	@FindBy(xpath=" //*[@id='maincat_7690']//child::a//child::span[@class='overlay']")
	WebElement clickOnProduct;
	
	@FindBy(xpath=" //div[@id='control-56835']//child::button")
	WebElement addTheProduct;

	@FindBy(xpath=" //input[@id='pickup_option']")
	WebElement DeliveryOption;
	
	@FindBy(xpath=" //button[@id='saveOrderAddrBtn']")
	WebElement ProductSubmitButton;
	

	@FindBy(xpath="//a[@onclick='OLOMENU.checkout()']")
	WebElement ClickOnCheckOut;
	
	
	@FindBy(xpath="//form[@id='info-form']//child::button")
	WebElement PickUpStore;
	
	@FindBy(xpath="//label[@class='control control--radio with_radio payment_method']")
	WebElement PayMentOption;
	
	@FindBy(xpath="//button[@id='pay-button']")
	WebElement clickOnPaymentButton;
	

	
	public void clickOnThreeLine() {
		clickOnThreeLine.click();
	}
	public void clickOnSignInButton() {
		clickOnSignInButton.click();
	}
	
	public void usernameAndPassword(String user, String pass) throws InterruptedException {
		username.sendKeys(user);
		Thread.sleep(2000);
		password.sendKeys(pass);
	}
	public void LoginButoon() throws InterruptedException {
		Thread.sleep(2000);
		LoginButoon.click();
	}

	public void clickOnProduct() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickOnProduct.click();
	}
	
	public void addTheProduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addTheProduct.click();
	}
	
	public void DeliveryOption() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DeliveryOption.click();
	}
	
	public void ProductSubmitButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		ProductSubmitButton.click();
	}
	public void ClickOnCheckOut() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ClickOnCheckOut.click();
	}
	
	public void PickUpStore() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PickUpStore.click();
	}
	
	public void PayMentOption() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PayMentOption.click();
	}
	
	public void clickOnPaymentButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickOnPaymentButton.click();
	}
	


}

package StepDefinition;




import POM.Product_Ordering_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends BaseClass{


	Product_Ordering_page login_page;
	

	@Given("^Launch the browser and Enter \"([^\"]*)\"$")
	public void launch_the_browser_and_Enter(String URL){
		initialisation(URL);
	}

	@When("^click on the three line to goto the user profile page$")
	public void click_on_the_three_line_to_goto_the_user_profile_page() {
		login_page=new Product_Ordering_page(driver);
		login_page.clickOnThreeLine();
	}

	@Then("^click on sign in button$")
	public void click_on_sign_in_button()  {
		login_page=new Product_Ordering_page(driver);
		login_page.clickOnSignInButton();
	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws InterruptedException {
		login_page=new Product_Ordering_page(driver);
		login_page.usernameAndPassword(arg1, arg2);
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws InterruptedException{
		login_page=new Product_Ordering_page(driver);
		login_page.LoginButoon();
	}


	@When("^click on the Anytime Brunch Options$")
	public void click_on_the_Anytime_Brunch_Options() {
		login_page=new Product_Ordering_page(driver);
		login_page.clickOnProduct();
	
	}

	@Then("^click on the add button$")
	public void click_on_the_add_button()  {
		login_page=new Product_Ordering_page(driver);
		login_page.addTheProduct();

	}

	@Then("^Click on the delivery options$")
	public void click_on_the_delivery_options(){
		login_page=new Product_Ordering_page(driver);
		login_page.DeliveryOption();

	}

	@Then("^click on the save and proceed options$")
	public void click_on_the_save_and_proceed_options() {
		login_page=new Product_Ordering_page(driver);
		login_page.ProductSubmitButton();

	}

	@Then("^Click on checkout option$")
	public void click_on_checkout_option() {
		login_page=new Product_Ordering_page(driver);
		login_page.ClickOnCheckOut();
	}

	@Then("^varify the selected store and click on the continue option$")
	public void varify_the_selected_store_and_click_on_the_continue_option() {
		login_page=new Product_Ordering_page(driver);
		login_page.PickUpStore();
	}
	@Then("^choose payment option as a Pay Cash On Delivery$")
	public void choose_payment_option_as_a_Pay_Cash_On_Delivery() {
		login_page=new Product_Ordering_page(driver);
		login_page.PayMentOption();
	}

	@Then("^Click on Pay Option button$")
	public void click_on_Pay_Option_button()  {
		login_page=new Product_Ordering_page(driver);
		login_page.clickOnPaymentButton();
	}



}

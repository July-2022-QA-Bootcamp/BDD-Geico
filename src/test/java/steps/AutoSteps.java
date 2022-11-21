package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reporting.Logs;

public class AutoSteps extends BaseClass{
	
	@Given("user navigate to homepage")
	public void user_navigate_to_homepage() {
		Logs.log("Before Hook");
	}
	
	@Given("user input zipcode")
	public void user_input_zipcode() {
		homePage.inputZip("11418");
	}
	
	@Given("user select auto")
	public void user_select_auto() {
		homePage.clickAuto();
	}
	
	@When("click start quote")
	public void click_start_quote() {
		homePage.startMyQuoteAuto();
	}
	
	@When("continue overlay handled")
	public void continue_overlay_handled() {
		homePage.handleContinueOverlay();
	}
	
	@When("speed up page handled")
	public void speed_up_page_handled(){
		aboutYou.handleSpeedUpPage();
	}
	
	@Then("user will be in about you page")
	public void user_will_be_in_about_you_page() throws InterruptedException {
		Thread.sleep(2000);
		Logs.log(getDriver().getCurrentUrl());
	}
	
	@Then("title of the page will be <About You>")
	public void title_of_the_page_will_be_about_you() {
		Logs.log(getDriver().getTitle());
	}
	
	@When("homepage steps done with {string}")
	public void homepage_steps_done_with(String string) {
		homePage.autoSteps(string);
	}
	
	@Then("about you page steps done")
	public void about_you_page_steps_done() {
		aboutYou.aboutYouSteps("02/02/1980", "Fring", "Gus");
	}
}

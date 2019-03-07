package stepDefenition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class StepDefinitionTalk {
	
	
	    @Given("^User is in homepage$")
	    public void user_is_in_homepage() throws Throwable {
	    	System.out.println("hi");
	       }

	    @When("^user enters \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" $")
	    public void user_enters_something_something_something_something_something(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5) throws Throwable {
	        
	    }

	    @Then("^Success message should be displayed$")
	    public void success_message_should_be_displayed() throws Throwable {
	       
	    }

	    @And("^Tap on Talk With us $")
	    public void tap_on_talk_with_us() throws Throwable {
	        
	    }
	    @When("^Tap on Hamburger Menu and select \"([^\"]*)\" option$")
	    public void tap_on_hamburger_menu_and_select_something_option(String strArg1) throws Throwable {
	       
	    }

	    @Then("^Aritifical Intelligence system page shoud be displayed $")
	    public void aritifical_intelligence_system_page_shoud_be_displayed() throws Throwable {
	        
	    }
	    

	}


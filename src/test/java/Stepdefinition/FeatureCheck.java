package Stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureCheck {

	@Given("^i store my datatable$")
	public void i_store_my_datatable() throws Throwable {
		System.out.println("Datatable stored");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^i retrieve my datatable$")
	public void i_retrieve_my_datatable() throws Throwable {
		System.out.println("Datatable retrieved");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^i got access to the datatable$")
	public void i_got_access_to_the_datatable() throws Throwable {
		System.out.println("Datatable accessed");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^i delete the datatable$")
	public void i_delete_the_datatable() throws Throwable {
		System.out.println("datatable deleted");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^i close the data$")
	public void i_close_the_data() throws Throwable {
		System.out.println("datatable closed");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}

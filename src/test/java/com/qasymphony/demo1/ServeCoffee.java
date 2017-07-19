package com.qasymphony.demo1;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import cucumber.api.PendingException;

public class ServeCoffee {
	@Given("^there are <count> coffees left in the machine$")
	public void thereAreCountCoffeesLeftInTheMachine(String count) throws Throwable {
  	throw new PendingException();
	}

	@And("^I have deposited <dollars>$")
	public void iHaveDepositedDollars(String dollars) throws Throwable {
  	     throw new PendingException();
	}

	@And("^I have previously had <dollars> in the bank$")
	public void iHavePreviouslyHadDollarsInTheBank(String dollars)  {
  	     throw new PendingException();
	}

	@When("^I press the coffee button$")
	public void iPressTheCoffeeButton() {
  	     throw new PendingException();
	}

	@Then("^I should be served a coffee$")
	public void iShouldBeServedCoffee() {
  	     throw new PendingException();
	}
	
	@Given("^there are (\\d+) coffees left in the machine$")
	public void there_are_coffees_left_in_the_machine(int arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	}

	@Given("^I have deposited (\\d+)\\$$")
	public void i_have_deposited_$(int arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	}

	@Given("^I previously had (\\d+)\\$ in the bank$")
	public void i_previously_had_$_in_the_bank(int arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	}
}

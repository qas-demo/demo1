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
}

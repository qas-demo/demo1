Feature: Serve coffee
  Coffee should not be served until paid for
  Coffee should not be served until the button has been pressed
  If there is no coffee left then money should be refunded
  
  Scenario:  Buy last coffee
     Given there are 1 coffees left in the machine
     And I have deposited 5$
     And I previously had 100$ in the bank
     When I press the coffee button
     Then I should be served a coffee

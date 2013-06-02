package org.jnario.tests 

import org.jnario.tests.*
import org.jnario.calc.Calculator

Feature: Testing a simple calculator using JNario

	In order to do basic math
	As a user
	I want to be able use a calculator
	
	Scenario: Adding two numbers
		val calc = new Calculator();
		Given I have entered "2" into the calcutaor
		calc.pressKey(args.first);
		And I entered "+" into the calculator
		calc.pressKey(args.first);
		And then I entered "2" into the calculator
		calc.pressKey(args.first);
		When I press "="
		calc.pressKey(args.first);
		Then the result should be 4
		calc.getDisplay==4;
		
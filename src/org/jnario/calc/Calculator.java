package org.jnario.calc;

public class Calculator {

	private StringBuilder display;

	/**
	 * Simple calculator example for the purposes of testing JNario
	 */
	public Calculator() {
		display = new StringBuilder();
	}
	
	/**
	 * @return the current screen display
	 */
	public StringBuilder getDisplay() {
		return display;
	}

	/**
	 * Collate the input
	 * 
	 * @param key
	 */
	public void pressKey(String key) {
		if (key.equals("=")) {
			doMath();
		} else {
			display.append(key + " ");
		}
	}

	/**
	 * The user pressed equals! Time to do some math
	 * 
	 * @return
	 */
	private void doMath() {
		String[] inputs = display.toString().split(" ");
		// NOTE this won't scale when we have more than one 2 inputs but that's
		// the point I'm making
		int firstNumber = Integer.valueOf(inputs[0]);
		int secondNumber = Integer.valueOf(inputs[2]);
		int result = 0;
		switch (inputs[1]) {
		case "+":
			result = add(firstNumber, secondNumber);
			break;
		}
		display = new StringBuilder();
		display.append(result);
	}

	/**
	 * Add two numbers
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return the result of adding the two numbers
	 */
	private int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
}

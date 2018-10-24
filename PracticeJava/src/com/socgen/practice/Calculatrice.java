package com.socgen.practice;

/**
 * This class provides .
 * 
 * @author Cyril
 *
 */
public class Calculatrice {

	/**
	 * This variables provides.
	 */

	private double a;
	private double b;

	/**
	 * This constructor provides.
	 * 
	 * @param a
	 * @param b
	 */

	public Calculatrice(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * This method provides .
	 * 
	 * @param a operand a
	 * @param b operand b
	 */

	public double add() {
		return a + b;
	}

	public double substract() {
		return a - b;
	}

	public double multiply() {
		return a * b;
	}
	
	public double divide () {
		return a / b;
	}

}

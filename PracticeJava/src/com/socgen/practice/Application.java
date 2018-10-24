package com.socgen.practice;

public class Application {

    public static void main(String[] args) {
	Calculatrice calc = new Calculatrice (5,5);
	System.out.println(calc.add());
	System.out.println(calc.substract());
	System.out.println(calc.divide());
	System.out.println(calc.multiply());
	
    }

}

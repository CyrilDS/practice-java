package com.socgen.practice;

import java.util.Scanner;

public class Vizir {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner cla = new Scanner (System.in);
		System.out.println("Quel est ton prénom?");
		String str = cla.nextLine();
		
		
		System.out.println("Quel age as tu?");
		String age = cla.nextLine();
		System.out.println("Bonjour " + str + ", je vois que vous avez "+ age);
		}

}

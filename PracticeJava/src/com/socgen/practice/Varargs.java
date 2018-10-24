package com.socgen.practice;

public class Varargs {
//
//    public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	        
//	            System.out.println(calcul(1,2));
//	        } 
//
//	        public static int calcul (int i, int j) {
//	            return i+j;
//	        }
//
//	    }
//
	        public static void main(String args[])
	        {
	            System.out.println(calcul(1,2,3,4,5,6,7,8,9,89));
	        } 

	        public static int calcul (int... num) {
	            int total = 0;
	            for(int i : num)
	            total+=i;
	        return total;
	        }
}

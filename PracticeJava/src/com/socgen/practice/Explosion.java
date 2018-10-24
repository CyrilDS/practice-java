package com.socgen.practice;

public class Explosion {

    public static void main(String[] args) {
    /*créer un tableau 10 eres lettres , parcourir et afficher le tableau de maniére croissante
     * changer le 1 er élément par 'j' et dernier par 'z'
     * parcourir et afficher le tableau de maniére décroissante sur une seule ligne.
     * 
     */
    	char [] tab = new char [] {'a','b','c','d','e','f','g','h','i','j'};
    	for (int i = 0; i < tab.length; i++) {
    		System.out.println(tab [i]);
    	}
    	
    	tab[0]= 'j';
    	tab[9]= 'z';
    	
    	for (int i = tab.length -1 ; i >= 0; i--) {
			System.out.print(tab [i]);
		}
    } 
}
//    		String explosion = "Explosion";
//    		char [] explosed =  explosion.toCharArray();
//    		for (int i = explosed.length - 1;i >=0 ; i--) {
//    			System.out.println(explosed[i]);
//			}
//
//    }

    	


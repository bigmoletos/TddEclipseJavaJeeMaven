/**
 * 
 */
package fr.demandeatonton.tdd.services;

import fr.demandeatonton.tdd.exceptions.InvalidListException;

/**
 * @author fd
 *
 */
public class NumberService {
	public int biggestNumber(int[] listeEntiers) {
//		on gere une throw exception custom dans au cas où la liste est nulle
		if (listeEntiers == null)
			throw new InvalidListException("la liste ne peut pas etre nulle !");

// on prend MIN VALUE pour eviter les erreurs sur le test des valeurs negative, 
//		MAX.VAlue fait echouer le test de la valeur la plus grande avec des valeurs négatives
		int index;
		int numberMax = Integer.MIN_VALUE;// 0;// Integer.MAX_VALUE;
		for (index = 0; index < listeEntiers.length; index++) {
			if (listeEntiers[index] > numberMax) {
				numberMax = listeEntiers[index];
			}
		}
		System.out.printf("la valeur max de la liste contenant %d éléments est: %d \n", listeEntiers.length, numberMax);
		return numberMax;
	}
}

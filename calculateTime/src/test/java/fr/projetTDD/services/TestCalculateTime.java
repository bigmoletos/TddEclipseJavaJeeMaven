package fr.projetTDD.services;

import org.junit.Test;

import fr.projetTDD.NumberToTest;

public class TestCalculateTime {

	@Test
//	test si l'entrée est alphabetique
	public void testValueIsAlpha() {

//		int[] listeEntiers = new int[] { 7, 8, 9, 10 };
//		int max = Integer.MAX_VALUE;
		NumberToTest numberToTest = new NumberToTest();
		// int nombre = "a";
		int result = numberToTest.calculateSecond() / numberToTest.calculateSecond();
		// ternaire
		if (result == 1)
			System.out.println("ok la valeur est un entier");
		else {
			System.out.println("entrez un entier!");
		}

	}

//	@Test
//	// utilisation de try catch

//	private static boolean TestValueisInteger() {
//		NumberToTest numberToTest2 = new NumberToTest();
//		boolean valueIsValid = true;
//		try {
//			String.parseString(numberToTest2);
//		} catch (NumberFormatException nfe) {
//			valueIsValid = false;
//		}
//		return valueIsValid;
//	}

	// int biggest1 = NumberTest.biggestNumber(listeEntiers);
//		fonction d'assertion de junit permettant de valider ou non un test
//		assertEquals(biggest1, 10);

	@Test
	// test si le chiffre est négatif

	public void testValueIsNegatif() {

	}

	@Test
	// test si le chiffre est null

	public void testValueIsNull() {

	}
}

package fr.demandeatonton.tdd.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.demandeatonton.tdd.exceptions.InvalidListException;

public class TestNumberService {

	@Test
//	fonctions test permettant de renvoyer le plus grand entier d'une liste
	public void testBiggestNumber() {
//		crée une liste d'entiers
		int[] listeEntiers = new int[] { 7, 8, 9, 10 };
//		int max = Integer.MAX_VALUE;
		NumberService numberService = new NumberService();

		int biggest1 = numberService.biggestNumber(listeEntiers);
//		fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest1, 10);

		int[] listeEntiers2 = new int[] { 1, 2, 3, 4 };
		int biggest2 = numberService.biggestNumber(listeEntiers2);
//		fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest2, 4);

	}

	@Test(expected = InvalidListException.class)
	// configuration de l'annotation @Test en lui
	// passant le expected afin d'éviter une erreur due à une liste nulle

	// test si le plus grand entier d'une liste nulle

	public void testBiggestNumberWithNullValue() {
//		crée une liste d'entiers
//		int[] listeEntiers = new int[] {};
		NumberService numberService = new NumberService();
//pour eviter une nullPointerException avec une valeur null, on va créer une exception custom
//dans exemple-tdd on crée un pakage exceptions
//et à l'interieur une classe "invalidListException
//dans superclass on remplace "java.lang.Object" par "java.lang.RuntimeException"
//		puis on genere le "constructeur from superclass" et on garde uniquement "RuntimeException(String)"

		numberService.biggestNumber(null);
//		fonction d'assertion de junit permettant de valider ou non un test
//		assertEquals(null1, 0);
	}

	@Test
	// test si le plus grand entier d'une liste est négatif
	public void testBiggestNumberWithNegativeValues() {
		// crée une liste d'entiers négatif
		int[] listeEntiers = new int[] { -1, -7, -8, -9 };
		NumberService numberService = new NumberService();

		int negative1 = numberService.biggestNumber(listeEntiers);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(negative1, -1);
	}
//	todo
//	@Test
//	// tester si la liste contient du texte

//	@Test
//	tester si la liste ne contient qu'une valeur

//	@Test
//	tester si la liste n'est  pas une liste

	@Test
//	tester si la liste est dans le désordre
	public void testBiggestNumberNotOrderer() {
//			crée une liste d'entiers
		int[] listeEntiers = new int[] { 8, 7, 10, 9 };
//			int max = Integer.MAX_VALUE;
		NumberService numberService = new NumberService();

		int biggest1 = numberService.biggestNumber(listeEntiers);
//			fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest1, 10);
		//
		//
//		

		int[] listeEntiers2 = new int[] { 4, 2, 1, 3 };
		int biggest2 = numberService.biggestNumber(listeEntiers2);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest2, 4);

	}

	@Test
	// test si le plus grand entier d'une liste contenant un seul élément
	public void testBiggestNumberWithListWithOneElement() {
		// crée une liste d'entiers négatif
		int[] listeEntiers = new int[] { -1 };
		NumberService numberService = new NumberService();

		int onlyOne = numberService.biggestNumber(listeEntiers);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(onlyOne, -1);
	}

	@Test
	// test si le plus grand entier d'une liste avec des valeurs dupliquées
	public void testBiggestNumberWithduplicateValues() {
		// crée une liste d'entiers négatif
		int[] listeEntiers = new int[] { -1, -7, -8, -9, -1, -8, -9 };
		NumberService numberService = new NumberService();

		int duplicate = numberService.biggestNumber(listeEntiers);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(duplicate, -1);
	}
}

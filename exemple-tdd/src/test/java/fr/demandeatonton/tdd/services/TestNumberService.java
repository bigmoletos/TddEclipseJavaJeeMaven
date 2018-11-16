package fr.demandeatonton.tdd.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.demandeatonton.tdd.exceptions.InvalidListException;

/**
 * 
 * @author franck Desmedt
 *
 */
public class TestNumberService {

	@Test
	/**
	 * 
	 * @description utilisation de la TDD test Driven Developpement via la videao de
	 *              "demande a tonton" tests unitaires et TDD en Java avec JUnit
	 *              https://www.youtube.com/watch?v=6wE6VhF_uNo
	 * @return void en partant d'une liste compare la valeur max attendue � celle de
	 *         la liste, ici on attend 4 et 10
	 * @method testBiggestNumber
	 * @class TestNumberService
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see biggestNumber(int[] listeEntiers)
	 *
	 *
	 */
	public void testBiggestNumber() {
//cr�e une liste d'entiers
		int[] listeEntiers = new int[] { 7, 8, 9, 10 };
//int max = Integer.MAX_VALUE;
		NumberService numberService = new NumberService();

		int biggest1 = numberService.biggestNumber(listeEntiers);
//fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest1, 10);

		int[] listeEntiers2 = new int[] { 1, 2, 3, 4, 5 };
		int biggest2 = numberService.biggestNumber(listeEntiers2);
//fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest2, 4);

	}

	@Test(expected = InvalidListException.class)
	/**
	 * 
	 * @description test si le plus grand entier d'une liste nulle configuration de
	 *              l'annotation Test en lui passant le expected afin d'�viter une
	 *              erreur due � une liste nulle
	 * 
	 * @return void
	 *
	 * @method testBiggestNumberWithNullValue
	 * @class TestNumberService
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see biggestNumber(int[] listeEntiers)
	 *
	 *
	 */

	public void testBiggestNumberWithNullValue() {
		NumberService numberService = new NumberService();
		/*
		 * pour eviter une nullPointerException avec une valeur null, on va cr�er une
		 * exception custom dans exemple-tdd on cr�e un pakage exceptions et �
		 * l'interieur une classe "invalidListException dans superclass on remplace
		 * "java.lang.Object" par "java.lang.RuntimeException" puis on genere le
		 * "constructeur from superclass" et on garde uniquement
		 * "RuntimeException(String)"
		 */
		numberService.biggestNumber(null);
//		fonction d'assertion de junit permettant de valider ou non un test
//		assertEquals(null1, 0);
	}

	@Test
	/**
	 * 
	 * @description test si le plus grand entier d'une liste est n�gatif
	 * @return void
	 *
	 * @method testBiggestNumberWithNegativeValues
	 * @class TestNumberService
	 * @version 1.0
	 * @date mercredi 14 nov. 2018
	 * @see biggestNumber(int[] listeEntiers)
	 *
	 *
	 */
	public void testBiggestNumberWithNegativeValues() {
		// cr�e une liste d'entiers n�gatif
		int[] listeEntiers = new int[] { -1, -7, -8, -9, 10 };
		NumberService numberService = new NumberService();

		int negative1 = numberService.biggestNumber(listeEntiers);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(negative1, -1);
	}

	@Test
	/**
	 * 
	 * @description tester si la liste est dans le d�sordre
	 * @return void
	 *
	 * @method testBiggestNumberNotOrderer
	 * @class TestNumberService
	 * @version 1.0
	 * @date mercredi 14 nov. 2018
	 * @see biggestNumber(int[] listeEntiers)
	 *
	 *
	 */
	public void testBiggestNumberNotOrderer() {
//			cr�e une liste d'entiers
		int[] listeEntiers = new int[] { 8, 7, 10, 9 };
//			int max = Integer.MAX_VALUE;
		NumberService numberService = new NumberService();

		int biggest1 = numberService.biggestNumber(listeEntiers);
//			fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest1, 10);

		int[] listeEntiers2 = new int[] { 4, 2, 1, 3 };
		int biggest2 = numberService.biggestNumber(listeEntiers2);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(biggest2, 4);

	}

	@Test
	// test si le plus grand entier d'une liste contenant un seul �l�ment
	public void testBiggestNumberWithListWithOneElement() {
		// cr�e une liste d'entiers n�gatif
		int[] listeEntiers = new int[] { -1 };
		NumberService numberService = new NumberService();

		int onlyOne = numberService.biggestNumber(listeEntiers);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(onlyOne, -1);
	}

	@Test
	// test si le plus grand entier d'une liste avec des valeurs dupliqu�es
	public void testBiggestNumberWithduplicateValues() {
		// cr�e une liste d'entiers n�gatif
		int[] listeEntiers = new int[] { -1, -7, -8, -9, -1, -8, -9 };
		NumberService numberService = new NumberService();

		int duplicate = numberService.biggestNumber(listeEntiers);
		// fonction d'assertion de junit permettant de valider ou non un test
		assertEquals(duplicate, -1);
	}

//	todo
//	@Test
//	// tester si la liste contient du texte

//	@Test
//	tester si la liste ne contient qu'une valeur

//	@Test
//	tester si la liste n'est  pas une liste
}

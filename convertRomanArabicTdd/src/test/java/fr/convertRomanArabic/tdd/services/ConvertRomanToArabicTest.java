package fr.convertRomanArabic.tdd.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import fr.convertRomanArabic.customersExceptions.InvalidListExceptionNoEnumConstant;
import fr.convertRomanArabic.customersExceptions.InvalidListExceptionRoman;

//programme utilisation la tdd sur une conversion de chiffres romain en chiffres arabes
//suivant la video de https://www.youtube.com/watch?v=OluA0uJP9ts
/**
 * 
 * énumeration permettant de faire la correspondance entre les chiffres romains
 * et arabes comme ce n'est pas une simple liste il faut rajouter une variable
 * et instancier le constructeur en option on peut rajouter un getter pour
 * acceder à la liste
 * 
 * @author franck Desmedt
 * @param listRoman attribut de la liste de correspondance
 * @see int toArabic()
 * @return retourne la liste de correspondance
 * @version 1.0
 * 
 * 
 */

public class ConvertRomanToArabicTest {

	@Test
	// test convertion roman text in arabic 1
	public void testConvertRomanToArabic() {
		RomanService roman = new RomanService("I");
		int arabic = roman.toArabic();
		assertEquals(arabic, 1);
		// écriture sur une seule ligne
		// assertEquals(new Roman("I").toArabic(), 1);
	}

	@Test
	/**
	 * 
	 * @description test convertion roman II in arabic 2
	 * @return void compare la donnée arabic convertie en romain, resultat attendu 2
	 * @method testConvertRomanToArabic2
	 * @class ConvertRomanToArabicTest
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see
	 */
	public void testConvertRomanToArabic2() {
		RomanService roman = new RomanService("II");
		int arabic = roman.toArabic();
		assertEquals(arabic, 2);
		// écriture sur une seule ligne
		// assertEquals(new Roman("I").toArabic(), 2);
	}

	@Test
	/**
	 * 
	 * @description test convertion roman text in arabic 10
	 * @return void
	 *
	 * @method testConvertRomanToArabic3
	 * @class ConvertRomanToArabicTest
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see
	 *
	 */

	public void testConvertRomanToArabic3() {
		RomanService roman = new RomanService("X");
		int arabic = roman.toArabic();
		assertEquals(arabic, 10);
		// écriture sur une seule ligne
		// assertEquals(new Roman("I").toArabic(), 10);
	}

	@Test
	/**
	 * 
	 * @description test convertion roman text in arabic 1000
	 * @return void
	 *
	 * @method testConvertRomanToArabic4
	 * @class ConvertRomanToArabicTest
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see
	 *
	 */

	public void testConvertRomanToArabic4() {
		RomanService roman = new RomanService("M");
		int arabic = roman.toArabic();
		assertEquals(arabic, 1000);
	}

	@Test(expected = InvalidListExceptionRoman.class)
	/**
	 * 
	 * @description test convertion roman text in arabic avec valeur nulle
	 * @return void
	 *
	 * @method testConvertRomanToArabicIsNull
	 * @class ConvertRomanToArabicTest
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see public InvalidListException(String arg0)
	 *
	 */
	public void testConvertRomanToArabicIsNull() {
		RomanService roman = new RomanService(null);
		int arabic = roman.toArabic();
		// roman.toArabic(null);
		assertNotNull("test valeur null", arabic);
	}

	@Test(expected = InvalidListExceptionNoEnumConstant.class)
	/**
	 * A FINIR ne fonctionne PAS
	 * 
	 * @description test convertion roman text in arabic avec valeur négative
	 * @return void
	 *
	 * @method testConvertRomanToArabicIsNegative
	 * @class ConvertRomanToArabicTest
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see public class InvalidListExceptionNoEnumConstant extends
	 *      IllegalArgumentException
	 *
	 *
	 */
	public void testConvertRomanToArabicIsNegative() {
		RomanService roman = new RomanService("-M");
		int arabic = roman.toArabic();
		assertNotNull(arabic);
	}

	@Test(expected = InvalidListExceptionNoEnumConstant.class)
	/**
	 * A FINIR ne fonctionne PAS
	 * 
	 * @description test convertion roman text in arabic avec valeur int et non
	 *              string en chiffres romains
	 * @return void
	 *
	 * @method testConvertRomanToArabicIsInt_notString
	 * @class ConvertRomanToArabicTest
	 * @version 1.0
	 * @date mardi 13 nov. 2018
	 * @see
	 * @see public class InvalidListExceptionNoEnumConstant extends
	 *      IllegalArgumentException
	 *
	 */
	public void testConvertRomanToArabicIsInt_notString() {
		RomanService roman = new RomanService("2");
		roman.toArabic();
		// numberService.biggestNumber(null);
		// assertEquals(arabic, null);
	}

}
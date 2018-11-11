package fr.convertRomanArabic.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//programme utilisation la tdd sur une conversion de chiffres romain en chiffres arabes
//suivant la video de https://www.youtube.com/watch?v=OluA0uJP9ts
public class ConvertRomanToArabicTest {

	@Test
	// test convertion roman text in arabic
	public void testConvertRomanToArabic() {
		Roman roman = new Roman("I");
		int arabic = roman.toArabic();
		assertEquals(arabic, 1);
		// écriture sur une seule ligne
		// assertEquals(new Roman("I").toArabic(), 1);
	}

	@Test
	// test convertion roman text in arabic
	public void testConvertRomanToArabic2() {
		Roman roman = new Roman("II");
		int arabic = roman.toArabic();
		assertEquals(arabic, 2);
		// écriture sur une seule ligne
		// assertEquals(new Roman("I").toArabic(), 2);
	}

	@Test
	// test convertion roman text in arabic
	public void testConvertRomanToArabic3() {
		Roman roman = new Roman("X");
		int arabic = roman.toArabic();
		assertEquals(arabic, 10);
		// écriture sur une seule ligne
		// assertEquals(new Roman("I").toArabic(), 10);
	}

	@Test
	// test convertion roman text in arabic
	public void testConvertRomanToArabic4() {
		Roman roman = new Roman("M");
		int arabic = roman.toArabic();
		assertEquals(arabic, 1000);
	}

}
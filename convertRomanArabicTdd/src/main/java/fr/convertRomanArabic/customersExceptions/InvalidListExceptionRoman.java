package fr.convertRomanArabic.customersExceptions;

/**
 * @author franck Desmedt customerException pour traiter la valeur null
 * @see public RomanService(String arabic)
 * @see public void testConvertRomanToArabicIsNull()
 */
public class InvalidListExceptionRoman extends RuntimeException {

	/**
	 * @param arg0 constructeur de la superclass RuntimeException(String)
	 * @see public int toArabic()
	 */
	public InvalidListExceptionRoman(String arg0) {
		super(arg0);
	}

}

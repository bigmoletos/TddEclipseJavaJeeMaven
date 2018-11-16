package fr.convertRomanArabic.customersExceptions;

/**
 * @author franck Desmedt
 *
 */
public class InvalidListExceptionNoEnumConstant extends IllegalArgumentException {

	/**
	 * customer exception traite le cas où une valeur n'est pas comprise dans l'enum
	 * 
	 * @param arg0
	 * @see public int toArabic()
	 */
	public InvalidListExceptionNoEnumConstant(String arg0) {
		super(arg0);
	}

}

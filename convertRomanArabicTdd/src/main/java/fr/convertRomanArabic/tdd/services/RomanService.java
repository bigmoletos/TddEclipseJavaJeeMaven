package fr.convertRomanArabic.tdd.services;

import fr.convertRomanArabic.customersExceptions.InvalidListExceptionNoEnumConstant;
import fr.convertRomanArabic.customersExceptions.InvalidListExceptionRoman;
import fr.convertRomanArabic.tdd.enumeration.RomanListNumber;

/*
* utilisation la tdd sur une conversion de chiffres romain en chiffres arabes
*suivant la video de https://www.youtube.com/watch?v=OluA0uJP9ts
*
*@author   franck Desmedt
*@param arabic
*			attribut de la langue arabe
*@see RomanListNumber(int listRoman)
*@see public enum RomanListNumber
*@return la conversion d'un chiffre romain en chiffre arabe via l'enumeration RomanListNumber
*@version 1.0
*/
public class RomanService {
	private String arabic;

// constructor
	public RomanService(String arabic) {
		this.arabic = arabic;
	}

//methode conversion de roman en chiffres arabes avec utilisation de l'énum
	/**
	 * @description
	 *
	 * @return int la valeur attendue, conversion du roman en chiffres arabes via
	 *         l'énum et les customers exceptions
	 * @method toArabic
	 * @class RomanService
	 * @version 5.0
	 * @date jeudi 15 nov. 2018
	 * @see public enum RomanListNumber
	 * @see public class ConvertRomanToArabicTest
	 * @see public InvalidListExceptionRoman(String arg0)
	 * @see public class InvalidListExceptionNoEnumConstant
	 *
	 **/
	public int toArabic() {
//version1
//		if (arabic.equals("II")) {
//			return 2;
//		}
//		return 1;
//----------------------------------------------------
// version2 avec l'enum RomanListNumber afin de traiter toutes les valeurs
//		plus besoin de faire le if
//		return RomanListNumber.valueOf(arabic).getlistRoman();
//---------------------------------------------------
// version3 traite  valeur  null 
//		if (arabic == null)
//			throw new InvalidListExceptionRoman("la valeur ne peut etre nulle");
//		throw new InvalidListExceptionNoEnumConstant(
//				"la valeur n'est pas comprise dans la liste de l'enunmeration RomanListNumber");
//	return RomanListNumber.valueOf(arabic).getlistRoman();
//	--------------------------------------------------	
// version4 traite avec -M et 2
//	if (arabic == null)
//		throw new InvalidListExceptionRoman("la valeur ne peut etre nulle");
//// 		if (arabic == "-M" || arabic == "2")
//		throw new InvalidListExceptionNoEnumConstant(
//				"la valeur n'est pas comprise dans la liste de l'enunmeration RomanListNumber");
//	return RomanListNumber.valueOf(arabic).getlistRoman();
//		-------------------------------------------------
//version5 traite valeur négative ou int au lieu de string et de maniére generale des valeurs hors enumération	

		if (arabic == null)
			throw new InvalidListExceptionRoman("la valeur [" + arabic + "]ne peut etre nulle");
		if (arabic.valueOf("unknownEnum") == null) // A FINIR ne fonctionne PAS
			throw new InvalidListExceptionNoEnumConstant(
					"la valeur[" + arabic + "] n'est pas comprise dans la liste de l'enunmeration RomanListNumber");
		return RomanListNumber.valueOf(arabic).getlistRoman();
	}

}

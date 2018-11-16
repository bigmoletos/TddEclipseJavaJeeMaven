/**
 * 
 */
package fr.convertRomanArabic.tdd.enumeration;

/**
 * énumeration permettant de faire la correspondance entre les chiffres romains
 * et arabes comme ce n'est pas une simple liste il faut rajouter une variable
 * et instancier le constructeur en option on peut rajouter un getter pour
 * acceder à la liste
 * 
 * @author franck Desmedt
 * 
 * @param listRoman attribut de la liste de correspondance
 * @see int toArabic()
 * @return retourne la liste de correspondance
 * @version 1.0
 * 
 * 
 */
public enum RomanListNumber {
	I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), L(50), C(100), D(500), M(1000);

	private final int listRoman;

// constructor
	private RomanListNumber(int listRoman) {
		this.listRoman = listRoman;
	}

	/**
	 * @description getter on peut s'en passer ici
	 * @return int
	 *
	 * @method getlistRoman
	 * @class RomanListNumber
	 * @version 1.0
	 * @date jeudi 15 nov. 2018
	 * @see
	 *
	 **/
	public int getlistRoman() {
		return this.listRoman;
	}

}

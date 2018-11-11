/**
 * 
 */
package fr.projetTDD;

/**
 * @author romar énumeration permettant de faire la correspondance entre les
 *         chiffres romains et arabes comme ce n'est pas une simple liste il
 *         faut rajouter une variable et instancier le constructeur en option on
 *         peut rajouter un getter pour acceder à la liste
 */
public enum RomanListNumber {
	I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), L(50), C(100), D(500), M(1000);

	private final int listRoman;

// constructor
	private RomanListNumber(int listRoman) {
		this.listRoman = listRoman;
	}

//getter on peut s'en passer ici
	public int getlistRoman() {
		return this.listRoman;
	}

}

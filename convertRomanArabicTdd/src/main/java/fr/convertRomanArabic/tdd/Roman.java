package fr.convertRomanArabic.tdd;

import fr.projetTDD.RomanListNumber;

//programme utilisation la tdd sur une conversion de chiffres romain en chiffres arabes
//suivant la video de https://www.youtube.com/watch?v=OluA0uJP9ts
public class Roman {
	private String arabic;

	// constructor

	public Roman(String arabic) {
		this.arabic = arabic;
	}

	public int toArabic() {
//		if (arabic.equals("II")) {
//			return 2;
//
//		}
//		return 1;

		// version avec l'enum RomanListNumber
		return RomanListNumber.valueOf(arabic).getlistRoman();

	}

}

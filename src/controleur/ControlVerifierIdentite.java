package controleur;

import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		boolean verifVal = false;
		if(village.trouverHabitant(nomVendeur) != null )
			verifVal = true;
		else
			verifVal = false;
		return verifVal;
	}
}

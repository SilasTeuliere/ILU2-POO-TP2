package controleur;

import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		boolean verifVal = false;
		village.trouverHabitant(nomVendeur);
		String nomChef = village.getNom();
		if(nomVendeur.equals(nomChef)) {
			verifVal = true;
		}
		else {
			
		}
		return verifVal;
	}
}

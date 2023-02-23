package controleur;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	boolean isVendeur(String nomVendeur) {
		boolean vendeurReconnu = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur) != null;
		if(!vendeurReconnu) {
			System.out.println("Mais vous n'etes pas inscrit sur notre march� aujourd'hui !");
		}
		else {
			libererEtal
		}
	}

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		
		String[] donneesEtal = null;
		return donneesEtal;
	}

}

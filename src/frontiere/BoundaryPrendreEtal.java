package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if(!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Vous pas vendre ici\n");
		}
		else {
			System.out.println("Bonjour je vais regarder si je trouve une etale\n");
			if(!controlPrendreEtal.resteEtals()) {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		StringBuilder StrVendeur = new StringBuilder();
		StrVendeur.append("C'est parfait; etal pour vous\n");
		StrVendeur.append("Qu'elle produit vous souhaitez vendre?\n");
		String produit = scan.nextLine();
		System.out.println("Qu'elle produit vous souhaitez vendre?\n");
		int nbProduit = scan.nextInt();
		int numEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if(numEtal != 1) {
			StringBuilder finalStr = new StringBuilder();
			finalStr.append("Le vendeur "+ nomVendeur);
			finalStr.append(" s'est intallé à l'etal n°"+ numEtal);
			finalStr.append("\n");
			finalStr.toString();
		}
	}
}

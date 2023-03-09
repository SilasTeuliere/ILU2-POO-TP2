package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		boolean vendeurReconnu = controlLibererEtal.isVendeur(nomVendeur);
		if(!vendeurReconnu) {
			System.out.println("Mais vous n'etes pas inscrit sur notre marché aujourd'hui !");
		}
		else {
			
			String donneEtal[] = controlLibererEtal.libererEtal(nomVendeur);
			if(donneEtal[0].contentEquals("1")) {
				System.out.println("Vous avez vendu " + donneEtal[2] + "Sur " + donneEtal[3] +" " + donneEtal[4] + ". \n");
				System.out.println("En revoir "+ nomVendeur + " , passez une bonne journée");
			}
		}
		
	}

}

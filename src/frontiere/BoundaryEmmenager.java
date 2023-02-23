package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					int force;
					StringBuilder qst = new StringBuilder();
					System.out.println("Bienvenu villageois " + nomVisiteur +"\n");
					qst.append("Quelle est votre force ?\n");
					force = Clavier.entrerEntier(qst.toString());
					controlEmmenager.ajouterGaulois(nomVisiteur, force);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		int force;
		String qst2;
		int effetPotionMin;
		int effetPotionMax;
		StringBuilder qst = new StringBuilder();
		System.out.println("Bienvenu druide" + nomVisiteur +"\n");
		qst.append("Quelle est votre force ?\n");
		force = Clavier.entrerEntier(qst.toString());
		do {
			qst2 = "Quelle est la foce de la potion la plus faible que vous produisez?";
			effetPotionMin = Clavier.entrerEntier(qst2.toString());
			qst2 = "Quelle est la foce de la potion la plus forte que vous produisez?";
			effetPotionMax = Clavier.entrerEntier(qst2.toString());
			if(effetPotionMin > effetPotionMax) {
				System.out.println("Attention Druide, vous etes s�nile\n");
			}
		}while(effetPotionMin > effetPotionMax);
		controlEmmenager.ajouterDuide(nomVisiteur, force, effetPotionMin, effetPotionMax);
	}
}

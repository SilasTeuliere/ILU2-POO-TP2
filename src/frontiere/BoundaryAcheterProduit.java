package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		// TODO Ã  completer
		StringBuilder question = new StringBuilder();
		question.append("1 - je veux acheter un produit.");
		question.append("2 - je veux avoir une vue d'ensemble du marché.\n");
		question.append("3 - je veux quitter l'application.\n");
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
			case 3:
				
			default:
				System.out
						.println("Vous devez choisir un chiffre 1, 2 ou 3 !");
				break;
			}
}

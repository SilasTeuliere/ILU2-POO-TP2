package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.*;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private Village village;
	private Chef abraracourcix;
	private Gaulois asterix;
	private Druide pano;
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		asterix = new Gaulois("Asterix", 0);
		pano = new Druide("Panoramix", 2, 7, 1);
		village.setChef(abraracourcix);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(pano);
	}


	@Test
	void testControlAfficherVillage() {
		ControlAfficherVillage controlAffVil = new ControlAfficherVillage(village);
		assertNotNull(controlAffVil, "Constructeur ne renvoie pas null");
	}

	@Test
	void testDonnerNomsVillageois() {
		ControlAfficherVillage controlAffVil = new ControlAfficherVillage(village);
		assertArrayEquals(village.donnerVillageois(), controlAffVil.donnerNomsVillageois() , "test DonnerNomVill valide");
	}

	@Test
	void testDonnerNomVillage() {
		ControlAfficherVillage controlAffVil = new ControlAfficherVillage(village);
		assertEquals(village.getNom(), controlAffVil.donnerNomVillage(), "test DonnerNopmVillage  valide");
	}
	
	@Test
	void testDonnerNbEtals() {
		ControlAfficherVillage controlAffVil = new ControlAfficherVillage(village);
		assertEquals(village.donnerNbEtal(), controlAffVil.donnerNbEtals());
	} 

}

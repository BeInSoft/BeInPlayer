package beinplayer.metier;

import beinplayer.metier.lecteur.Lecteur;
import beinplayer.metier.lecteur.ListeDeLecture;

public class BeInPlayer {

	private ListeDeLecture listeDeLecture;
	private Catalogue catalogue;
	private Lecteur lecteur;
	
	public BeInPlayer() {
		System.out.println("D�marrage du BeInPlayer");
		listeDeLecture = new ListeDeLecture();
		catalogue = new Catalogue();
	}

	public void compeleterLaListeDeLecteure() {
		listeDeLecture.ajouter(catalogue.getTitreAleatoire());
		
	}

	public void lecture() {
		System.out.println("Lecture de la liste de lecture");
		lecteur.jouer(listeDeLecture);
		
	}
	
	
}

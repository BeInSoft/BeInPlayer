


public class BeInPlayer {

	private ListeDeLecture listeDeLecture;
	private Catalogue catalogue;
	private Lecteur lecteur;
	
	public BeInPlayer() {
		System.out.println("D�marrage du BeInPlayer");
		listeDeLecture = new ListeDeLecture();
		catalogue = new Catalogue();
		lecteur = new Lecteur();
	}

	public void compeleterLaListeDeLecteure() {
		listeDeLecture.ajouter(catalogue.getTitreAleatoire());
		
	}

	public void lecture() {
		System.out.println("Lecture de la liste de lecture");
		lecteur.jouer(listeDeLecture);
		
	}
	
	
}

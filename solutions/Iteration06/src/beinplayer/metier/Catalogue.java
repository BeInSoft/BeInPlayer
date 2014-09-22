package beinplayer.metier;

public class Catalogue {

	private Titre[] titres;

	public Catalogue() {
		titres = new Titre[5];
		Artiste stromae = new Artiste("Stromae");
		titres[0] = new Titre("Papaoutai",231, stromae, Genre.Electro);
		titres[1] = new Titre("Tous les mêmes",211, stromae, Genre.Electro);
		titres[2] = new Titre("Alors on danse",206, stromae, Genre.Electro);
		titres[3] = new Titre("Formidable",224, stromae, Genre.Electro);
		titres[4] = new Titre("Ta fête",276, stromae, Genre.Electro);
	}
	
	public Titre getTitreAleatoire(){
		return titres[(int)(Math.random()*titres.length)];
	}
	
	
}

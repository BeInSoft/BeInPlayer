package beinplayer.dao;

import java.util.ArrayList;
import java.util.List;

import beinplayer.metier.Artiste;
import beinplayer.metier.Genre;
import beinplayer.metier.Titre;

class TitreDAOMock implements TitreDAO {

	@Override
	public List<Titre> getTousLesTitres() {
		List<Titre> result = new ArrayList<Titre>();
		Artiste stromae = new Artiste("Stromae");
		result.add(new Titre("Papaoutai",231, stromae, Genre.Electro));
		result.add(new Titre("Tous les m�mes",211, stromae, Genre.Electro));
		result.add(new Titre("Alors on danse",206, stromae, Genre.Electro));
		result.add(new Titre("Formidable",224, stromae, Genre.Electro));
		result.add(new Titre("Ta f�te",276, stromae, Genre.Electro));
		
		return result;
	}

}

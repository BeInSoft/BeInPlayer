package beinplayer.metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Catalogue {

	private List<Titre> titres;
	private Map<Artiste, List<Titre>> titresParArtiste = new HashMap<Artiste, List<Titre>>();

	public Catalogue() {
		List<Titre> result = new ArrayList<Titre>();
		Artiste stromae = new Artiste("Stromae");
		result.add(new Titre("Papaoutai",231, stromae, Genre.Electro));
		result.add(new Titre("Tous les mmes",211, stromae, Genre.Electro));
		result.add(new Titre("Alors on danse",206, stromae, Genre.Electro));
		result.add(new Titre("Formidable",224, stromae, Genre.Electro));
		result.add(new Titre("Ta fte",276, stromae, Genre.Electro));
		
		for (Iterator<Titre> iter = titres.iterator(); iter.hasNext();) {
			Titre titre = iter.next();
			Artiste artiste = titre.getArtiste();
			List<Titre> liste;
			if(titresParArtiste.containsKey(artiste)){
				liste = titresParArtiste.get(artiste);
			}else{
				liste = new ArrayList<Titre>();
				titresParArtiste.put(artiste, liste); 
			}
			liste.add(titre);
		}
	}
	
	public Titre getTitreAleatoire(){
		return titres.get((int)(Math.random()*titres.size()));
	}
	
	public Iterator<Titre> getTitresParAuteur(Artiste auteur){
		List<Titre> list = titresParArtiste.get(auteur);
		return list!=null?list.iterator():null;
	}
	
	
	public List<Titre> titresParArtiste(Artiste artiste){
		List<Titre> resultat=null;
		if(titresParArtiste.containsKey(artiste)){
			resultat = titresParArtiste.get(artiste);
		}
		return resultat;
	}
	
}

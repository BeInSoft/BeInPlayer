package beinplayer.metier.lecteur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import beinplayer.metier.ElementLisible;

public class ListeDeLecture extends ElementLisible{

	private List<ElementLisible> listeDeLecture;
	
	public ListeDeLecture() {
		super();
		listeDeLecture = new ArrayList<ElementLisible>();
	}
	
	public void ajouter(ElementLisible lisible){
		if(!listeDeLecture.contains(lisible)){
			listeDeLecture.add(lisible);
			System.out.println("Ajout de "+lisible+" a la liste de lecture.");
		}
	}
	
	@Override
	public void lire() {
		Iterator<ElementLisible> it= listeDeLecture.iterator();
		while (it.hasNext()) {
			it.next().lire();
		}
	}
	
	
}

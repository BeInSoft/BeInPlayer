package beinplayer.metier.lecteur;

import java.util.ArrayList;

import beinplayer.metier.Titre;

public class ListeDeLecture {

	private Titre[] listeDeLecture;
	private int index = 0;
	
	public ListeDeLecture() {
		super();
		listeDeLecture = new Titre[5];
	}
	
	public void ajouter(Titre titre){
		listeDeLecture[index++]=titre;
		System.out.println("Ajout de "+titre+" a la liste de lecture.");
	}
	
	
	public void lire() {
		for(int i=0;i<listeDeLecture.length;i++){
			if(listeDeLecture[i]!=null)
				System.out.println("Lecture de "+listeDeLecture[i]);	
		}
	}
	
	
}

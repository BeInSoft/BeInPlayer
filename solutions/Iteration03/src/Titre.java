
public class Titre {

	private int duree;
	private String nom;
	private String artiste;
	private Genre genre;
	
	//Constructeurs 
	public Titre() {
		super();
	}

	public Titre(String nom, int duree, String artiste, Genre genre) {
		super();
		this.duree = duree;
		this.nom = nom;
		this.artiste = artiste;
		this.genre = genre;
	}
	
	public void lecture(){
		System.out.println("Lecture du titre "+this.nom);
	}
	
	
	
}

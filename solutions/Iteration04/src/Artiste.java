

public class Artiste extends Object{

	private String nom;

	public Artiste(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		return nom.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		Artiste autre = (Artiste) obj;
		if (autre!=null && autre.nom!=null) {
			res = nom.equals(autre.nom);
		} 
		return res;
	}

	public String getNom() {
		return this.nom;
	}
	
	
	
}

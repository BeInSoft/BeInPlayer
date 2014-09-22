


public class Lecteur  {

	private boolean repeteTout = false;
	private boolean lectureAleatoire = false;
	
	public void jouer(ListeDeLecture listeDeLecture) {
		do{
			listeDeLecture.lire();
		}while(repeteTout);
	}

}

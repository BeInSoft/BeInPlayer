/**
 * Itération 3 : Un peu d'objets 
 * @author beInSoft
 */
public class Main {
	
	public static Titre[] listeDeLecture;
	
	public static void main(String[] args) {
		//Initilisation 
		listeDeLecture = new Titre[5];
		listeDeLecture[0] = new Titre("Papaoutai",231, "Stromae", Genre.Electro);
		listeDeLecture[1] = new Titre("Tous les mêmes",211, "Stromae", Genre.Electro);;
		listeDeLecture[2] = new Titre("Alors on danse",206, "Stromae", Genre.Electro);;
		listeDeLecture[3] = new Titre("Formidable",224, "Stromae", Genre.Electro);;
		listeDeLecture[4] = new Titre("Ta fête",276, "Stromae", Genre.Electro);;
		
		//Lecture de la liste de lecture
		System.out.println("Lecture de la liste de lecture");
		lectureListe();
		
		//Lecture aléatoire de la liste de lecture
		System.out.println("\nLecture de la liste de lecture");
		lectureAleatoireListe();
	}
	
	public static void lectureListe(){
		for(int i=0;i<listeDeLecture.length;i++){
			System.out.println("Lecture du titre : "+i+" - "+listeDeLecture[i]);
		}
	}
	
	public static void lectureAleatoireListe(){
		for(int i=0;i<listeDeLecture.length;i++){
			int indice = (int)(Math.random()*listeDeLecture.length);
			System.out.println("Lecture du titre : "+indice+" - "+listeDeLecture[indice]);
		}
	}
}

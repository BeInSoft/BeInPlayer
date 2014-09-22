/**
 * Itération 2 : Un peu de Syntaxe 
 * @author beInSoft
 */
public class Main {
	
	public static String[] listeDeLecture;
	
	public static void main(String[] args) {
		//Initilisation 
		listeDeLecture = new String[5];
		listeDeLecture[0] = "Papaoutai";
		listeDeLecture[1] = "Tous les mêmes";
		listeDeLecture[2] = "Alors on danse";
		listeDeLecture[3] = "Formidable";
		listeDeLecture[4] = "Ta fête";
		
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

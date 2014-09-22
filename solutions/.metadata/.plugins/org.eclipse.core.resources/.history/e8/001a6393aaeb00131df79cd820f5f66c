package beinplayer.ihm;
import java.util.Scanner;

import beinplayer.metier.BeInPlayer;

/**
 * Itération 5 : Les packages  
 * @author beInSoft
 */
class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BeInPlayer player = new BeInPlayer();
		
		System.out.println("Voulez vous ajouter un élément à votre liste de lecture ? [o-n]");
		while(sc.next().equalsIgnoreCase("o")){
			player.compeleterLaListeDeLecteure();
			System.out.println("Un autre ? [o-n]");
		}
		
		player.lecture();
			
	}
	
	
}

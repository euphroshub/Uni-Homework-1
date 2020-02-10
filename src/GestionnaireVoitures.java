//Code by K. Hardy and G. Colombi

import java.util.ArrayList;
import java.util.Scanner;

public class GestionnaireVoitures {

	// Creation du Scanner static et du arraylist

	private static Scanner scan = new Scanner(System.in); 
	private static ArrayList<Voiture> liste = new ArrayList<Voiture>();

	// Main method

	public static void main(String[] args) {

		// Creation du menu principale

		boolean arret = false;
		int sousmenu = 0;

		while (!arret) {
			System.out.println("======================================================================");
			System.out.println("---------------------------Menu Principal-----------------------------");
			System.out.println("------------ Choisissez parmis une des options suivantes -------------");
			System.out.println("1- Ajouter et creer une voiture dans la liste en choisissant la marque");
			System.out.println("2- Affichage des voitures de la liste");
			System.out.println("3- Supression d'une voiture de la liste");
			System.out.println("4- Augmentation du kilometrage d'une voiture de la liste");
			System.out.println("5- Comparaisons du kilometrage de voitures dans la liste");
			System.out.println("6- Ajouter cinq voitures predefinies a la liste");
			System.out.println("0- Quitter");


			sousmenu = scan.nextInt();

			// Creation switch-case pour le menu, en utilisant les methodes definies plus bas

			switch (sousmenu) {

			case 1:
				System.out.println("Ajout et creation d'une voiture:");
				ajouterVoiture();
				System.out.println("----------------------------------------------------------------------");
				break;
			case 2:
				System.out.println("Affichage de la liste de voitures:");
				displayListe();
				System.out.println("----------------------------------------------------------------------");
				break;
			case 3:
				System.out.println("Supprimmer une voiture de la liste:");
				supprimerVoiture();
				System.out.println("----------------------------------------------------------------------");
				break;
			case 4:
				System.out.println("Augmenter le kilometrage d'une voiture dans la liste:");
				augmenterKilometrage();
				System.out.println("----------------------------------------------------------------------");
				break;
			case 5:
				System.out.println("Comparer le kilometrage de deux voitures dans la liste:");
				comparerVoiture();
				System.out.println("----------------------------------------------------------------------");
				break;
			case 6:
				System.out.println("Ajouter cinq voitures predefinies a la liste");
				ajouterCinqvoiture();
				System.out.println("----------------------------------------------------------------------");
				break;
			case 0:
				arret = true;
				break;

			default:
				System.out.println("Entree invalide, veuillez reessayer.");
				System.out.println("----------------------------------------------------------------------");
				break;

			}

		}

	}

	// Creation de la methode pour ajouter des voitures a la liste en choisissant la marque de celle-ci

	private static void ajouterVoiture() {

		int sousmenu1;

		System.out.println("Choisissez la marque de la voiture a ajouter: ");
		System.out.println("1- " + Marques.Audi);
		System.out.println("2- " + Marques.Bmw);
		System.out.println("3- " + Marques.Honda);
		System.out.println("4- " + Marques.Hyundai);
		System.out.println("5- " + Marques.Mazda);
		System.out.println("6- " + Marques.Volkswagen);

		sousmenu1 = scan.nextInt();

		switch (sousmenu1) {
		case 1:
			System.out.println("Vous avez ajoute une voiture de marque : " + Marques.Audi);
			Voiture voiture0 = new Voiture(Marques.Audi, "RS8", 2018, "Noir", 0);
			liste.add(voiture0);
			break;
		case 2:
			System.out.println("Vous avez ajoute une voiture de marque : " + Marques.Bmw);
			Voiture voiture1 = new Voiture(Marques.Bmw, "M3", 2019, "Rouge", 0);
			liste.add(voiture1);
			break;
		case 3:
			System.out.println("Vous avez ajoute une voiture de marque : " + Marques.Honda);
			Voiture voiture2 = new Voiture(Marques.Honda, "Civic", 2019, "Blanc", 0);
			liste.add(voiture2);
			break;
		case 4:
			System.out.println("Vous avez ajoute une voiture de marque : " + Marques.Hyundai);
			Voiture voiture3 = new Voiture(Marques.Hyundai, "Genesis", 2019, "Orange", 0);
			liste.add(voiture3);
			break;
		case 5:
			System.out.println("Vous avez ajoute une voiture de marque : " + Marques.Mazda);
			Voiture voiture4 = new Voiture(Marques.Mazda, "RX8", 2010, "Jaune", 0);
			liste.add(voiture4);
			break;
		case 6:
			System.out.println("Vous avez ajoute une voiture de marque : " + Marques.Volkswagen);
			Voiture voiture5 = new Voiture(Marques.Volkswagen, "Golf", 2012, "Vert", 0);
			liste.add(voiture5);
			break;

		default:
			System.out.println("Entree invalide, veuillez reessayer.");
			System.out.println("----------------------------------------------------------------------");
			ajouterVoiture();
			break;

		}
	}

	// Creation de la methode pour afficher la liste, si il y a des voitures dans la liste.

	private static void displayListe() {

		int index = 1;
		if (liste.isEmpty()) {

			System.out.println("La liste est vide.");
		}else {

			for (Voiture m : liste) {

				System.out.println((index++) + ": " + m);
			}
		}
	}

	// Creation de la methode pour supprimer une voiture de la liste.

	private static void supprimerVoiture() {
		int choix;

		if (liste.isEmpty()) {
			System.out.println("La liste est vide");

		} else {
			displayListe();
			System.out.println("Choisir une voiture a supprimer de la liste: ");
			choix = scan.nextInt();

			if (choix >= 1 && choix <= liste.size()) {
				liste.remove(choix - 1);
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Merci. Voiture supprimer de la liste.");

			} else {
				System.out.println("Entree invalide, veuillez reessayer.");
				System.out.println("----------------------------------------------------------------------");
				supprimerVoiture();
			}

		}

	}

	// Creation de la methode pour augmenter le kilometrage d'une voiture de la liste

	private static void augmenterKilometrage() {
		int choix;
		int kilom;

		if (liste.isEmpty()) {
			System.out.println("La liste est vide.");
		} else {
			displayListe();
			System.out.println("Choisir une voiture: ");
			choix = scan.nextInt();
			if (choix >= 1 && choix <= liste.size()) {

				Voiture voiture = liste.get(choix - 1);
				System.out.println("Entrez le kilometrage a ajouter a la voiture: ");
				kilom = scan.nextInt();
				voiture.ajoutKilometrage(kilom);

			} else {

				System.out.println("Entree invalide, veuillez reessayer.");
				System.out.println("----------------------------------------------------------------------");
				augmenterKilometrage();
			}

		}

	}

	// Creation de la methode pour comparer 2 voitures dans la liste. (si il y a au moin 2 voiture dans la liste)

	private static void comparerVoiture() {

		int choix1, choix2;

		if (liste.size() < 2) {
			System.out.println("La liste est vide ou ne contient pas assez de voitures pour une comparaison.");
		} else {

			displayListe();

			System.out.println("Choisir la premiere voiture a comparer:");
			while (true) {
				choix1 = scan.nextInt();
				if (choix1 >= 1 && choix1 <= liste.size())
					break;
				System.out.println("Choix invalide, rechoisissez une voiture");
			}

			System.out.println("Choisir la deuxieme voiture a comparer:");
			while(true) {
				choix2 = scan.nextInt();
				if (choix2 >= 1 && choix2 <= liste.size())
					break;
				System.out.println("Choix invalide, rechoisissez une voiture");
			}


			Voiture voiture = liste.get(choix1 - 1);
			Voiture voiture0 = liste.get(choix2 - 1);


			if (voiture.getKilometrage() < voiture0.getKilometrage()) {

				System.out.println("La voiture de " + voiture0 + "\n\t\t a le plus de kilometrage au compteur.");

			} else if (voiture.getKilometrage() > voiture0.getKilometrage()) {

				System.out.println("La voiture de " + voiture + "\n\t\t a le plus de kilometrage au compteur.");
			}

			else {
				System.out.println("Les voitures suivantes: " + voiture + " \net " + voiture0 + "\nont le meme nombre de kilometres au compteur.");
			}

		}
	}

	// Creation de la methode pour ajouter 5 voitures predefinies a la liste

	private static void ajouterCinqvoiture() {

		Voiture voiture6 = new Voiture(Marques.Volkswagen, "Golf", 2012, "Vert", 23242);
		liste.add(voiture6);
		Voiture voiture7 = new Voiture(Marques.Honda, "Prelude", 2009, "Noir", 111992);
		liste.add(voiture7);
		Voiture voiture8 = new Voiture(Marques.Hyundai, "Elentra", 2020, "Rose", 0);
		liste.add(voiture8);
		Voiture voiture9 = new Voiture(Marques.Bmw, "X8", 2019, "Argent", 1434);
		liste.add(voiture9);
		Voiture voiture10 = new Voiture(Marques.Volkswagen, "Corrado VR6", 2002, "Rouge", 342545);
		liste.add(voiture10);


		System.out.println("Vous avez ajoute cinq voitures a la liste.");



	}
}
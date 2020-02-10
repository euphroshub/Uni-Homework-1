//Code by K. Hardy and G. Colombi

public class Voiture {

	// Creation des variables

	private Marques marque;
	private String modele;
	private int annee;
	private String couleur;
	private int kilometrage;

	// Creation du constructeur

	public Voiture(Marques marke, String model, int year, String color, int kilo){
		marque = marke;
		modele = model;
		annee = year;
		couleur = color;
		kilometrage = kilo;
	}

	// Creation d'une methode permettante d'augmenter le kilometrage d'un certain nombre

	public int ajoutKilometrage(int kilo) {
		kilometrage = (kilometrage + kilo);
		return kilometrage;
	}

	// Methode toString avec toute les variables d'une voiture

	public String toString() {
		return("Marque: " + marque +" | " + "Modele: " + modele +" | " + "Annee: " + annee + " | " + "Couleur: " 
				+ couleur + " | " + "Kilometrage: " + kilometrage);
	}

	// Creation des Accesseurs

	public Marques getMarque() {
		return marque;
	}

	public String getModele() {
		return modele;
	}

	public int getAnnee() {
		return annee;
	}

	public String getCouleur() {
		return couleur;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	// Creation des Mutateurs

	public void setMarque(Marques marke) {
		marque = marke;
	}

	public void setModele(String model) {
		modele = model;
	}

	public void setAnnee(int year) {
		annee = year;
	}

	public void setCouleur(String color) {
		couleur = color;
	}

	public void setKilometrage(int kilo) {
		kilometrage = kilo;
	}



}

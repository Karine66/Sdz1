package com.karine.Sdz1;

public class Ville {
    /* Stocke le nom de notre ville */
    private String nomVille;
    /*Stocke le nom du pays de notre ville*/
    private String nomPays;
    /*Stocke le nombre d'habitants de notre ville*/
    private int nbreHabitants;

    /*Constructeur par défaut*/
    public Ville(){
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        int nbreHabitants = 0;
    }

    /*Constructeur avec paramètres*/
    /*J'ai ajouté un "p" en première lettre des paramètres*/
    /*Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer*/
    public Ville(String pNom, int pNbre, String pPays, int nbreHabitants)
    {
        System.out.println("Création d'une ville avec des paramètres !");
        nomVille = pNom;
        nomPays = pPays;
        nbreHabitants = pNbre;
    }

    public Ville(String marseille, int i, String france) {

    }
}

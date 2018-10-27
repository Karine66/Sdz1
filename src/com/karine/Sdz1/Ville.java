package com.karine.Sdz1;

public class Ville {
    /* Stocke le nom de notre ville */
    private String nomVille;
    /*Stocke le nom du pays de notre ville*/
    private String nomPays;
    /*Stocke le nombre d'habitants de notre ville*/
    private int nbreHabitants;
    private char categorie;

    /*Constructeur par défaut*/
    Ville() {
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitants = 0;
        this.setCategorie();
    }

    /*Constructeur avec paramètres*/
    /*J'ai ajouté un "p" en première lettre des paramètres*/
    /*Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer*/
    Ville(String pNom, int pNbre, String pPays) {
        System.out.println("Création d'une ville avec des paramètres !");
        nomVille = pNom;
        nomPays = pPays;
        nbreHabitants = pNbre;
        this.setCategorie();
        nbreInstances++;
        nbreInstancesBis++;
    }

    /*Accesseurs (Getter)*/
    /*Retourne le nom de la ville*/
    public String getNom() {
        return nomVille;
    }

    /*Retourne le nom du pays*/
    public String getNomPays() {
        return nomPays;
    }

    /*Retourne le nombre d'habitants*/
    public int getNbreHabitants() {
        return nbreHabitants;
    }

    /*Mutateurs (Setter)*/

    /*Définit le nom de la ville*/
    public void setNom(String pNom) {
        nomVille = pNom;
    }

    /*Définit le nom du pays*/
    public void setNomPays(String pPays) {
        nomPays = pPays;
    }

    /*Définit le nombre d'habitants*/
    public void setNombreHabitants(int nbre) {
        nbreHabitants = nbre;
        this.setCategorie();
    }

    /*
Définit la catégorie de la ville
 */
    private void setCategorie() {

    }

    {

        int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int i = 0;

        this.categorie = categories[i];
    }

    /*
    Retourne la description de la ville
     */
    public String decrisToi() {
        return "\t" + this.nomVille + " est une ville de " + this.nomPays + " , elle comporte : " + this.nbreHabitants + " habitant(s) => elle est donc de catégorie : " + this.categorie;
    }

    /*Retourne une chaine de caractères selon le résultat de la comparaison
     */
    public String comparer(Ville v1) {
        String str;

        if (v1.getNbreHabitants() > this.nbreHabitants)
            str = v1.getNom() + " est une ville plus peuplée que " + this.nomVille;

        else str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();

        return str;
    }

    /*
    Variable publiques qui comptent les instances
     */
    public static int nbreInstances = 0;

    /*
    Variable privée qui comptera aussi les instances
     */
    private static int nbreInstancesBis = 0;


    public static int getNbreInstancesBis()
    {
        return nbreInstancesBis;
    }
}




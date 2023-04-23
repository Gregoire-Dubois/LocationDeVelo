package fr.eni.ecole.locationDeVelo.test;


import fr.eni.ecole.locationDeVelo.bo.Gyropode;

public class TestGyropode {

    public static void main(String[] args) {

        Gyropode gyropode = new Gyropode("marque", "modele", 45, 23, 213);
        gyropode.display();


    }

}

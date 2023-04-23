package fr.eni.ecole.locationDeVelo.test;
import fr.eni.ecole.locationDeVelo.bo.Velo;
import java.time.LocalDate;

public class TestVelo {

    public static void main(String[] args) {

        Velo velo1 = new Velo("lapierre", "345", LocalDate.of(2020, 02,19), 27);
        velo1.display();

        Velo velo2 = new Velo("Btwin", "riverside 900", LocalDate.of(2022, 02,19), 10);
        velo2.display();

    }

}

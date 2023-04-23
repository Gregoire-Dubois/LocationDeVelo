package fr.eni.ecole.locationDeVelo.bo;


public class Gyroroue extends ElectricTransportation{

    public Gyroroue(String brand, String model, int autonomyInKm, double price) {
        super(brand, model, autonomyInKm, price);
    }

    @Override
    public String toString() {
        return "Gyroroue{" +
                "autonomyInKm=" + autonomyInKm +
                ", price=" + price +
                '}';
    }
}

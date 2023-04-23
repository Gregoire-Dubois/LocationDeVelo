package fr.eni.ecole.locationDeVelo.bo;

public class ElectricTransportation extends SoftTransportation{
    int autonomyInKm;
    double price;

    public ElectricTransportation(String brand, String model, int autonomyInKm, double price) {
        super(brand, model);
        this.autonomyInKm = autonomyInKm;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectricTransportation{" +
                "autonomyInKm=" + autonomyInKm +
                ", price=" + price +
                '}';
    }

    public int getAutonomyInKm() {
        return autonomyInKm;
    }

    public double getPrice() {
        return price;
    }


}

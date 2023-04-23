package fr.eni.ecole.locationDeVelo.bo;

public class SoftTransportation {

    private String brand;
    private String model;

    public SoftTransportation(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "SoftTransportation{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

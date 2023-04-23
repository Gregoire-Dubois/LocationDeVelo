package fr.eni.ecole.locationDeVelo.bo;

import java.time.LocalDate;

public class Velo extends SoftTransportation{

    private LocalDate purchaseDate;
    private int numberOfSpeedBike;
    private final double price = 4.90;

    public Velo(String brand, String model, LocalDate purchaseDate, int numberOfSpeedBike) {
        super(brand, model);
        this.purchaseDate = purchaseDate;
        this.numberOfSpeedBike = numberOfSpeedBike;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "purchaseDate=" + purchaseDate +
                ", numberOfSpeedBike=" + numberOfSpeedBike +
                ", price=" + price +
                '}';
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public int getNumberOfSpeedBike() {
        return numberOfSpeedBike;
    }

    public double getPrice() {
        return price;
    }

    public void display(){
        System.out.printf( getBrand() +"\n" + getModel() +"\n" + this.purchaseDate +"\n" + this.price);
    }

}

package fr.eni.ecole.locationDeVelo.bo;

public class Gyropode extends ElectricTransportation{
    private int sizeDriver;
    private final double price= 29.90;

    public Gyropode(String brand, String model, int autonomyInKm, double price, int sizeDriver) {
        super(brand, model, autonomyInKm, price);
        this.sizeDriver = sizeDriver;
    }

    @Override
    public String toString() {
        return "Gyropode{" +
                "sizeDriver=" + sizeDriver +
                ", price=" + price +
                ", autonomyInKm=" + autonomyInKm +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }


    public void display(){
        System.out.println(this.getBrand()+ "\n"+ this.getModel() + "\n" + this.getAutonomyInKm() +"\n" + this.getPrice()+ "\n"+ this.sizeDriver);
    }


}

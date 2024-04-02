package entities;  

public class importedProduct extends Product {
    private double customsFee;

    public importedProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public String priceTag(String name, double price) {
        return String.format("%s $ %f %f", name, price, this.customsFee);
    }

}
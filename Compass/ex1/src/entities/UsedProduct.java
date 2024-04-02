package entities;

import java.sql.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    public UsedProduct(String name, double price) {
        super(name, price);
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
    
    public void setMagufactuDate(Date manufaturDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(String name, double price) {
        return String.format("%s $ %f %f", name, price, this.manufactureDate);
    }

}
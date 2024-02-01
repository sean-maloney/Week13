package ie.atu.productv5;

public class Television extends Product {

    private String brand;

    private String size;

    public Television() {
        super();
        brand = "";
        count++;
        size = "";
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    @Override
    public String toString() {
        return super.toString() + " " + brand + "\n" + size;
    }

    public void setSize(String size) {this.size = size; }

    public String getSize(){return size;}
}
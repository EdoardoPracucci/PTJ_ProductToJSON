package Model;

public class Product {
    private int id;
    private String name;
    private String companyName;
    private double price;

    public Product() {
        this.id = 0;
        this.name = "";
        this.companyName = "";
        this.price = 0;
    }

    public Product(int id, String name, String companyName, double price) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

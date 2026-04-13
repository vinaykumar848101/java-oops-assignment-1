// Product class to demonstrate encapsulation
class Product {

    // private variables
    private int price;
    private String name;

    // setter for price
    public void setPrice(int p) {
        price = p;
    }

    // getter for price
    public int getPrice() {
        return price;
    }

    // setter for name
    public void setName(String n) {
        name = n;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // TEMPORARY main method
    public static void main(String[] args) {

        Product p = new Product();

        // setting values
        p.setName("Iphone");
        p.setPrice(50000);

        // getting values
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Price: " + p.getPrice());
    }
}
class ProductBilling {

    void calculateBill(int a) {
        System.out.println("\nTotal Bill (1 product): " + a);
    }

    void calculateBill(int a, int b) {
        System.out.println("Total Bill (2 products): " + (a + b));
    }

    void calculateBill(int a, int b, int c) {
        System.out.println("Total Bill (3 products): " + (a + b + c));
    }
    public static void main(String[] args) {

        ProductBilling bill = new ProductBilling();

        // calling overloaded methods
        bill.calculateBill(100);
        bill.calculateBill(100, 200);
        bill.calculateBill(100, 200, 300);
    }
}
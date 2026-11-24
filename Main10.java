class Product{
    String productName;
    int quantity;
    double price;

    Product(){
        productName="Unknown";
        quantity=1;
        price=100;
    }
    Product(String productName){
        this.productName=productName;
        quantity=1;
        price=100;
    }
     Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void calculationTotal(){
        System.out.println("Total Price: "+(quantity*price));
    }
}

public class Main10 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 5, 25.99);

        p1.calculationTotal();
        p2.calculationTotal();
        p3.calculationTotal();
    }
}

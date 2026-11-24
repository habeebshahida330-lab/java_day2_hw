abstract class Delivery{
    abstract void deliverProduct();

    void acceptOrder(){
        System.out.println("Delivery order accepted");
    }
}
class FoodDelivery extends Delivery{
    @Override
    void deliverProduct() {
        System.out.println("Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery{
    @Override
    void deliverProduct() {
        System.out.println( "Parcel delivered successfully");
    }
}


public class Main3 {
    public static void main(String[] args) {
        Delivery f = new FoodDelivery();
        Delivery p = new ParcelDelivery();
        f.acceptOrder();
        f.deliverProduct();
        p.acceptOrder();
        p.deliverProduct();
    }
}
abstract class Vehicle {
    abstract void startEngine();
     void stopEngine(){
        System.out.println("Vehicle engine stopped");
    }
    

}
class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started using self-start mechanism");
    }
}
class Main{
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}
interface Alert {

    void sendAlert(String message);
}

class EmailAlert implements Alert {

    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}

class MobileAlert implements Alert {

    public void sendAlert(String message) {
        System.out.println("Mobile Alert: " + message);
    }
}

public class Main5{
    public static void main(String[] args) {

        EmailAlert e = new EmailAlert();
        MobileAlert m = new MobileAlert();

        e.sendAlert("Your order is confirmed");
        m.sendAlert("Your order is confirmed");
    }
}
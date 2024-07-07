package projects.paymentServices;

import java.util.*;

// PaymentServices class
public class PaymentServices {
    private HashMap<String, PaymentMethod> paymentMethods = new HashMap<>();

    public void addPaymentMethod(String name, PaymentMethod method) {
        paymentMethods.put(name,method);
    }

    public void makePayment(String name){
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay();
    }

    // Additional methods can be implemented as needed
}
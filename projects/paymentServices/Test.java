package projects.paymentServices;

public class Test {

    // main funciton of the class test
    public static void main(String[] args) {
        PaymentServices ps = new PaymentServices();
        ps.addPaymentMethod("Jaswanth",  new DebitCard("12104841", "Jaswanth", "HDFC"));
        
    }
}

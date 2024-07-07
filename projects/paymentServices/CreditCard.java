package projects.paymentServices;

// CreditCard class extends Card
public class CreditCard extends Card implements PaymentMethod {
    private String exp;
    private String cvv;

    public CreditCard(String cardNo, String name, String exp, String cvv) {
        super(cardNo, name);
        this.exp = exp;
        this.cvv = cvv;
    }

    String getExp(){
        return this.exp;
    }

    String getCvv(){
        return this.cvv;
    }

    @Override
    public void pay() {
        // CreditCard payment implementation
    }
}
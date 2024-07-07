package projects.paymentServices;

// DebitCard class extends Card
public class DebitCard extends Card implements PaymentMethod {
    private String account;

    public DebitCard(String cardNo, String name, String account) {
        super(cardNo, name);
        this.account = account;
    }

    String getAccount(){
        return this.account;
    }

    @Override
    public void pay() {
        // DebitCard payment implementation
    }
}
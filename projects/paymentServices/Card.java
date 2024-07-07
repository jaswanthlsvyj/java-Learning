package projects.paymentServices;

// Abstract class Card
public abstract class Card implements PaymentMethod {
    protected String cardNo;
    protected String name;

    public Card(String cardNo, String name) {
        this.cardNo = cardNo;
        this.name = name;
    }

    String getCardNo(){
        return this.cardNo;
    }

    String getName(){
        return this.name;
    }

    public abstract void pay();
}
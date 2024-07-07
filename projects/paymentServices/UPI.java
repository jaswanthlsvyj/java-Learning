package projects.paymentServices;

// UPI class implements PaymentMethod
public class UPI implements PaymentMethod {
    private String handle;
    private int accountNo;

    public UPI(String handle, int accountNo) {
        this.handle = handle;
        this.accountNo = accountNo;
    }

    String getHandle(){
        return this.handle;
    }

    int getAccountNo(){
        return this.accountNo;
    }

    @Override
    public void pay() {
        // UPI payment implementation
        System.out.println("Making payment via UPI from "+accountNo);
    }
}

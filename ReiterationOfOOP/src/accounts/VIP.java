package accounts;

public class VIP extends Account {
    @Override
    public void addDeposit(double deposit) {
        balance += deposit*0.95;
    }

    @Override
    public void toPay(double payment) {
        balance -= payment;
    }
}

package baseclass;

public class FraudRule2 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
    @Override
    public String getRuleName() {
        return "FraudRule2";
    }
}

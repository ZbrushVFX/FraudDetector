package baseclass;

public class FraudRule1 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }
    @Override
    public String getRuleName() {
        return "FraudRule1";
    }
}

package baseclass;

public class FraudDetector {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        if (transaction.getAmount() > 1000000) {
            return true;
        }
        if (transaction.getTrader().getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }
}

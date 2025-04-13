package baseclass;

public interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}

package students.jana_sergejenko.lesson_9.level_5.task_22;

class FraudDetector {
    private FraudRule[] fraudrule;

    FraudDetector(FraudRule[] fraudrule) {
        this.fraudrule = fraudrule;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fd : fraudrule) {
            if (fd.isFraud(t)) {
                fd.getruleName();
            }
        }
        return null;
    }

    /*boolean isFraud(Transaction t) {
        return (isFraudTrader(t)||isFraudAmount(t)||isFraudCity(t)||isFraudCountry(t));

    boolean isFraudTrader(Transaction t) {
        return t.gettrader().getfullName().contains("Pokemon");
    }

    boolean isFraudAmount(Transaction t) {
        return (t.getamount() > 1000000) ;
    }

    boolean isFraudCity(Transaction t) {
        return t.gettrader().getcity().equals("Sidney") || t.gettrader().getcity().equals("Jamaica");
    }
    boolean isFraudCountry(Transaction t) {
        return t.gettrader().getcountry().equals("Germany") && (t.getamount() > 100);
    }*/
}
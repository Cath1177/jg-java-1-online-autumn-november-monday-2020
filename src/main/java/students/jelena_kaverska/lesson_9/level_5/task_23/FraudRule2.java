package students.jelena_kaverska.lesson_9.level_5.task_23;

class FraudRule2 extends FraudRule {

    FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
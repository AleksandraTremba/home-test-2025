package ee.taltech.inbankbackend.config;

import java.util.Map;

/**
 * Holds all necessary constants for the decision engine.
 */
public class DecisionEngineConstants {
    public static final Integer MINIMUM_LOAN_AMOUNT = 2000;
    public static final Integer MAXIMUM_LOAN_AMOUNT = 10000;
    public static final Integer MAXIMUM_LOAN_PERIOD = 60;
    public static final Integer MINIMUM_LOAN_PERIOD = 12;
    public static final Integer SEGMENT_1_CREDIT_MODIFIER = 100;
    public static final Integer SEGMENT_2_CREDIT_MODIFIER = 300;
    public static final Integer SEGMENT_3_CREDIT_MODIFIER = 1000;
    private static final Map<String, Integer> MINIMUM_AGE_FOR_LOAN = Map.of(
            "Estonia", 18,
            "Latvia", 18,
            "Lithuania", 18
    );

    private static final Map<String, Integer> MAXIMUM_AGE_FOR_LOAN = Map.of(
            "Estonia", 75,
            "Latvia", 65,
            "Lithuania", 70
    );

    public static Map<String, Integer> getMinimumAgeForLoan() {
        return MINIMUM_AGE_FOR_LOAN;
    }

    public static Map<String, Integer> getMaximumAgeForLoan() {
        return MAXIMUM_AGE_FOR_LOAN;
    }
}

package ee.taltech.inbankbackend.config;

import java.util.HashMap;
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
    public static final Map<String, Integer> MINIMUM_AGE_FOR_LOAN =  new HashMap<>();
    public static final Map<String, Integer> MAXIMUN_AGE_FOR_LOAN =  new HashMap<>();
    static {
        MINIMUM_AGE_FOR_LOAN.put("Estonia", 18);
        MINIMUM_AGE_FOR_LOAN.put("Latvia", 18);
        MINIMUM_AGE_FOR_LOAN.put("Lithuania", 18);

        MAXIMUN_AGE_FOR_LOAN.put("Estonia", 75);
        MAXIMUN_AGE_FOR_LOAN.put("Latvia", 65);
        MAXIMUN_AGE_FOR_LOAN.put("Lithuania", 70);
    }
}

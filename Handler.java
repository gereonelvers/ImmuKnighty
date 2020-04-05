package example;

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.LambdaLogger

import java.util.Map;

/*
 * This is an untested class intended to show a possible path towards realizing the concept through in AWS Lambda.
 * It is not intended to be deployed directly but rather serves more of a 'mock-up' purpose.
 * */
public class Handler implements RequestHandler<Map<String, String>, String> {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /*
     * This handler receives a Map of Strings that resemble the new user registered in the database.
     * Based on these values it returns a 'risk score' for that user
     *
     * Reminder:
     * 0 - very low risk
     * 1- low risk
     * 2 - intermediate risk
     * 3 - high risk
     */
    @Override
    public Integer handleRequest(example.User user, Context context) {
        int riskValue = 0;
        if (user.isHadAntibodyResponse()) {
            riskValue -= 2;
        }
        if (user.isHadInfection()) {
            riskValue -= 1;
        }

        if (user.getUserAge() >= 60) {
            riskValue += 2;
        }

        if (user.isHasSensibleCondition()) {
            riskValue += 1;
        }

        if (user.isSmoker()) {
            riskValue += 1;
        }
        if (user.getUserWeight() != 0) {
            riskValue += 1;
        }

        if (riskValue<0){
            riskValue=0;
        }
        if (riskValue>3){
            riskValue=3;
        }


        return riskValue;
    }
}
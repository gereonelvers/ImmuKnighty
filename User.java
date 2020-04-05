package example;

/*
* This is an untested class intended to show a possible path towards realizing the concept through in AWS Lambda.
* It is not intended to be deployed directly but rather serves more of a 'mock-up' purpose.
* */
public class User {
    private String userId;
    private String hospitalId;
    private String userName;
    private boolean hadAntibodyResponse;
    private boolean hadInfection;
    private int userAge;
    private boolean hasSensibleCondition;
    private boolean isSmoker;
    private int userWeight;


    public User(String mUserId,
                String mHospitalId,
                String mUserName,
                boolean mHadAntibodyResponse,
                boolean mHadInfection,
                int mUserAge,
                boolean mHasSensibleCondition,
                boolean mIsSmoker,
                int mUserWeight) {
        userId = mUserId;
        hospitalId = mHospitalId;
        userName = mUserName;
        hadAntibodyResponse = mHadAntibodyResponse;
        hadInfection = mHadInfection;
        userAge = mUserAge;
        hasSensibleCondition = mHasSensibleCondition;
        isSmoker = mIsSmoker;
        userWeight = mUserWeight;

    }

    public int getUserAge() {
        return userAge;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setHadAntibodyResponse(boolean hadAntibodyResponse) {
        this.hadAntibodyResponse = hadAntibodyResponse;
    }

    public void setHadInfection(boolean hadInfection) {
        this.hadInfection = hadInfection;
    }

    public void setHasSensibleCondition(boolean hasSensibleCondition) {
        this.hasSensibleCondition = hasSensibleCondition;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

    public boolean isHasSensibleCondition() {
        return hasSensibleCondition;
    }

    public boolean isHadAntibodyResponse() {
        return hadAntibodyResponse;
    }

    public boolean isHadInfection() {
        return hadInfection;
    }

    public boolean isSmoker() {
        return isSmoker;
    }
}

public class User {
    private String username;
    private String password;
    private double budget;
    private int riskProfile;

    public User(String username, String password, double budget, int riskProfile) {
        this.username = username;
        this.password = password;
        this.budget = budget;
        this.riskProfile = riskProfile;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public double getBudget(){
        return budget;
    }
    public int getRiskProfile(){
        return riskProfile;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setBudget(double budget){
        this.budget = budget;
    }
    public void setRiskProfile(int riskProfile){
        this.riskProfile = riskProfile;
    }


}

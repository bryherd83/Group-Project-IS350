public class Stability extends Stratgey {
    private double baseMaxBeta;
    private double baseMinDividend;

    public Stability (double baseMaxBeta, double baseMinDividend){
        super("Stability");
        this.baseMaxBeta = baseMaxBeta;
        this.baseMinDividend = baseMinDividend;
    }
    public double getBaseMaxBeta(){
        return baseMaxBeta;
    }
    public double getBaseMinDividend(){
        return baseMinDividend;
    }
    public void setBaseMaxBeta(double baseMaxBeta){
        this.baseMaxBeta = baseMaxBeta;
    }
    public void setBaseMinDividend(double baseMinDividend){
        this.baseMinDividend = baseMinDividend;
    }
    public double score(Stock stock, User user){
        if(stock.getBeta() > baseMaxBeta){
            return 0.0;
        }
        if (stock.getDividendYield() < baseMinDividend){
            return 0.0;
        }
        return stock.getDividendYield() * 100;
    }
    public double adjustThreshold(double base, User user){
        return base;
    }

    public String explain(Stock stock, User user){
        return stock.getTicker() + "has acceptable beta and dividend yield";

    }
}

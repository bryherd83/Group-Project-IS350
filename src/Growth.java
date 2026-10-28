public class Growth extends Stratgey{
private double baseMinGrowth;

public Growth(double baseMinGrowth){
    super ("Growth");
    this.baseMinGrowth = baseMinGrowth;
}

public double getBaseMinGrowth(){
    return baseMinGrowth;
}
public void setBaseMinGrowth(double baseMinGrowth){
    this.baseMinGrowth = baseMinGrowth;
}

public String explain(Stock stock, User user){
    return stock.getTicker() + "exceeds minimum growth thresehold of" + baseMinGrowth;
}

public double score(Stock stock, User user){
    if(stock.getRevenueGrowth() < baseMinGrowth){
        return 0.0;
    }
    return stock.getRevenueGrowth();
}

public double adjustThreshold(double base, User user)
{
    return base;
}

}

public class Stock {
    private String ticker;
    private String companyName;
    private double price;
    private double revenueGrowth;
    private double dividendYield;
    private double beta;

    public Stock(String ticker, String companyName, double price, double revenueGrowth, double dividendYield, double beta) {
        this.ticker = ticker;
        this.companyName = companyName;
        this.price = price;
        this.revenueGrowth = revenueGrowth;
        this.dividendYield = dividendYield;
        this.beta = beta;

    }
    public String getTicker(){
        return ticker;
    }
    public String getCompanyName(){
        return companyName;
    }
    public double getPrice(){
        return price;
    }
    public double getRevenueGrowth(){
        return revenueGrowth;
    }
    public double getDividendYield(){
        return dividendYield;
    }
    public double getBeta(){
        return beta;
    }

}

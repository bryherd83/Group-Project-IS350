public abstract class Stratgey {

   protected String name;

   public Stratgey(String name){
       this.name = name;
   }

   public String getName(){
       return name;
   }

   public abstract double adjustThreshold(double base, User user);

   public abstract double score (Stock stock, User user);

   public abstract String explain(Stock stock, User user);

}

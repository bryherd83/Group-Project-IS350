import java.util.List;

public class Main{
    public static void main(String[] args){
        IO.println("Welcome to the Stock Suggestion System");
        IO.println("Username:");
        String username = IO.readln();
        IO.println("Password:");
        String password = IO.readln();
        User user = new User(username, password);

        IO.println("What is your Budget?");
        double budget = Double.parseDouble(IO.readln());

        user.setBudget(budget);

        IO.println("""
                Select Risk Profile:
                1. Stability
                2. Growth
                """);
        int choice = Integer.parseInt(IO.readln());
        Stratgey stratgey;

        if(choice == 1) {
            user.setRiskProfile(1);
            stratgey = new Stability(1.2, 0.03)
        } else {
            user.setRiskProfile(2);
            stratgey = new Growth(0.15);
        }
        }
    }

import java.util.Scanner;

public class RewardsConverter {

    public class RewardValue {
        private double cashValue;
        private double milesValue;

        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashValue / 0.0035;
        }

        public double getCashValue() {
            return this.cashValue;
        }

        public double getMilesValue() {
            return this.milesValue;
        }
    }

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");

        // Create a RewardsConverter object
        RewardsConverter rewardsConverter = new RewardsConverter();

        // Create a RewardValue object
        RewardValue rewardsValue = rewardsConverter.new RewardValue(cashValue);

        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
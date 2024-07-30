package Datastructure;
public class FinancialForecasting {

    // Recursive method to calculate the future value
    public static double calculateFutureValueRecursive(double currentValue, double growthRate, int periods) {
        // Base case: if no periods are left, return the current value
        if (periods <= 0) {
            return currentValue;
        }
        // Recursive case: calculate the future value for the remaining periods
        return calculateFutureValueRecursive(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    // Iterative method to calculate the future value
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int periods) {
        double futureValue = currentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment
        double growthRate = 0.05;     // Growth rate (5%)
        int periods = 10;             

        // Calculate future value using recursive method
        double futureValueRecursive = calculateFutureValueRecursive(initialValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods (Recursive): rupees " + futureValueRecursive);

        // Calculate future value using iterative method
        double futureValueIterative = calculateFutureValueIterative(initialValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods (Iterative): rupees " + futureValueIterative);
    }
}

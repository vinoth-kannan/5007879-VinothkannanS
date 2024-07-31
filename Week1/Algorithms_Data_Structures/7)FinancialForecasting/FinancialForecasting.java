import java.util.HashMap;

public class FinancialForecasting {

    private static HashMap<Integer, Double> memo = new HashMap<>();

    // Recursive method with memoization to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if periods is 0, return the present value
        if (periods == 0) {
            return presentValue;
        }
        // Check if result is already calculated
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }
        // Recursive case: calculate future value for (periods - 1) and apply growth rate
        double previousValue = calculateFutureValue(presentValue, growthRate, periods - 1);
        double futureValue = previousValue * (1 + growthRate);
        // Store the result in memo
        memo.put(periods, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // initial value
        double growthRate = 0.05; // 5% growth rate
        int periods = 10; // number of periods

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}

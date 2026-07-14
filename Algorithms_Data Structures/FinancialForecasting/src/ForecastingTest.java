public class ForecastingTest {

    // Recursive implementation to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base Case: 0 periods remaining, return the current valuation
        if (periods == 0) {
            return currentValue;
        }
        
        // Recursive Step: Multiply by (1 + growthRate) and solve for (periods - 1)
        return calculateFutureValue(currentValue * (1.0 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== Financial Forecasting Tool ===");

        double initialValuation = 1000.00; // Starting capital
        double annualGrowthRate = 0.05;   // 5% growth rate
        int forecastingYears = 10;        // Forecast for 10 years

        System.out.println("Initial Capital: $" + initialValuation);
        System.out.println("Expected Annual Growth: " + (annualGrowthRate * 100) + "%");
        System.out.println("Forecast Horizon: " + forecastingYears + " years");
        System.out.println();

        // Run recursive forecasting
        System.out.println("--- Starting Recursive Calculation ---");
        double futureValue = calculateFutureValue(initialValuation, annualGrowthRate, forecastingYears);
        System.out.printf("Predicted Asset Value after %d years: $%.2f%n", forecastingYears, futureValue);
        System.out.println();

        // Run recursive forecasting for short-term (5 years)
        System.out.println("--- Starting Recursive Calculation (5 Years) ---");
        double shortTermValue = calculateFutureValue(initialValuation, annualGrowthRate, 5);
        System.out.printf("Predicted Asset Value after 5 years: $%.2f%n", 5, shortTermValue);
        System.out.println();

        System.out.println("SUCCESS: Financial forecasting recursive calculations completed.");
    }
}

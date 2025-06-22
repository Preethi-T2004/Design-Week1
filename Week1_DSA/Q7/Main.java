public class Main {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 0.05; // 5%
        int years = 10;

        System.out.println("Recursive Forecast:");
        double recursiveResult = Forecast.predictFutureValueRecursive(principal, rate, years);
        System.out.printf("Future Value (Recursive): ₹%.2f%n", recursiveResult);

        System.out.println("\nMemoized Forecast:");
        Double[] memo = new Double[years + 1];
        double memoResult = Forecast.predictWithMemo(principal, rate, years, memo);
        System.out.printf("Future Value (Memoized): ₹%.2f%n", memoResult);

        System.out.println("\nIterative Forecast:");
        double iterResult = Forecast.predictIterative(principal, rate, years);
        System.out.printf("Future Value (Iterative): ₹%.2f%n", iterResult);
    }
}

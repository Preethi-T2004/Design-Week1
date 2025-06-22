public class Forecast {

    // Recursive forecast
    public static double predictFutureValueRecursive(double principal, double rate, int years) {
        if (years == 0) return principal;
        return predictFutureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    // Optimized version with memoization
    public static double predictWithMemo(double principal, double rate, int years, Double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != null) return memo[years];
        memo[years] = predictWithMemo(principal, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    // Iterative version (optional for comparison)
    public static double predictIterative(double principal, double rate, int years) {
        for (int i = 0; i < years; i++) {
            principal *= (1 + rate);
        }
        return principal;
    }
}



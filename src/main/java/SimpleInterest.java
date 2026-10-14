public class SimpleInterest {
    public static double calculate(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Principal, rate and time must be non-negative");
        }
        return principal * rate * time / 100.0;
    }

    public static void main(String[] args) {
        double interest = calculate(10000, 5, 2);
        System.out.printf("Simple Interest = %.2f%n", interest);
    }
}

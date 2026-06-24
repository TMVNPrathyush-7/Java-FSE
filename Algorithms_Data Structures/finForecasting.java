import java.util.Scanner;
public class finForecasting {
    static double calculateAmount(double principal, double rate, int period) {
        if (period == 0) {
            return principal;
        }

        return calculateAmount(
                principal * (1 + rate / 100),
                rate,
                period - 1
        );
    }    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Financial Growth Calculator");

        System.out.print("Enter Initial Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Number of Years: ");
        int period = input.nextInt();

        double result = calculateAmount(principal, rate, period);

        System.out.printf("\nAmount after %d years: %.2f",
                period,
                result);

        input.close();
    }
}


import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        double tax = calculateIncomeTax(income);

        if (tax == 0.0) {
            System.out.println("No tax is applicable.");
        } else {
            System.out.println("Your income tax for the year is: $" + tax);
        }

        sc.close();
    }

    public static double calculateIncomeTax(double income) {
        double tax = 0.0;

        if (income <= 10000) {
            tax = 0.0;
        } else if (income <= 20000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 30000) {
            tax = 10000 * 0.10 + (income - 20000) * 0.30;
        } else {
            tax = 10000 * 0.10 + 10000 * 0.30 + (income - 30000) * 0.25;
        }

        return tax;
    }
}

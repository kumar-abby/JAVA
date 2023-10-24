import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double squareRoot = squareRoot(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);
    }
    public static double squareRoot(double number) {
        double a = number / 2;
        double error = 0.0001;
        while (Math.abs(a * a - number) > error) 
        {
            a = (a + number / a) / 2;
        }

        return a;
    }
}
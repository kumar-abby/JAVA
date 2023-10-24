import java.util.Scanner;

public class SumofSq {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sumOfSquares = calculateSumOfSquares(n);
        System.out.println("The sum of squares of the first " + n + " natural numbers is " + sumOfSquares);
    }

    public static int calculateSumOfSquares(int n) {
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }
        return sumOfSquares;
    }
}
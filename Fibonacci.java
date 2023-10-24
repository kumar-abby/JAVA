import java.util.Scanner;

public class Fibonacci{
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();
        if (n <= 0) 
        {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        else 
        {
            printFibonacci(n);
        }
    }
}

import java.util.Scanner;

public class PositiveandNegative {
    static void check(int n)
    {
        if (n> 0) {
            System.out.println("The number is positive.");
        } else if (n < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        check(number);
        
    }
}
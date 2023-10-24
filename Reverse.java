import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Reversed Number: " + reverseNumber(num));
    }

    public static int reverseNumber(int num) {
        int r = 0;
        while (num != 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num /= 10;
        }
        return r;
    }
}
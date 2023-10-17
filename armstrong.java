import java.util.Scanner;

public class armstrong {
    public static boolean isArmstrong(int number) {
        int originalNumber, r, ans = 0;
        int n = 0;
        originalNumber = number;
        while (originalNumber != 0) 
        {
            originalNumber /= 10;
            ++n;
        }
        originalNumber = number;
        while (originalNumber != 0) 
        {
            r = originalNumber % 10;
            ans += Math.pow(r, n);
            originalNumber /= 10;
        }
        return ans == number;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        scanner.close();
        if (isArmstrong(n)) 
        {
            System.out.println(n+"is an Armstrong number.");
        } else 
        {
            System.out.println(n+"is not an Armstrong number.");
        }
    }
}

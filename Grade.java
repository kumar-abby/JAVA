import java.util.Scanner;

public class Grade {
    static void grade(int p)
    {
        if (p >= 90) {
            System.out.println("A Grade");
        } else if (p >= 70) {
            System.out.println("B Grade");
        } else if (p >= 50) {
            System.out.println("C Grade");
        } else {
            System.out.println("D Grade");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the percentage:");
        int percentage = scanner.nextInt();
        grade(percentage);
    }
}
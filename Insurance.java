import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your city:");
        String city = scanner.nextLine();

        double premium = 0;
        if (age >= 25 && age <= 35 && gender.equals("male") && city.equals("Metro")) {
            premium = 0.06;
        } else if (age >= 25 && age <= 40 && gender.equals("male") && city.equals("Non-Metro")) {
            premium = 0.04;
        } else if (age >= 25 && age <= 42 && gender.equals("female") && city.equals("Metro")) {
            premium = 0.03;
        } else if (age >= 25 && age <= 45 && gender.equals("female") && city.equals("Non-Metro")) {
            premium = 0.02;
        } else {
            System.out.println("Not Insured");
        }
        System.out.println("Your premium is " + premium);
    }
}
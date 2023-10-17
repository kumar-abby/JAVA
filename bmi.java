import java.util.*;
public class bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight:");
        double weight=sc.nextDouble();
        System.out.println("Enter the height in cm");
        double height=sc.nextDouble();
        double BMI= weight/(height*height);
        System.out.println("BMI is :"+BMI);
    }
    
}

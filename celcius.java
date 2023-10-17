import java.util.*;
public class celcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Temp. in celcius:");
        double c=sc.nextInt();
        double f=(c*9/5)+32;
        System.out.println("Temperature in farenheit is:"+f);
    }
}

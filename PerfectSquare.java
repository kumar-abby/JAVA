import java.util.*;
import java.lang.Math;
public class PerfectSquare {
    static void isperfect(int number)
    {
        int temp=number;
        int x=(int)Math.sqrt(number);
        if(x*x==temp)
        System.out.println("Perfect square");
        else
        System.out.println("Not Perfect");
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        isperfect(number);
    }
    
}

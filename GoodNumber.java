import java.util.*;
public class GoodNumber {

    static int MultipleSum(int number)
    {
        int sum=0;
        for(int i=1;i<=number;i++)
        {
            if(i%3==0 || i%5==0)
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=MultipleSum(num);
        System.out.println("The sum of multiple of 3 and 5 is:"+sum);
    }
    
}

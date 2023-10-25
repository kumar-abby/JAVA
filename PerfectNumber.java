import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>0)
        {
            if(perfectNum(num))
            System.out.println("Number is perfect");
            else
            System.out.println("Number is not perfect");
        }
        // else
        // System.out.println("Invalid input,please enter a positive integer");
    }
        public static boolean perfectNum(int n)
        {
            int sum=1;
            for(int i=2;i<n/2+1;i++)
            {
                if(n%i==0)
                sum+=i;
            }
            return (sum==n)?true:false;
        }
}

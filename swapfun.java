import java.util.Scanner;

public class swapfun {
    static void swap(int x,int y)
    {
                System.out.println("Numbers before swapping is"+x+" "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Numbers after swapping is"+x+" "+y);
    }
    static void swap2(int a,int b)
    {
        System.out.println("Numbers before swapping is"+a+" "+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Numbers after swapping is"+a+" "+b);
    }
    static void swap3(int m,int n)
    {
        System.out.println("Numbers before swapping is"+m+" "+n);
        m=m*n;
        n=m/n;
        m=m/n;
        System.out.println("Numbers after swapping is"+m+" "+n);
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();


        swap(x,y);
        swap2(a,b);
        swap3(m,n);
    }
    }
    

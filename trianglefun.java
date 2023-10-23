import java.util.Scanner;

public class trianglefun {
    static void checktriangle(int a,int b,int c)
    {
        if(a==b && b==c && c==a)
        System.out.println("triangle is equilateral");
        else if(a!=b && b!=c && c!=a)
        System.out.println("Triangle is Scalene");
        else
        System.out.println("Triangle is Isosceles");
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        checktriangle(a,b,c);
    }
    
}

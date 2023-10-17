import java.util.*;
public class evenodd{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any value");
        int a=sc.nextInt();
        System.out.println((a%2==0)?"Even":"odd");

    }
}
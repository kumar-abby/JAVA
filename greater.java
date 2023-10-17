import java.util.*;
public class greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(((a>b)? a:b):((a>c)?a:c));
    }
    
}

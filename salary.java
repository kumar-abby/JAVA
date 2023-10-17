import java.util.*;
public class salary 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the basic salary");
        double bsalary=sc.nextDouble();
        double netsalary=0;
    double hra=(0.30*bsalary);
    double ta=(0.20*bsalary);
    double da=(0.10*bsalary);
    double pf=1500;
        netsalary=bsalary+hra+ta+da-pf;
        System.out.println("The net salary is:"+netsalary);
    }
    

    
}

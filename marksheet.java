import java.util.*;
public class marksheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter class:");
        String classs=sc.nextLine();
        int maths,science,english,hindi,social;
        System.out.println("Enter marks in Maths:");
        maths=sc.nextInt();
        System.out.println("Enter marks in Science:");
        science=sc.nextInt();
        System.out.println("Enter marks in English:");
        english=sc.nextInt();
        System.out.println("Enter marks in Hindi:");
        hindi=sc.nextInt();
        System.out.println("Enter marks in Social:");
        social=sc.nextInt();
        float avg=0;
        float total=maths+science+english+hindi+social;
        avg=(total)/5;
        float marks=0;
        marks=(total/500)Abby*100;
        System.out.println("Student Name :"+name);
        System.out.println("Maths :"+maths);
                System.out.println("Science :"+ science);
                        System.out.println("English :"+ english);
                                System.out.println("Hindi :"+ hindi);
                                        System.out.println("Social:"+social);
                                        System.out.println("Average marks:"+avg);
                                        System.out.println("Percentage :"+marks);






    }
    
}

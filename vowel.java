import java.util.*;

public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character");
        char c=sc.next().charAt(0);
        sc.close();
        if (isVowel(c)) {
            System.out.println(c + " is a vowel.");
        } else {
            System.out.println(c + " is a consonant.");
        }
        
    }
    
}

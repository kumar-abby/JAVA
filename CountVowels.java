import java.util.*;
public class CountVowels {
    static int Countvowel(String str)
    {
        int vowelcount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vowelcount++;
        }
        return vowelcount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Number of vowels in the given string is:"+Countvowel(str));

    }
    
}

package week_4;

import java.util.Scanner;

abstract class StringOperations{
    public abstract String reverse(String s);
    public abstract int vowelCount(String s);
  }


abstract class StringReverse extends StringOperations  {

    public String reverse(String s) {
        String n = "";

        for (int i = s.length()-1;i>=0;i--){
            n = n + s.charAt(i);

        }
        return n ;
    }

    
}

class UpdatedStrings extends StringReverse{

    public int vowelCount(String s){
        String str = s.toLowerCase();
        int count = 0 ; 
        for (int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c =='o' || c =='u'){
                count++;
            } 
    }
    return count ;
}
}

public class grpa1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    UpdatedStrings str = new UpdatedStrings();
    System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
    System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
  }
}


//passed💀
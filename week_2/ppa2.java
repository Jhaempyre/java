package week_2;

import java.util.Scanner;

public class ppa2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        evenDisplay(s1);
        sc.close();
    }

    static void evenDisplay(String s1){
        int length = s1.length();
        String str2="";
        for(int i = 0; i<length;i=i+2){
            if(i%2==0){
            str2+=s1.charAt(i);
        }
    }  
    System.out.println(str2);    
    }
}

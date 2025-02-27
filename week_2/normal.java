package week_2;

import java.util.Scanner;

public class normal{
    public static void main(String[] args) {
        System.out.println("Enter the factorail no:");
        Scanner bhav = new Scanner(System.in);
        int n = bhav.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
        bhav.close();
    }

    static int factorial(int n){
        int fact = 1;
        while(n >0){
             fact = fact*n;
             n--;
        }
        return fact ;
    }
}

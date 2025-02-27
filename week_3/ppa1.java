package week_3;
import java.util.Scanner;

class Calculator{
//fill the code
    void sum(double n1 , double n2){
        System.out.println(n1+n2);
    }

    void subtraction(double n1 , double n2){
        System.out.println(n1-n2);
    }

    void multiply(double n1 , double n2){
        System.out.println(n1*n2);
    }

    void division(double n1 , double n2){
        System.out.println(n1/n2);
    }

    
}

class UpdatedCalculator extends Calculator{
    // Fill the code
    void remainder(double n1 , double n2){
        System.out.println(n1%n2);
    }
} 



public class ppa1{
    public static void main (String []args){
            Scanner sc = new Scanner(System.in);
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            Calculator c = new Calculator();
            c.sum(n1, n2);
            c.subtraction(n1, n2);
            c.multiply(n1, n2);
            c.division(n1, n2);
            UpdatedCalculator uc = new UpdatedCalculator();
            uc.remainder(n1, n2);
        }
    
    }

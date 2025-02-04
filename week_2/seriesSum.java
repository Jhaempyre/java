package week_2 ;
import java.util.*;

public class seriesSum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = s.nextInt();
        int bigSum = 0 ;
        int sum = 0 ;

        for(int i = 1 ; i<=n; i++){
            int x = i*i ; 
            sum = sum + x ;
            bigSum = sum + bigSum;
        }

        System.out.println(bigSum);
        s.close();
    }
}


package oppe_pyq;
///control object scenarios :---- where we don;t want to even make object in public we apply
/// interfaces what it does here is it basically return object on being instantinized which help to keep things
/// private and encapsulated this is particularly helpful 💀💀💀
import java.util.Scanner;

interface Transferable{
    public abstract String transfer();
}

class PaymentApp{
    String accno;

    public PaymentApp(String an){
        accno = an;
    }

    private class Account implements Transferable{
        double amount;
        double balance;

        public Account(double a ){
            amount = a ;
            balance = 1000;
        }
        
        @Override
        public String transfer(){
            if(balance<amount){
                return "Failed transaction";
            }else{
                balance = balance - amount ;
                return "Money debited, current balance is "+balance;
            }
        }

        
    }
    public Transferable payRequest(double amount){
        return new Account(amount);
    }
}

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentApp u1 = new PaymentApp("ACC101010");
      Transferable t1 = u1.payRequest(sc.nextDouble());
      System.out.println(t1.transfer());
    }
}


//passed

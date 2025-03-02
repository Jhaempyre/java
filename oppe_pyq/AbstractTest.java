package oppe_pyq;

import java.util.Scanner;

abstract class Trainer {
    private String name; 
    private String ot ;
    private int numhours;

   public Trainer(String name, String ot, int numhours){
        this.name = name ;
        this.ot = ot;
        this.numhours = numhours;
    }

    public String getname(){
        return name;
    }
    
    public String getot(){
        return ot;
    }

    public int getNumhours(){
        return numhours;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract String incentive();
    
}


class AssistantTrainer extends Trainer{

    public AssistantTrainer(String name, String ot, int numhours){
        super(name, ot, numhours);
    }
    @Override
    public String incentive() {
        if(getot().equals("projectot")){
            return String.valueOf(getNumhours() * 500);
        }else{
            return "Wrong ot assigned";
        }
    }
}

class TechnicalTrainer extends Trainer{
    public TechnicalTrainer(String name, String ot, int numhours){
        super(name, ot, numhours);
    }
    @Override
    public String incentive(){
        if(getot().equals("trainingot")){
            return String.valueOf(getNumhours() * 700);
        }else{
            return "Wrong ot assigned";
        }
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trainer[] tArr = new Trainer[4];

        tArr[0]= new AssistantTrainer(sc.next(), sc.next(),sc.nextInt());
        System.out.println(tArr[0]);
        tArr[1]= new AssistantTrainer(sc.next(), sc.next(),sc.nextInt());
        tArr[2]= new TechnicalTrainer(sc.next(), sc.next(),sc.nextInt());
        tArr[3]= new TechnicalTrainer(sc.next(), sc.next(),sc.nextInt());
        printTrainerIncentives(tArr);
        sc.close();


    }

    public static void printTrainerIncentives(Trainer [] t){
        for (Trainer tc : t){
            System.out.println(tc.toString() + ": " + tc.incentive());
        }
    }
}


//passed
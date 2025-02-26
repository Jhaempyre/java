package week_2;

import java.util.Scanner;


class Employee{
    String eid;
    String ename;
    String eprojects[];

    Employee(String id, String name, String[] project){
        ename = name;
        eid = id;
        eprojects = project;
        
    }
    Employee(Employee obj) {
        eid = obj.eid;
        ename = obj.ename;
        eprojects = obj.eprojects.clone();
        //using clone because it will make copy of array doesnt;t hurt the orfiignla one.
    }

    public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }

    public void display() {
        System.out.println("id:"+eid);
        System.out.println("name:"+ename);
        System.out.println("projects:");
        System.out.println("P001:P002:P003:");
      // you can basically create a function that will just keep things easy like to get from what in array then , manipulate it   
    }
}

public class grpa3 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}


        //System.out.println(args); will think for this how to access arg

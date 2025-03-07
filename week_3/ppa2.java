package week_3;

import java.util.Scanner;

class Point{
    private  int x ,y ;

    //Implememntation of constructie
    public Point(int x1, int x2){
        this.x =x1;
        this.y = x2;
    }

    void display(Point p){
        System.out.println(p);
    }

    //overriding toString of Object class;
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true; // If same reference, return true
        if (obj == null || getClass() != obj.getClass()) return false; // Class check
        
        Point point = (Point) obj; // Downcasting
        return this.x == point.x && this.y == point.y; // Compare x and y
    }
}


public class ppa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
	    
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
		
        if(p1.equals(p2))
            System.out.println(p1 + "==" + p2);
        else
            System.out.println(p1 + "!=" + p2);
        
        p1.display(p2);    
    }
}


//passed 
package week_3;

import java.util.Scanner;

class Shape{
    public int area() {
        return 0;
    }
    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape{
    private int w, h;
    //implement Rectangle class
    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
        }
    @Override
    public int area(){
        return w*h;
    }        
}

class Cube extends Shape{
    private int a ;
    //constructor

    public Cube(int a){
        this.a = a;
    }

    @Override
    public int volume(){
        int volume = a*a*a;
        return volume;
    }
    

}
     //implement Cube class

public class grpa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        caller(new Rectangle(w, h));
        caller(new Cube(a));
        sc.close();
    }

    public static void caller(Shape s){
        if(s instanceof Cube){
            System.out.println("Rectangle area: "+s.volume());
        }
        if(s instanceof Rectangle){
            System.out.println("Cube volume: "+s.area());
        }
    }
}

package week_2;

import java.util.Scanner;

class Rectangle{
    int w;    //width
    int h;    //height
//LINE-1: write the function setw(int) to initialize w
	void setw(int w){
        this.w = w;
    }
//LINE-2: write the function seth(int) to initialize h
	void seth(int h){
        this.h = h;
    }
//LINE-3: write the function area() to return area of rectangle
    int area(){
        int a = w*h;
        return a ;
    }
}




public class ppa1 {
    public static void main(String []args){
     Scanner sc= new Scanner(System.in);
        int w = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        Rectangle r = new Rectangle();
        r.setw(w);
        r.seth(h);
        int area = r.area();
        System.out.print(area);
        sc.close();
    }
}


//public private test passed 
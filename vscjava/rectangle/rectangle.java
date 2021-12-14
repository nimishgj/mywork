package rectangle;

import java.util.Scanner;
class Rectangles{
    int length,breadth; Rectangles(int l,int b){
    length=l; breadth=b;
    }
    Rectangles(){
    //initialize an object
    }
    void changeDim(int length,int breadth) { 
        this.length=length; 
        this.breadth=breadth;
    }
        int area() {
        return length*breadth;
    }
}
public class rectangle {
    public static void main(String[] args) {
        Rectangles r1=new Rectangles(20,40);
        System.out.println("Area of rectangle for object r1 :"+r1.area()); 
        Scanner s=new Scanner(System.in);
        Rectangles r2=new Rectangles();
        System.out.println("Enter the length and breadth for rectangle: "); 
        int length=s.nextInt();
        int breadth=s.nextInt(); 
        r2.changeDim(length, breadth);
        System.out.println("Area of rectangle for object r2 :"+r2.area());
    }
}

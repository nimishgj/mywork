package circle;
import java.util.Scanner;
class myCircle{
    float r;
    int center;
    myCircle(float rad,int cen){
        r=rad;
        center=cen;
    }
    myCircle(){
        r=1;
        center=1;
    }
    float area(){
        return (float) (3.142*r*r);
    }
    float perimeter(){
        return (float) (2*3.142*r);
    }
    float diameter(){
        return (float)(2*r);
    }
}

public class circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius and center of circle:");
        int cen=input.nextInt();
        float radius=input.nextFloat();
        myCircle c=new myCircle();
        myCircle c1=new myCircle(radius,cen);
        System.out.println("Properties of circle with default constructor:");
        System.out.println("Radius"+c.r+"\n"+"Diameter:"+c.diameter()+"\n"+"Area:"+c.area()+"\n"+"Perimeter:"+c.perimeter()+"\n");
        System.out.println("Properties of circle with Parameterized constructor:");
        System.out.println("Radius"+c1.r+"\n"+"Diameter:"+c1.diameter()+"\n"+"Area:"+c1.area()+"\n"+"Perimeter:"+c1.perimeter()+"\n");

    }
}

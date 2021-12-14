package complexno;
import java.util.Scanner;
class complexNumber {
    float real;
    float img;

    complexNumber() {
        real=1;
        img=1;
    }

    complexNumber(float r,float i) {
        real=r;
        img=i;
    }
    void sum(complexNumber n){
        complexNumber temp=new complexNumber();
        temp.img=img+n.img;
        temp.real=real+n.real;
        System.out.println("Sum is :"+temp.real+"+i"+temp.img+"\n");
    }

    void diff(complexNumber n){
        complexNumber temp=new complexNumber();
        temp.img=img+n.img;
        temp.real=real+n.real;
        System.out.println("Difference is :"+temp.real+"+i"+temp.img+"\n");
    }

    void display(){
        System.out.println("Complex number:"+real+"+i"+img+"\n");
    }
}

public class complexNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a complex number:");
        float r=s.nextFloat();
        float i=s.nextFloat();
        complexNumber c1=new complexNumber();
        complexNumber c2=new complexNumber(r,i);
        c1.sum(c2);
        c1.diff(c2);
        c1.display();
    }
}

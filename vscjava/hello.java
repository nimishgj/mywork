import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        byte num1 = input.nextByte();
        byte num2 = input.nextByte();
        System.out.println("sum is :" + (num1+num2));
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Name:" + name);
    }
}
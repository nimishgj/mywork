import java.util.*;
class Students
{
    String name;
    int rollno;
    float m1,m2,m3;
    Students()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name:");
        name=in.nextLine();
        System.out.println("Enter rollno:");
        rollno=in.nextInt();
        System.out.println("Enter marks:");
        m1=in.nextFloat();
        m2=in.nextFloat();
        m3=in.nextFloat();
    }
    Students(String n,int r,float mr1,float mr2,float mr3)
    {
        name=n;
        rollno=r;
        m1=mr1;
        m2=mr2;
        m3=mr3;
    }
    float computAverage()
    {
        if(m1>m2 && m2>m3)
            return (m1+m2)/2;
        else if(m2>m3 && m3>m1)
            return (m2+m3)/2;
        else
            return (m1+m3)/2;
    }
    void disp()
    {
        System.out.println("Name:\n"+name+"\nRoll no:"+rollno);
        System.out.println("Marks:\n"+m1+"\n"+m2+"\n"+m3);
        
    }
    
}

public class student
{
    public static void main(String args[])
    {
        Students s[]=new Students[2];
        s[0]=new Students();
        s[1]=new Students();
        System.out.println("Avreage:"+s[0].computAverage());
        s[0].disp();
        System.out.println("Avreage:"+s[1].computAverage());
        s[1].disp();
    }
}

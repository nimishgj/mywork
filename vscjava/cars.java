import java.util.Scanner;

class car{
    int a[][]=new int[6][12];
    void inputdata(){
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sales data:");
        String cars[]={"Maruti suzuki","Hundai","Tata motors","KIA","Renault","BMW"};
        for ( i = 0; i < 6; i++) {
            for ( j = 0; j < 12; j++) {
                System.out.println("Enter sold sold for "+(j+1)+" th month for "+cars[i]);
                a[i][j]=s.nextInt();
            }
        }
    }
    void findmax(int c){
        int max=0,i,month;
        max=a[c][0];
        for (i = 0; i < 12; i++) {
            if(a[c][i]>max){
                max=a[c][i];
                month=i;
            }  
        }
        System.out.println("Max numbers of car sold on "+month+" th month");
    }
    void findavg(int c){
        int sum=0,avg,i;
        for (i = 0; i < 12; i++) {
            sum+=a[c][i];
        }
        avg=sum/12;
        System.out.println("Average number of cars sold:"+avg);
    }
    void findsum(int c){
        int sum=0,i;
        for (i = 0; i < 12; i++) {
            sum+=a[c][i];
        }
    System.out.println("Total numbers of car sold:"+sum);
    }
    void findsd(int c){
        float sum=0,mean,sd=0;
        int j;
        for (j = 0; j < 12; j++) {
            sum+=a[c][j];
        }
        mean=sum/10;
        for (j = 0; j <12; j++) {
            sd+=Math.pow(a[c][j]-mean, 2);
        }
        System.out.println("Standard Deviation:"+Math.sqrt(sd/10));
    }
}
public class cars {
    public static void main(String[] args) {
        car c=new car();
        c.inputdata();
        System.out.println("Calculation for KIA:");
        c.findavg(3);
        c.findmax(3);
        c.findsum(3);
        c.findsd(3);
    }
}

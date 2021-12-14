package zone;
import java.util.Scanner;
class zones {
    int zone[][]=new int[4][10];
    Scanner s=new Scanner(System.in);

    void getdata() {
        int i,j;
        for(i=0;i<4;i++){
            for ( j = 0; j <10; j++) {
                switch (i) {
                    case 0:
                        System.out.println("ENter the sales for " + (j+1)+" office in north zone:");
                        zone[i][j]=s.nextInt();
                        break;
                    
                    case 1:
                        System.out.println("ENter the sales for " + (j+1)+" office in east zone:");
                        zone[i][j]=s.nextInt();
                        break;
                    
                    
                    case 2:
                        System.out.println("ENter the sales for " + (j+1)+" office in west zone:");
                        zone[i][j]=s.nextInt();
                        break;
                    
                    case 3:
                        System.out.println("ENter the sales for " + (j+1)+" office in south zone:");
                        zone[i][j]=s.nextInt();
                }
            }
        }
    }
    void average() {
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<10;j++){
                sum+=zone[i][j];
            }
            System.out.println("Average of"+(i+1)+" zone is:"+(sum/10));
        }
    }
    void findHighest(){
        int highest[]=new int[10];
        for(int i=0;i<4;i++) {
            highest[i]=zone[i][0];
            for(int j=1;j<10;j++) {
                if (highest[i]>zone[i][j]) {
                    highest[i]=zone[i][j];
                }
            }
            System.out.println("Highest sales of"+(i+1)+" zone is:"+highest[i]);
        }
    }
    void findlowest(){
        int lowest[]=new int[10];
        for(int i=0;i<4;i++) {
            lowest[i]=zone[i][0];
            for(int j=0;j<10;j++) {
                if (lowest[i]<zone[i][j]) {
                    lowest[i]=zone[i][j];
                }
            }
            System.out.println("lowest sales of"+(i+1)+" zone is:"+lowest[i]);
        }
    }

}
public class zone {
    public static void main(String[] args) {
        zones z=new zones();
        z.getdata();
        z.average();
        z.findHighest();
        z.findlowest();
    }   
}

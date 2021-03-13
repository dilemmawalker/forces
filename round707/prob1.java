import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arrival=new int[n];
            int[]departure=new int[n];
            int[]time=new int[n];

            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                int b=scn.nextInt();
                arrival[i]=a;
                departure[i]=b;
                if(i==0){
                    time[i]=a;
                }
                else{
                    time[i]=a-departure[i-1];
                }
            }

            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                time[i]+=a;
            }

            int ctime=0;
            for(int i=0;i<n-1;i++){
                ctime+=time[i];
                if(ctime<=arrival[i]){
                    ctime=departure[i];
                }
                else{
                    int x=departure[i]-arrival[i];
                    if(x%2==0)
                    x/=2;
                    else
                    x=(x/2)+1;
                    ctime+=x;
                }
                // System.out.println(ctime);
            }
            System.out.println(ctime+time[n-1]);
        }
    }
}
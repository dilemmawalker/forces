import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            System.out.print(arr[0]);
            int p=arr[0];
            for(int i=1;i<n;i++){
                int a=arr[i];
                if(a>=arr[i-1]){
                    int m=a/p;
                    int ans1=m*p;
                    int ans2=m*(p+1);
                    int ans1=((a-ans1)<=(ans2-a))?ans1:ans2;
                    p=ans1;
                    System.out.print(p);
                }
                else{
                    int m=p/a;
                    int ans1=m*a;
                    int ans2=m*(a+1);
                    int ans1=((a-ans1)<=(ans2-a))?ans1:ans2;
                    p=ans1;
                    System.out.print(p);
                }
            }
        }
    }
}
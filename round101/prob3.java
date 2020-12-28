import java.io.*;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int     t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
                int k=scn.nextInt();
                int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int i=0;
            int hei=0;
            hei=arr[0]+k;
            for( i=1;i<n;i++){
                hei=hei-1;
                int a=arr[i];
                if(a<=arr[i-1]){
                    if(a+k-1>=k)
                    break;
                }
                else{

                }

                if(a>=k-1+k)
                break;
                hei=a+k;
            }

            if(i==n)
            System.out.println("yes");
            else
            System.out.println("no");
        }
    }
}
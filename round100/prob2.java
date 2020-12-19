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
            // System.out.print(arr[0]);
            int p=arr[0];
            long even=0l;
            long odd=0l;
            for(int i=0;i<n;i++){
                if(i%2==0)
                even+=arr[i];
                else
                odd+=arr[i];
            }
            int m=0;
            if(even>=odd)
            m=0;
            else
            m=1;

            for(int i=0;i<n;i++){
                if(m==i){
                    System.out.print(arr[i]+" ");
                    m+=2;
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
import java.io.*;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            int[]freq=new int[n+1];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                freq[a]++;
            }
            int b=10000000;
            for(int i=1;i<=n;i++){
                if(freq[i]>0)
            b=Math.min(b,solve(arr,i));
            }
            System.out.println(b);
        }
    }
    public static int solve(int[]arr,int min){
        int i=0;
        int n=arr.length;
        int c=0;
        while(i<n){
            while(i!=n && arr[i]==min){
                i++;
            }
            if(i==n)
            break;
            c++;
            while( i!=n && arr[i]!=min){
                i++;
            }
        }
        return c;
    }
}
import java.util.*;
import java.io.*;
public class prob3{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            long min=1000000000;
            int n=scn.nextInt();
            long[]arr=new long[n];
            long[]copy=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
                copy[i]=arr[i];
                min=Math.min(min,arr[i]);
            }
            Arrays.sort(copy);
            int i=0;
            for( i=0;i<n;i++){
                   if(arr[i]!=copy[i]){
                       if(arr[i]%min!=0){
                       System.out.println("NO");
                       break;
                       }
                   }
                }
            if(i==n)
            System.out.println("YES");
        }
    }
}
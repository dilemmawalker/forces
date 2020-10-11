import java.io.*;
import java.util.*;

public class prob2{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            total+=arr[i];
        }
        if(total==n){
            System.out.println(0);
        }
        else{
        Arrays.sort(arr);
        int no=1;
        int to=total;
        int min=2;
        int max=arr[n-1];
        double diff=max-min;
        while(min!=max){
            int a=(min+max)/2;
            double temp=(Math.pow(a,n+1)-1)*1.0/(a-1);
            if(temp>total){
                max=a;
            }
            else{
                min=a;
            }
        }
        no=min;

        long cost=arr[0]-1;
        int valtobe=1;
        for(int i=1;i<n;i++){
            int a=arr[i];
            valtobe=valtobe*no;
            if(a>valtobe)
            cost+=(a-valtobe);
            else
            cost+=(valtobe-a);
        }
    System.out.println(cost);
        }
    }
}
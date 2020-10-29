import java.util.*;
import java.io.*;
public class prob3{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int[]dp=new int[n];
            int a=solve(arr,new boolean[200],0,dp);
            System.out.println(a);
        }
    }
    public static int solve(int[]arr,boolean[]ar,int idx,int []dp){
        if(idx == arr.length){
            return 0;
        }
        if(dp[idx]!=0)
        return dp[idx];
        int c=1000000; 
        int a=0;
        int ii=0;
        for(int i=0;i<ar.length;i++){
            if(!ar[i]){
                // ar[i]=true;
                int calc=i+1-arr[idx];
                a=solve(arr,ar,idx+1,dp)+ (calc>0?calc:-calc);
                if(a<c){
                c=a;
                ii=i;
                }
                // ar[i]=false;
            }
        }
        ar[ii]=true;
        return dp[idx]=c;
    }
}
import java.io.*;
import java.util.*;
public class prob5{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String args[]){
        int n=scn.nextInt();
        int r1=scn.nextInt();
        int r2=scn.nextInt();
        int r3=scn.nextInt();
        int d=scn.nextInt();
        int n1=n;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
        solve();
    }
    public static void solve(int i,int n,int total,int ans,int r1,int r2,int r3,int d,int []arr,int[]boss,int temp){
        if(total==ans){
            return 0;
        }
        int s=0;
        if(arr[i]!=0 && boss[i]!=0){
            int a=arr[i];
            int b=boss[i];
            arr[i]=0;
            boss[i]=0;
            s=Math.min(solve(i+1,n,total,ans+a*r1+b*r3+d,r1,r2,r3,d,arr,boss,temp+a+b));
            arr[i]=a;
            boss[i]=b;
        }..
    }
}
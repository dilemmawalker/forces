import java.util.*;
import java.io.*;
public class prob5{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[]arr=new int[n+2];
        int []arr2=new int[k+1];
        boolean flag=false;
        arr[0]=-2147483647;
        arr[n+1]=2147483646;
        for(int i=1;i<n+1;i++){
            int a=scn.nextInt();
            arr[i]=a;
            if(a<=arr[i-1])
            flag=true;
        }
        for(int i=0;i<k;i++){
            int a=scn.nextInt();
            arr2[i]=a;
        }
        arr2[k]=n+1;
        int si=1;
        int c=0;
        int []dp=new int[n+10];
        for(int i=0;i<n+10;i++){
            dp[i]=2147483647;
        }
        for(int i=0;i<=k;i++){
            int ei=arr2[i];
           int a= solve(arr,si,ei,arr[ei],dp);
           if(a<=1000000)
           c+=a;
           else{
               c=-1;
               break;
           }
            si=ei+1;
        }
        if(n==k && flag)
        System.out.println(-1);
        else
        System.out.println(c);
        for(int i=0;i<n+9;i++){
            System.out.print(dp[i]+" ");
        }
    }
    public static int solve(int[]arr,int si,int ei,int max,int[]dp){
        if(si==ei){
            return 0;
        }
        if(dp[si]!=2147483647)
        return dp[si];

        int c=2147483647;
        int a=2147483647;
        if(arr[si]>arr[si-1] && arr[si]<max)
        a=solve(arr,si+1,ei,max,dp);
        c=Math.min(a,c);
        int no=arr[si-1]+1;
        if(no<max){
            int save=arr[si];
            arr[si]=no;
            a=solve(arr,si+1,ei,max,dp)+1;
            arr[si]=save;
            c=Math.min(c,a);
        }
        return dp[si]=c;
    }
}
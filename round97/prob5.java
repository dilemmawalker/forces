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
        arr[n+1]=2147483647;
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
        long c=0l;
        long []dp1=new long[214748364];
        long []dp2=new long[214748364];
        for(int i=0;i<2147483647;i++){
            dp1[i]=2147483647;
            dp2[i]=2147483647;
        }
        for(int i=0;i<=k;i++){
            int ei=arr2[i];
           long a= solve(arr,si,ei,arr[ei],dp1,dp2);
           if(a<=1000000)   //check?
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
        // for(int i=0;i<n+1;i++){
        //     System.out.print(dp[i]+" ");
        // }
    }
    public static long solve(int[]arr,int si,int ei,int max,long[]dp1,long[]dp2){
        if(si==ei){
            return 0;
        }
        
        int nn=0;
        long c=2147483647;
        long a=2147483647;
        if(arr[si]>arr[si-1] && arr[si]<max){
            if(dp2[arr[si]]!=2147483647)
            a=dp2[arr[si]];
            else
        a=solve(arr,si+1,ei,max,dp1,dp2);
        }
        if(a<c){
            c=a;
            nn=arr[si];
        }
        int no=arr[si-1]+1;
        if(no<max){
            int save=arr[si];
            arr[si]=no;
            if(no<0 && dp1[no+2147483647]!=2147483647)
            a=dp1[no+2147483647];
            else if(no>=0 && dp2[no]!=2147483647)
            a=dp2[no];
            else
            a=solve(arr,si+1,ei,max,dp1,dp2)+1;
            arr[si]=save;
            if(a<c){
                c=a;
                nn=no;
            }
        }
        if(nn<0)
        dp1[nn+2147483647]=c;
        else
        dp2[nn]=c;
        return c;
    }
}
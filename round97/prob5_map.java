import java.util.*;
import java.io.*;
public class prob5_map{
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
        
       HashMap<Integer,Integer> []dp=new HashMap[n+1];
       for(int i=0;i<n+1;i++){
        dp[i]=new HashMap<Integer,Integer>();
        }
        int c=0;
        for(int i=0;i<=k;i++){
            int ei=arr2[i];
            int a= solve(arr,si,ei,arr[ei],dp);
           if(a<=500000){   //check?
           c+=a;
           }
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
        for(int i=0;i<n+1;i++){
            System.out.print(dp[i]+"  ");
        }
    }
    public static int solve(int[]arr,int si,int ei,int max,HashMap<Integer,Integer> []dp){
        if(si==ei){
            return 0;
        }
        
        int nn=0;
        int c=2147483647;
        int a=2147483647;
        HashMap<Integer,Integer>m=dp[si];
        if(arr[si]>arr[si-1] && arr[si]<max){
            
            if(m.containsKey(arr[si]))
            a=m.get(arr[si]);
            else
        a=solve(arr,si+1,ei,max,dp);
        }
        if(a<c){
            c=a;
            nn=arr[si];
        }
        int no=arr[si-1]+1;
        if(no<max){
            int save=arr[si];
            arr[si]=no;
            if(m.containsKey(arr[si]))
            a=m.get(arr[si]);
            else{
            a=solve(arr,si+1,ei,max,dp);
                if(a!=2147483647)
                a+=1;
            }
            arr[si]=save;
            if(a<c){
                c=a;
                nn=no;
            }
        }
        m.put(nn,c);
        if(c!=2147483647)
       dp[si]=m;
        return c;
    }
}
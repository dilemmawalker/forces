import java.util.*;
import java.io.*;
public class prob3{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static class pair{
        long a=0;
        long b=0;
        pair(long a,long b){
            this.a=a;
            this.b=b;
        }
    }
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            long min=1000000000;
            int n=scn.nextInt();
            long[]arr=new long[n];
            HashMap<String,Long>map=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
                min=Math.min(min,arr[i]);
            }
            for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                       long gc=gcd(arr[i],arr[j]);
                       if(gc==min){
                       String str=arr[i]+" "+arr[j];
                       map.put(str,gc);
                       }
                    }
                }
                System.out.println(map);
                if(check(arr)){
                System.out.println("YES");
                continue;}
            if(solve(0,n,arr,min,1,map))
            System.out.println("YES");
            else 
            System.out.println("NO");
        }
    }
   
    public static boolean solve(int idx,int n,long[]arr,long min,int idx2,HashMap<String,Long>map){
        if(idx==n-1){
            if(check(arr))
            return true;
            else
            return false;
        }

        boolean res=false;
        for(int i=idx;i<n;i++){
            for(int j=idx2;j<n;j++){
                long a=arr[i];
                long b=arr[j];

                String str=a+" "+b;
                if(map.containsKey(str)){
                    // long temp1=arr[i];
                    // long temp2=arr[j];
                    arr[i]=b;
                    arr[j]=a;
                    if(j==n-1)
                    res=res||solve(i+1,n,arr,min,i+2,map);
                    else
                    res=res||solve(i,n,arr,min,j+1,map);
                    arr[i]=a;
                    arr[j]=b;
                 }
                }
                // if(j==n-1)
                // res=res||solve(i+1,n,arr,min,i+2,map);
                // else
                res=res||solve(i+1,n,arr,min,i+2,map);            
        }
        return res;
    }
    public static boolean check(long[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        for(int i=0;i<n-1;i++){
            long a=arr[i];
            long b=arr[i+1];
            if(a>b)
            return false;
        }
        return true;
    }
    public static long gcd(long a,long b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}
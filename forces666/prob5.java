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
        int []boss=new int[n];
        int []arr=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
            boss[i]=2;
            total+=a+2;
        }
        long s=10L;
        s=solve(0,n,0,total,r1,r2,r3,arr,boss,d);
        System.out.println(s);
    }
    public static long solve(int i,int n,int change,int total,int r1,int r2,int r3,int[]arr,int []boss,int d){

        if(total==change){
            return -d;
        }
        if((i==n || i==-1)){
            return 1000000000000l;
        }
        long s=1000000000000l;
        long r=10000000000l;
        if(arr[i]!=0){
            int a=arr[i];
            int b=boss[i];
            arr[i]=0;
            boss[i]=0;
            r=solve(i+1,n,change+a+b,total,r1,r2,r3,arr,boss, d)+r1*a+r3*b+d;
            s=Math.min(s,r);
            r=solve(i+1,n,change+a+b,total,r1,r2,r3,arr,boss, d)+r3*a+r3+d;
            s=Math.min(s,r);

            r=solve(i-1,n,change+a+b,total,r1,r2,r3,arr,boss, d)+r1*a+r3*b+d;
            s=Math.min(s,r);
            r=solve(i-1,n,change+a+b,total,r1,r2,r3,arr,boss, d)+r3*a+r3+d;
            s=Math.min(s,r);
            
            arr[i]=a;
            boss[i]=b;//1 & 4

            arr[i]=0;
            boss[i]=1;
            r=solve(i+1,n,change+a+1,total,r1,r2,r3,arr,boss, d)+r1*a+r1+d;
            s=Math.min(s,r);
            r=solve(i+1,n,change+a+1,total,r1,r2,r3,arr,boss, d)+r2+d;
            s=Math.min(s,r);
            
            r=solve(i-1,n,change+a+1,total,r1,r2,r3,arr,boss, d)+r1*a+r1+d;
            s=Math.min(s,r);
            r=solve(i-1,n,change+a+1,total,r1,r2,r3,arr,boss, d)+r2+d;
            s=Math.min(s,r);
            
            arr[i]=a;
            boss[i]=b;//2 & 3
        }
        else if(boss[i]!=0){
            int a=boss[i];
            boss[i]=0;
            r=solve(i+1,n,change+1,total,r1,r2,r3,arr,boss, d)+Math.min(r1,Math.min(r2,r3))+d;
            s=Math.min(s,r);
        
            r=solve(i-1,n,change+1,total,r1,r2,r3,arr,boss, d)+Math.min(r1,Math.min(r2,r3))+d;
            s=Math.min(s,r);
        
            boss[i]=a;
        }
        else {
            if(i+1<n && boss[i+1]!=0){
            r=solve(i+1,n,change,total,r1,r2,r3,arr,boss, d)+d;
            s=Math.min(s,r);
        }
            if(i-1>=0 && boss[i-1]!=0){
            r=solve(i-1,n,change,total,r1,r2,r3,arr,boss,d)+d;
            s=Math.min(s,r);
        }
        }
        return s;
    }
}
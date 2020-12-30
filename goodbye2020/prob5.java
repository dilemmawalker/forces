import java.io.*;
import java.util.*;
public class prob5{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
                int n=scn.nextInt();
                long[]arr=new long[n];
                for(int i=0;i<n;i++){
                    long a=0l;
                     a=scn.nextLong();
                    arr[i]=0l;
                    arr[i]=a;
                }
                long c=0l,mod=0l;
                 mod=1000000000+7;
                 for(int i=0;i<n;i++){
                     for(int j=i;j<n;j++){
                         for(int k=j;k<n;k++){
                              c=((long) ((long)((arr[i]&arr[j])%mod)+(long)((arr[j]|arr[k])%mod))%mod+(long)(c%mod))%mod;
                              
                         }
                     }
                 }
                 System.out.println(c);
        }
    }
}
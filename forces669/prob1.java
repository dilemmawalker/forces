import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            int zero=0;
            int one=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                if(a==0)
                zero++;
                else
                one++;
            }
            
            int aa=Math.max(zero,one);
            if(one>zero && one%2!=0){
                aa--;
            }
            System.out.println(aa);
            int no=0;
                if(zero<one)
                no=1;
                
            for(int i=1;i<=aa;i++){
                
                System.out.print(no+" ");
            }
            System.out.println();
        }
    }
}
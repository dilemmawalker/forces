import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            long n=0l;
          n=scn.nextLong();
            boolean flag=false;
            while(!flag){
                flag=solve(n);
                if(flag)
                break;
                n++;
            }
            System.out.println(n);
        }
    }
    public static boolean solve(long n){
        long n1=0l;
        n1=n;
        while(n>0){
            long a=n%10;
            if(a!=0 && n1%a!=0)
            return false;
            n/=10;
        }
        return true;
    }
}
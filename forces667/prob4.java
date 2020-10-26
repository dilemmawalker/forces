import java.io.*;
import java.util.*;
public class prob4{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String []args){
        int t=scn.nextInt();
        while(t-->0){
            long n=0L;
             n=scn.nextLong();
            int s=scn.nextInt();
            long steps=0;
            long sum=0;
            long n1=n;
            sum=get_sum(n);
            long no=10;
            while(sum>s){
                long rem=n%no;
                long diff=no-rem;
                steps+=diff;
                n=n+diff;
                sum=get_sum(n);
                no=no*10;
            }
            System.out.println(steps);
        }
    }
        public static long get_sum(long n){
            long sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            return sum;
        }
}
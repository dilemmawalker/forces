import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String args[]){
        int t=scn.nextInt();
        while(t-->0){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int x=scn.nextInt();
            int y=scn.nextInt();
            int n=scn.nextInt();
            int n1=n;
            int a1=a;
            int b1=b;
            long ans1=9223372036854775807L;
            long ans2=9223372036854775807L;
            
                int min=Math.min(n,a-x);
                n=n-min;
                a=a-min;
                b=b-Math.min(b-y,n);
                ans1=a;
                ans1=ans1*b;
                // System.out.println(Math.min(5,0));
            
            n=n1;
            a=a1;
            b=b1;
            min=Math.min(n,b-y);
            b=b-min;
            n=n-min;
            a=a-Math.min(a-x,n);
            ans2=a;
            ans2*=b;
            // System.out.println(ans2);

            
            System.out.println(Math.min(ans1,ans2));
        }
    }
}
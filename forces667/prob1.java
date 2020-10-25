import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String args[]){
        int t=scn.nextInt();
        while(t-->0){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int diff=0;
            diff=a>=b?a-b:b-a;
           int aa=a%10;
           int bb=b%10;            
            if(aa==bb)
            System.out.println(diff/10);
            else
            System.out.println(diff/10+1);
        }
    }
}
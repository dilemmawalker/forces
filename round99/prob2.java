import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int sum=scn.nextInt();
           
            int val=(int)Math.ceil((Math.sqrt(sum*8+1)-1)*1.0/2);   
            int val1=(int)Math.floor((Math.sqrt(sum*8+1)-1)*1.0/2);
            System.out.println(val+ " "+ val1);
            int c=0;
            c=(val*(val+1))/2 - sum;
            int ans1=c+val;
            int c2=0;
            c2=sum-(val1*(val1+1))/2;
            int g=val1+c2;
            int nn=(g*(g+1))/2-(c2*(c2+1))/2;
            int ans2=c2+nn;
            System.out.println(Math.min(ans1,ans2));
        }
    }
}
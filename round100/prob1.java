import java.io.*;
import java.util.*;
public class prob1{
public static Scanner scn=new Scanner(System.in);
public static void main(String[]args){
    int t=scn.nextInt();
    while(t-->0){
        int min=100000000;
        long count=0l;
        int a=scn.nextInt();
        min=Math.min(min,a);
        int b=scn.nextInt();
        min=Math.min(min,b);
        int c=scn.nextInt();
        min=Math.min(min,c);
        count=a+b+c;

        long n=0l;
         n=count-2*(count/7);
         long no=0;
          no=n/7;
        if(min>=no){
            if((no*3+(n-no))==n)
            System.out.println("yes");
            else
            System.out.println("no");
        }
        else
        System.out.println("no");
    }
}
}
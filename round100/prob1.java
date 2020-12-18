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
        int b=scn.nextInt();
        int c=scn.nextInt();
        count=a+b+c;
        min=Math.min(Math.min(a,b),c);

        long n=0l;
         long no=0l;  
         no=count/9;               //7th shots fired
         n=no*6;                     //normal shots fired
        if(no>0 && min>=no && (3*no+n)==count){
            // if((no*3+(n-no))==n)
            System.out.println("yes");
            // else
            // System.out.println("no");
        }
        else
        System.out.println("no");
        // System.out.println(n +" "+ no);
    }
}
}
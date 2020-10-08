import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        long t=scn.nextLong();
        while(t-->0){
            int odd=0;
            long min=1000000000;
            long r=scn.nextLong();
            min=Math.min(min,r);
            long g=scn.nextLong();
            min=Math.min(min,g);
            long b=scn.nextLong();
            min=Math.min(min,b);
            long w=scn.nextLong();

            if(r%2!=0)
            odd++;
            if(g%2!=0)
            odd++;
            if(b%2!=0)
            odd++;
            if(w%2!=0)
            odd++;
            if(odd<=1){
            System.out.println("Yes");
            continue;
            }

            odd=0;
            if(min!=0){
            r=r-1;
            g=g-1;
            b=b-1;
            w=w+3;
            if(r%2!=0)
            odd++;
            if(g%2!=0)
            odd++;
            if(b%2!=0)
            odd++;
            if(w%2!=0)
            odd++;

            if(odd<=1)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        else
        System.out.println("No");
    }
    }
}
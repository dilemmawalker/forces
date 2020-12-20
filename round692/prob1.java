import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            String str=scn.next();
            int bad=0;
            int n1=n-1;
            char ch=str.charAt(n1);
            while(ch==')' && n1>=0){
                bad++;
                n1--;
                if(n1>=0)
                ch=str.charAt(n1);
            }
            if(bad>n1+1)
            System.out.println("yes");
            else
            System.out.println("no");
        }
    }
}
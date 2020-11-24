import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            for ( int i=2;i<=n;i++)
            System.out.print(i+" ");
            System.out.println("1");
        }
    }
}
import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int w=scn.nextInt();
            int h=scn.nextInt();
            int n=scn.nextInt();
            int c1=1,c2=1;
            while(w%2==0){
                w/=2;
                c1*=2;
            }
            while(h%2==0){
                h/=2;
                c2*=2;
            }
            System.out.println(c1*c2>=n?"yes":"no");
        }
    }
}
import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn = new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int l=scn.nextInt();
            int r=scn.nextInt();
            int c=r+1;
                double d=(c*1.0)/2;
            if(l%c>=d && r%c>=d)
            System.out.println("yes");
            else
            System.out.println("no");
        }   
    }
}
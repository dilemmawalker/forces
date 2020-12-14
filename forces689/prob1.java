import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
                int c=0;
                while(c<n){
                    while(c<n){
                        System.out.print('a');
                        c++;
                        if(c>=n)
                        break;
                        System.out.print('b');
                        c++;
                        if(c>=n)
                        break;
                        System.out.print('c');
                        c++;
                        if(c>=n)
                        break;
                    }
                }
                System.out.println();
        }
    }
}
import java.io.*;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            int c=0;
            for(int i=0;i<m;i++){
                int x=scn.nextInt();
                int y=scn.nextInt();
                c+=(x-y>=0)?x-y:y-x;
            }
            System.out.println(c);
        }
    }
}
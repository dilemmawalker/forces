import java.util.*;
import java.io.*;
public class prob1{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            if(k>=n){
                System.out.println(k-n);
            }
            else{
                int dif=n-k;
                if(dif%2==0)
                System.out.println(0);
                else
                System.out.println(1);
            }
        }
    }
}
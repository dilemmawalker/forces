import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner  scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
          String arr="";

          if(n<10){
              int b=9;
            for(int i=0;i<n;i++)
            System.out.print(b--);
            System.out.println();
              continue;
          }
          
            for(int i=9;i>=0;i--){
                arr+=i;
            }
            for(int i=0;i<(n/10);i++)
            System.out.print(arr);

            for(int i=1;i<=(n%10);i++)
            System.out.print(i);

            System.out.println();
        }
    }
}
import java.util.*;


import java.util.Scanner;
public class prob1{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int l1=Integer.MAX_VALUE;
            int b1=Integer.MIN_VALUE;
            int l2,b2,l3,b3;

            int n=scn.nextInt();
            int m=scn.nextInt();

            l1=n;
            b1=m;

            n=scn.nextInt();
            m=scn.nextInt();

            l2=n;
            b2=m;

            n=scn.nextInt();
            m=scn.nextInt();

            l3=n;
            b3=m;


            if(((l1+l2)==b1) && ((b2+b3)==b1) && ((l1+l3)==b1)){
                System.out.println("YES");
            }
            else if(((b1+b2)==l1) && ((l2+l3)==l1) && ((b1+b3)==l1)){
                System.out.println("YES");
            }
            else if((b1>=l1) && ((b1==b2) && (b2==b3) && ((l1+l2+l3)==b1))){
                System.out.println("YES");
            }
            else if((l1>=b1) && ((l1==l2) && (l2==l3) && ((b1+b2+b3)==l1))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
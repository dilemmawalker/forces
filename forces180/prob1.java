import java.util.*;


import java.util.Scanner;
public class prob1{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){

            int a=scn.nextInt();
            int x=scn.nextInt();
            int y=scn.nextInt();


            if(a>x && a<y) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}
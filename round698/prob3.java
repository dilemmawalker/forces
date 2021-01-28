import java.util.Scanner;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int max=1;
            int p=scn.nextInt();
            n--;
            int c=1;
            while(n-->0){
                int a=scn.nextInt();
                if (a==p){
                    c++;
                }
                else
                c=1;

                max=Math.max(max,c);
                p=a;
            }
            System.out.println(max);
        }
    }
}
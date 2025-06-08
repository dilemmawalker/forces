import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int x=scn.nextInt();
            int p1=n,p2=0;
            int i=0;
            while(n-->0){
                int a=scn.nextInt();
                if(a==1){
                    p1=Math.min(p1,i);
                    p2=Math.max(p2,i);
                }
                i++;
            }
            if(x>=(p2-p1+1))
            System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
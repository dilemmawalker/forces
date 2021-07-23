import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int val=n/3;
            int val1=val;
            int val2=val;
            if(n%3!=0){
                if(n%3==1)
                val1++;
                else
                val2++;
            }
            System.out.println(val1+" "+val2);
        }
    }
}
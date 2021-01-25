import java.util.Scanner;
public class prob1{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            long n=0l;
             n=scn.nextLong();
           boolean flag=false;
           
          while(n>1){
            if(n%2!=0){
                flag=true;
                break;
            }
            n/=2;
          }
           if(flag)
           System.out.println("yes");
           else
           System.out.println("no");
        }
    }
}
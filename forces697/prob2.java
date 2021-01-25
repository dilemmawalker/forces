import java.util.Scanner;
public class prob2{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
       
        while(t-->0){
             int n=scn.nextInt();
             boolean flag=false;
            for(int i=n;i>0;i-=2021){
           if(i%2020==0 || i%2021==0){
           System.out.println("yes");
            flag=true;
           break;
           }
            }
            if(!flag)
            System.out.println("no");
        }
    }
}
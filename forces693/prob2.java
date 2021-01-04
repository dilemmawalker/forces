import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int []arr=new int[n];
            int c=0,one=0,two=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                if(a==1)
                one++;
                else
                two++;
                c+=a;
            }
            int half=c/2;
            if(c%2==0){
                int no=0;
                if(two%2==0){
                System.out.println("yes");
                continue;
                }
                else
                no=two/2+1;
                if(no*2>half)
            System.out.println("no");
            else
            System.out.println("yes");

            }
            else
            System.out.println("no");
        }
    }
}
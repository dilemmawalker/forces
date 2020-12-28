import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int     t=scn.nextInt();
        while(t-->0){
            String str=scn.next();
            int n=str.length();

            char f=' ',l=' ';
            int c=0;
            for(int i=0;i<n;i++){
                char ch=str.charAt(i);
                if(ch=='?'|| ch==')'|| ch=='('){
                    if(f==' ')
                    f=ch;
                    l=ch;
                    c++;
                }
            }
            if((f=='?'||f=='(') && (l=='?' || l==')') && (c%2==0))
            System.out.println("yes");
            else
            System.out.println("no");

        }
    }
}
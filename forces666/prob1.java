import java.io.*;
import java.util.*;

public class prob1{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int[]arr=new int[26];
            int n=scn.nextInt();
            int n1=n;
            while(n1-->0){
                String str=scn.next();
                for(int i=0;i<str.length();i++){
                    char ch=str.charAt(i);
                    int a=ch-'a';
                    arr[a]++;
                }
            }
            int i=0;
            for(i=0;i<26;i++){
                if(arr[i]%n!=0){
                    System.out.println("NO");
                    break;
                }
            }
            if(i==26)
            System.out.println("YES");
        }
    }
}
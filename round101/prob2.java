import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int     t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]a=new int[n];
            a[0]=scn.nextInt();
            for(int i=1;i<n;i++)
            a[i]=scn.nextInt()+a[i-1];

            int m=scn.nextInt();
            int[]b=new int[m];
            b[0]=scn.nextInt();
            for(int i=1;i<m;i++)
            b[i]=scn.nextInt()+b[i-1];

            int ans=0;
            for(int i=0;i<n;i++){
                ans=Math.max(ans,a[i]);
                for(int j=0;j<m;j++){
                    ans=Math.max(ans,b[j]);
                    ans=Math.max(ans,a[i]+b[j]);
                }
            }
            System.out.println(ans);
        }
    }
}
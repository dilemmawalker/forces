import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n+1];
            ArrayList<Integer>ar=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                ar.add(a);
                arr[a]++;
            }
            int i=0;
            int min=n+2;
            int ans=n+2;
            for(;i<n;i++){
                int a=ar.get(i);
                if(arr[a]==1){
                    if(a< min){
                        min=a;
                    ans=i+1;
                    }
                }
            }
            if(ans==n+2)
            System.out.println("-1");
            else
            System.out.println(ans);
        }
    }
}
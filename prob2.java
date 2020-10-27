import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn = new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            String s=scn.next();
            int []arr=new int [n];
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                arr[i]=ch-'0';
            }
            int i=1;
            int j=n-2;
            boolean flag1=true;
            boolean flag2=true;
            if(arr[0]==arr[n-1]){
                j=n-1;
                flag2=false;
            }
            int c=0;
            while(i<=j){
                if(!flag1 && !flag2){
                    c++;
                    flag1=true;
                    flag2=true;
                    i++;
                    j--;
                }
                if(flag1){
                    if(arr[i]!=arr[i-1]){
                        i++;
                    }
                    else{
                        flag1=false;
                    }
                }
                if(flag2){
                    if(arr[j]!=arr[j+1])
                    j--;
                    else
                    flag2=false;
                }
            }
            System.out.println(c);
        }
    }
}
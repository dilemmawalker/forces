import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner  scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            int c=0;
            boolean flag=false;
            boolean []bool=new boolean[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                if(i>=2){
                    int idx=i-1;
                    if((arr[idx-1]>arr[idx] && arr[idx+1]>arr[idx]) 
                    || (arr[idx-1]<arr[idx] && arr[idx+1]<arr[idx])){
                        bool[idx]=true;
                        c++;
                    }
                    // if(arr[idx-1]==arr[idx+1])
                    // flag=true;
                }
            }
            boolean flag1=false,flag2=false,flag3=false;
            for(int i=0;i<n;i++){
                int a=arr[i];
                int idx=i-1;
                if(i>=2 && bool[idx]==true){
                    
                    if(bool[idx-1]==true && bool[idx+1]==true )
                    flag3=true;
                   else if ((bool[idx-1]==true || bool[idx+1]==true) ){
                        flag2=true;
                    }
                    else if(bool[idx]==true)
                    flag1=true;
                }
            }

           if(flag3 && c>=3){
               c-=3;
           }
           else if(flag2 && c>=2){
               c-=2;
           }
           else if(flag1 && c>=1){
               c-=1;
           }
           System.out.println(c);
        }
    }
}
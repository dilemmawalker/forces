import java.util.*;
import java.io.*;
public class prob3{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int[][]dp=new int[n][401];
            for(int i=0;i<n;i++){
                for(int j=0;j<401;j++){
                    dp[i][j]=-1;
                }
            }
            Arrays.sort(arr);
            int a=solve(arr,new boolean[401],0,dp,0);
            System.out.println(a);
            display(dp);
        }
    }
    public static void display(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int solve(int[]arr,boolean[]ar,int idx,int [][]dp,int iii){
        if(idx == arr.length){
            return 0;
        }
        if(iii>=400)
        return 100000000;
        if(dp[idx][iii]!=-1)
        return dp[idx][iii];
        int c=100000000;
        int a=0;
        for(int i=iii;i<400;i++){
                int calc=i+1-arr[idx];
                a=solve(arr,ar,idx+1,dp,i+1)+ (calc>=0?calc:-calc);
                c=Math.min(a,c);
            }
        return dp[idx][iii]=c;
    }
}
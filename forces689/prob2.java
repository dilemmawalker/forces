import java.io.*;
import java.util.*;
public  class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            int[][]arr=new int[n][m];
            int[][]ans=new int[n][m];
            int cost=0;
            for(int i=0;i<n;i++){
                String a=scn.next();
                for(int j=0;j<m;j++){
                    char ch=a.charAt(j);
                    if(ch=='*')
                    arr[i][j]=1;
                    else
                    arr[i][j]=0;
                    if((j==0 || j==m-1 || i==n-1) && ch=='*'){
                        ans[i][j]=1;
                        cost++;
                    }
                }
            }

            for(int i=n-2;i>=0;i--){
                for(int j=1;j<m-1;j++){
                    if(arr[i][j]==1){
                        int a=Math.min(Math.min(ans[i+1][j-1],ans[i+1][j]),ans[i+1][j+1])+1;
                        ans[i][j]=a;
                        cost+=a;
                    }
                }
            }
            // for(int i=0;i<n;i++){
            //     for(int j=0;j<m;j++){
            //         System.out.print(ans[i][j]);
            //     }
            //     System.out.println();
            // }
            System.out.println(cost);
        }
    }
}
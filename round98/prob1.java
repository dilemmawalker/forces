import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int x=scn.nextInt();
            int y=scn.nextInt();
            int[][][]dp=new int[x+1][y+1][4];
            for(int i=0;i<=x;i++){
                for(int j=0;j<=y;j++){
                    for(int k=0;k<=3;k++)
                    dp[i][j][k]=-1;
                }
            }
            int a=solve(0,0,x,y,0,-1,dp);
            System.out.println(a);
            for(int i=0;i<=x;i++){
                for(int j=0;j<=y;j++){
                    for(int k=0;k<=3;k++)
                    System.out.print(dp[i][j][k]+" ");//
                }
                System.out.println();
            }
        }
    }
    public static int[][]dir={{0,1},{1,0},{0,0}};
    public static int solve(int sr,int sc,int er,int ec,int c,int idx,int[][][]dp){
        if(sr==er && sc==ec){
            return 0;
        }
        if(idx!=-1 && dp[sr][sc][idx]!=-1)
        return dp[sr][sc][idx];

        int cost=100000;
        int no=-10000;
        for(int i=0;i<3;i++){
            int r=sr+dir[i][0];
            int col=sc+dir[i][1];
            if(r>=0 && col>=0 && r<=er && col<=ec && i!=idx){
                int a=solve(r,col,er,ec,c+1,i,dp)+1;
               if(a<cost){
                   cost=a;
                   no=i;
               }
            }
        }
        if(idx!=-1)
         dp[sr][sc][idx]=cost;    //idx or no?
         return cost;
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
    public static String[]ndir={""};
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int r=scn.nextInt()-1;
        int c=scn.nextInt()-1;
        if(n==1 && m==1)
        System.out.println(n+" "+m);
        else{
        int[][]arr=new int[n][m];
        boolean[][]vis=new boolean[n][m];
        vis[r][c]=true;
        LinkedList<int[]>ans=new LinkedList<>();
        ans.add(new int[]{r+1,c+1});
        bfs(r,c,arr,vis,n,m,0,ans);
        }
    }
    public static boolean bfs(int i1,int j1,int[][]arr,boolean[][]vis,int n,int m,int idx,LinkedList<int[]> ans){
        if(idx==((n*m)-1)){
        print(ans);
        return true;
        }

        boolean res=false;

        for(int mag=1;mag<Math.max(m,n);mag++){
            for(int j=0;j<4;j++){
                int r=i1+mag*dir[j][0];
                int c=j1+mag*dir[j][1];
                if(r>=0 && c>=0 && r<n && c<m && !vis[r][c]){
                    vis[r][c]=true;
                    ans.addLast(new int[]{r+1,c+1});
                    // ans+=(r+1)+" "+(c+1)+" ";
                   res=res|| bfs(r,c,arr,vis,n,m,idx+1,ans);
                   if(ans.size()!=0)
                   ans.removeLast();
                    // ans=ans.substring(0,ans.length()-4);
                }
            }
        }
        return res;
    }
    public static void print(LinkedList<int[]>ans){
       while(ans.size()!=0){
            int[]arr=ans.removeFirst();
            System.out.println(arr[0]+" "+arr[1]);
    }
    }
}
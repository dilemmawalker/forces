import java.util.*;
import java.io.*;
public class prob3{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[]arr1=new int[n];
        int []arr2=new int[m];
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        arr1[i]=scn.nextInt();
        for(int i=0;i<m;i++)
        arr2[i]=scn.nextInt();
        
        int ans=0;
            bfs(arr1,arr2,m,0,0);
            System.out.println(min);
        }
        public static int min=1000000;
        public static void bfs(int[]arr1,int[]arr2,int m,int c,int idx){//apply dp
            if(idx==arr1.length){
                min=Math.min(min,c);
                return;
            }
            for(int i=0;i<m;i++){
                int a=arr1[idx]&arr2[i];
                bfs(arr1,arr2,m,c|a,idx+1);
            }
        }
    }
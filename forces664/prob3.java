import java.util.*;
import java.io.*;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[]arr1=new int[n];
        int []arr2=new int[m];
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        arr1[i]=scn.nextInt();
        for(int i=0;i<m;i++){
        arr2[i]=scn.nextInt();
        for(int j=0;j<n;j++){
            arr[j][i]=arr1[j]&arr2[i];
        }
        }
        int ans=0;
        
        // for(int i=0;i<n;i++){
        //     int a=arr1[i];
        //     int val=(int)Math.pow(2,9);
        //     for(int j=0;j<m;j++){
        //         int b=arr2[j];
        //         arr[i][j]=a&b;
        //     }
        // }
            bfs(arr,m,0,0);
            System.out.println(min);
        }
        public static int min=1000000;
        public static void bfs(int[][]arr,int m,int c,int idx){//apply dp
            if(idx==arr.length){
                min=Math.min(min,c);
                return;
            }
            for(int i=0;i<m;i++){
                bfs(arr,m,(c|(arr[idx][i])),idx+1);
            }
    }
}
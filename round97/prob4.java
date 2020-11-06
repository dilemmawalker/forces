import java.util.*;
import java.io.*;
public class prob4{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int level=0;
            LinkedList<Integer>que=new LinkedList<>();
            int idx=1;
            que.add(arr[0]);
            while(idx<n){
                int size=que.size();
                while(size-->0 && idx<n){
                    int a=que.removeFirst();
                    que.add(idx);
                    while(idx+1<n && arr[idx+1]>arr[idx]){
                        idx++;
                        que.addLast(arr[idx]);
                    }
                    idx++;
                }
                level++;
            }
            System.out.println(level);
        }
    }
}
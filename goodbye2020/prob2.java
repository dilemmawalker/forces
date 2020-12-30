import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            int c=0;
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++){
                    int a=arr[i];
                    if(!map.containsKey(a)){
                        c++;
                        map.put(a,1);
                    }
                    else if(!map.containsKey(a+1)){
                        c++;
                        map.put(a+1,1);
                    }
            }
            System.out.println(c);
        }
    }
}
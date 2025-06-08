import java.util.Scanner;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];

            int p1=0, p2=n-1;

            HashMap<Integer,Integer>map = new HashMap<>();

            for(int i=0;i<n;i++){
                int a= scn.nextInt();
                arr[i]=a;
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }
                else{
                    map.put(a,1);
                }
            }

            int c=0;
            for(int i=0;i<n;i++){
                int val = map.get(arr[i]);
                c=Math.max(c,val);
            }

            System.out.println(c);

        }
    }
}
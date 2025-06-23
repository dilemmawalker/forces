import java.util.*;


import java.util.Scanner;
public class prob2{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){

            int n=scn.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            int ans=Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            if(n<2) {
                System.out.println("-1");
                continue;
            }


            for(int i=0;i<n;i++){
                int val = arr[i];
                if(map.containsKey(val)){
                    ans=Math.min(ans,(i-map.get(val)-1));
                } else if(map.containsKey(val+1)){
                    ans=Math.min(ans,(i-map.get(val+1)-1));
                } else if(map.containsKey(val-1)){
                    ans=Math.min(ans,(i-map.get(val-1)-1));
                }
                map.put(val,i);
            }

            if(ans==Integer.MAX_VALUE){
                System.out.println("-1");
            } else {
                System.out.println(ans);
            }

        }
    }
}
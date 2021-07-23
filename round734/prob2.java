import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;
public class prob2{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();

            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            // Arrays.sort(arr);
            HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
            int[]freq=new int[k+1];
            
            int m=1;
            for(int i=0;i<n;i++){
                int val=arr[i];
                if(map.containsKey(val) && map.get(val).contains(m)){
                    arr[i]=0;
                }
                else{
                     HashSet<Integer>temp=new HashSet<>();
                    if(map.containsKey(val)){
                    temp=map.get(val);
                    temp.add(m);
                    }
                    else{
                    temp.add(m);
                    }
                    map.put(val,temp);
                    freq[m]++;
                    arr[i]=m;
                    m++;
                    
                    if(m==k+1)
                    m=1;
                }
            }


            int min=Integer.MAX_VALUE;
            for(int i=1;i<k+1;i++){
                min=Math.min(min,freq[i]);
            }
            for(int i=1;i<k+1;i++){
                freq[i]-=min;
            }
            for(int i=0;i<n;i++){
                int val=arr[i];
                if(freq[val]>0){
                    arr[i]=0;
                    freq[val]--;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
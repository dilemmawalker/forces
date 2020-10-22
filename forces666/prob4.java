import java.io.*;
import java.util.*;
public class prob4{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String args[]){
        int t = scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int [n];
            int n1=n;
            PriorityQueue<Integer>pq=new PriorityQueue<>((Integer a,Integer b)->{
                return b-a;
            });
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                pq.add(a);
        }
        boolean flag = false;
        while(pq.size()!=0){
            int a=pq.remove();
            flag=true;
            if(pq.size()==0){
               break;
            }
            int b=pq.remove();
            flag=false;
            if(--a>0){
                pq.add(a);
            }
            if(--b>0){
                pq.add(b);
            }
        }
        if(flag)
        System.out.println("T");
        else 
        System.out.println("HL");
        }
    }
}
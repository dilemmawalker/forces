import java.io.*;
import java.util.*;

public class prob2{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        long total=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            total+=arr[i];
        }
        if(total==n){
            System.out.println(0);
        }
        else{
        Arrays.sort(arr);
        //
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        //
        int no=1;
        int min=arr[0];
        long dis=1000000000;
        //int max=Math.sqrt(arr[n-1]);
        int max=arr[n-1];
        no=binarysearch(arr,min,max,total);
        
        System.out.println("Value of X -> "+no);

        long cost=0;
        long cost2=0;
        int valtobe=1;
        for(int i=0;i<n;i++){
            int a=arr[i];
            int temp=a-valtobe;
            if(temp>=0)
            cost=cost+temp;
            else
            cost=cost-temp;
            cost2+=(arr[i]-1);
            valtobe=valtobe*no;
        }
        long m=Math.min(cost,cost2);
    System.out.println(m);
        }
    }
        public static int binarysearch(int[]arr,int si,int ei,long total){
            long diff=1000000000;
            int ans=1;
            int n=arr.length;
            for(int i=2;i<ei;i++){
                int a=i;
                long temp=((long)(Math.pow(a,n)-1))/(a-1);
                temp-=total;
                if(temp==0)
                return a;
                if(temp<0)
                temp=temp*(-1);
                if(temp<diff){
                    diff=temp;
                    ans=i;
                }else
                break;
            }
            return ans;
        }
    }
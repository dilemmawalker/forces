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
        Arrays.sort(arr);
        int min=1;
        int max=10000;
        long dis=1000000000;
        binarysearch(min,max,0,arr);
        System.out.println(ans);
    }
    public static long ans=1000000000;
    public static void binarysearch(int min,int max,long ans,int[]arr){ 
        if(min>=max)
        return;
        int av=(min+max)/2;
        long dis=findans(av,arr,arr.length);
        System.out.println(av);
            if(dis>0)
            binarysearch(min,av,ans,arr);
            else if(dis<0)
            binarysearch(av+1,max,ans,arr);
    }
    public static long findans(int no,int[]arr,int n){
        long dis=0;
        long a=0;
        for(int i=0;i<n;i++){
            long aa=(int)Math.pow(no,i);
            if(i!=0  && i!=1 && aa<no)
            aa=2000000000;
            dis+=(aa-arr[i]);
            a+=aa>arr[i]?aa-arr[i]:arr[i]-aa;
        }
        System.out.println(dis+"     "+a);
        ans=Math.min(a,ans);
        return dis;
    }
    }
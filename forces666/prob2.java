import java.io.*;
import java.util.*;

public class prob2{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        // int min=1;
        // int max=100000;
    //     long dis=arr[n-1];
    //     binarysearch(min,max,0,arr);
    //     System.out.println(ans);
    // }
    //  public static long ans = 19999825050L;
    //  public static long aaa=0L;
    // public static void binarysearch(int min,int max,long ans,int[]arr){
    //     if(min>=max)
    //     return;
    //     int av=(min+max)/2;
    //     long dis=findans(av,arr,arr.length);
    //     System.out.println(av);
    //         if(dis>aaa){
    //             aaa=dis;
    //         binarysearch(min,av,ans,arr);
    //         }
    //         else {
    //             aaa=dis;
    //         binarysearch(av+1,max,ans,arr);
    //         }
    // }
    // public static long findans(int no,int[]arr,int n){
    //     long dis=0L;
    //     long a=0L;
    //     dis = 1- arr[0];
    //     if(dis<0)
    //     a=-dis;
    //     else a=dis;
    //     long aa=1L;
    //     for(int i=1;i<n;i++){
    //          aa=aa*no;
    //         dis+=(aa-arr[i]);
    //         a+=aa>arr[i]?aa-arr[i]:arr[i]-aa;
    //     }
    //     System.out.println(dis+"     "+a);
    //     ans=Math.min(a,ans);
    //     return ans;

    long ans=1000000000000000l;
    
    for(int i=1;i<=100000;i++){
    long a=0;
    long s=1;
    for(int j=0;j<n;j++){
    a+=s>arr[j]?s-arr[j]:arr[j]-s;
    if(a<0)
    break;
    s*=i;
    }
    if(a<0)
    continue;    
    ans=Math.min(ans,a);
    }
    System.out.println(ans);
    }
    }
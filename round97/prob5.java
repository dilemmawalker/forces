import java.util.*;
import java.io.*;
public class prob5{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[]arr1=new int[n];
        int []arr2=new int[k];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr1[i]=a;
        }
        for(int i=0;i<k;i++){
            int a=scn.nextInt();
            arr2[i]=a;
        }
        int []arr=new int[n];
        for(int i=0;i<k;i++){
            int a=arr2[i];
            arr[a]=arr1[a];
            //call solve recursive function for many small arrays
        }

    }
}
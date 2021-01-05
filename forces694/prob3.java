import java.util.*;
public class prob3 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) {
       int  t=scn.nextInt();
       while(t-->0){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[]arr=new int[n];
        int[]arr1=new int[m];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<m;i++){
            int a=scn.nextInt();
            arr1[i]=a;
        }
        Arrays.sort(arr);
        long c=0l;
        int j=0;
        for(int i=n-1;i>=0;i--){
            int a=arr[i];
            if(j<m && (arr1[j]<arr1[a-1])){
                c+=arr1[j];
                j++;
            }
            else
           c+=arr1[a-1];
        }
        System.out.println(c);
    }
    }
}
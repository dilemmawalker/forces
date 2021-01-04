import java.io.*;
import java.util.*;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           
            int n=scn.nextInt();
            int[]arr1=new int[n];
            int[]arr=new int[n];
            for(int i =0;i<n;i++){
                int aa=scn.nextInt();
                arr1[i]=aa;
            }
            Arrays.sort(arr1);
            for(int i =0;i<n;i++){
                int aa=arr1[i];
                arr[n-i-1]=aa;
                // System.out.print(arr[n-i-1]+" ");
            }
            // for(int i=0;i<n;i++){
            //     int aa=arr[i];
            //     System.out.print(aa+" ");
            // }
            long a=0l,b=0l;
             for(int i=0;i<n;i++){
                int aa=arr[i];
                if(i%2==0){
                    if(aa%2==0)
                    a+=aa;
                }
                else{
                    if(aa%2!=0)
                    b+=aa;
                }
            }
            if(a==b)
            System.out.println("Tie"); 
            else if(a>b)
            System.out.println("Alice");
            else
            System.out.println("Bob");
        }
    }
}
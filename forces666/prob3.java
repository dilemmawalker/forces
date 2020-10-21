import java.io.*;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner(System.in);

    public static void main(String args[]){
        int n=scn.nextInt();
        long[]arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextLong();
        }
        System.out.println(1+" "+1);
        System.out.println(n-arr[0]);
        arr[0]=n;
        if(n>=2){
        System.out.println(2+" "+n);
            for(int i=1;i<n;i++){
                System.out.print((n-1)*arr[i]+" ");
            }
            System.out.println();
            System.out.println(1+" "+n);
            System.out.print(-n+" ");
            for(int i=1;i<n;i++){
                System.out.print(-(((n-1)*arr[i])+arr[i])+" ");
            }
        }
        else{
            System.out.println(1+" "+1);
            System.out.println(1);
            System.out.println(1+" "+1);
            System.out.println(-2);
        }
    }
    }
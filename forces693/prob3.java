import java.util.*;
public class prob3 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) {
       int  t=scn.nextInt();
       while(t-->0){
        int n=scn.nextInt();
        int []A=new int[n];
        
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            A[i]=a;
        }
        long index=0l;
        long i=0l;
        long j=0l;
        long k=0l;
        k=i;
        while(i<A.length && k<A.length) {
           j = j+A[(int)k];
             if(j>A.length) {
               if(index<j) {
                   index = j;
               }
                i++;
                j=i;
                k=i;
           }
           else
           k++;
          
        }
        System.out.println(index-1);
    }
    }
}
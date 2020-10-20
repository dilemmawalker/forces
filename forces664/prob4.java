import java.util.*;
import java.io.*;
public class prob4{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int d=scn.nextInt();
        int m=scn.nextInt();
        d=Math.min(d,n);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int n1=n;
        int no=0;
        while(n1-->0){  
            int a=scn.nextInt();
            pq.add(-a);
            if(a<=m)
            no++;
        }
        int size1=no;
        int size2=n-no;
        int[]small=new int[size1];
        int[]large=new int[size2];
        size1=0;
        size2=0;
        while(pq.size()!=0){
            int a=-pq.remove();
            if(a<=m)
            small[size1++]=a;
            else
            large[size2++]=a;
        }
        size1--;
        size2--;

        long aa=solve(0,n,d,small,large,0,0,0);
        System.out.println(aa);
    }
    public static long solve(int ii,int n,int d,int[]small,int[]large,long ans,int idx1,int idx2){
        if(ii>=n){
            return ans;
        }
        
        long aa=0;
        if(idx1<small.length){
            int a=small[idx1];
            aa=Math.max(aa,solve(ii+1,n,d,small,large,ans+a,idx1+1,idx2));
        }
        if(idx2<large.length){
            int a=large[idx2];
            aa=Math.max(aa,solve(ii+d+1,n,d,small,large,ans+a,idx1,idx2+1));
        }
        return aa;
    }
}
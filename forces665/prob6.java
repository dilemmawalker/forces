import java.util.*;
import java.io.*;
public class prob6{
    boolean[]vis;
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int q=scn.nextInt();
        int size=(int)Math.pow(2,n);
        int[]arr=new int[size];
        vis=new boolean[(int)Math.log(n)+1];
        for(int i=0;i<size;i++)
        arr[i]=scn.nextInt();

        segment_tree obj=new segment_tree();
        obj.construct(arr,size);
        while(q-->0){
            int type=scn.nextInt();
            if(type==1){
                int x=scn.nextInt();
                int k=scn.nextInt();
                obj.update(arr,k,x-1);
            }
        }
    }
    class segment_tree{
        public static int[]st;
        public static void construct(int[]arr,int n){
            int x=(int)Math.ceil(Math.log(n)/Math.log(2));
            int size=2*((int)Math.pow(2,x))-1;
            st=new int[size];
            construct_rec(arr,n,0,n-1,0);
        }
        public static int construct_rec(int[]arr,int n,int ss,int se,int si){
    
            if(ss==se){
                st[si]=arr[ss];
                return arr[ss];
            }
    
            int mid=ss+(se-ss)/2;
            st[si]=construct_rec(arr,n,ss,mid,si*2+1)+
            construct_rec(arr,n,mid+1,se,si*2+2);
            return st[si];
    
        }
        public static void display(){
            for(int i=0;i<st.length;i++)
            System.out.print(st[i]+" ");
            System.out.println();
        }
        public static int sum(int[]arr,int ss,int se,int qs,int qe,int si){
            if(ss>=qs && se<=qe)
            return st[si];
    
            if(ss>qe || se<qs)
            return 0;
    
           int  mid=ss+(se-ss)/2;
            return sum(arr,ss,mid,qs,qe,si*2+1)+
                    sum(arr,mid+1,se,qs,qe,si*2+2);
    
        }
        public static void update(int[]arr,int ele,int i){
            int n=arr.length;
            int diff=arr[i]-ele;
            arr[i]=ele;
            update_val(arr,0,n-1,diff,i,0);
        }
        public static void update_val(int[]arr,int ss,int se,int diff,int i,int si){
            if(ss>i || se<i)
            return ;
    
            st[si]+=diff;
            if(ss!=se){
                int mid=ss+(se-ss)/2;
                update_val(arr,ss,mid,diff,i,si*2+1);
                if(vis[si])
                update_val(arr,mid+1,se,diff,i,si*2+2);
            }
        }
    }
}
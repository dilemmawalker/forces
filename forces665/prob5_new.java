import java.util.*;
import java.io.*;
public class prob5_new{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int n1=n;
        pair[]hor=new pair[1000001];
        LinkedList<Integer>[]ver=new LinkedList[1000002];
        for(int i=0;i<1000002;i++){
        ver[i]=new LinkedList<Integer>();
        if(i<=1000000)
        hor[i]=new pair(0,0);
        }
        long count=1;
        while(n1-->0){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if((b==0 && c==1000000)||(b==1000000 && c==0))
            count++;
            hor[a]=new pair(b,c);
        }
        int m1=m;
        while(m1-->0){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if((b==0 && c==1000000)||(b==1000000 && c==0))
            count++;
            ver[b].addLast(a);
            ver[c+1].addLast(-a);
        }
        fenwicktree obj=new fenwicktree(1000001);
        for(int i=0;i<=1000000;i++){
            while(ver[i].size()!=0){
                int aa=ver[i].removeFirst();
                if(aa>0){
                    obj.update_diff(1,aa);
                }
                else{
                    obj.update_diff(-1,-aa);
                }
            }
            if(hor[i].x!=-1){
               pair aa=hor[i];
               count+=(obj.sum(aa.y)-obj.sum(aa.x-1));
            }
        }
        System.out.println(count);
    }
    public static class pair{
        int x=-1;
        int y=-1;
        pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static class fenwicktree{  //BIT(Binary Indexed Tree)
        public static int[]BIT;
        fenwicktree(int n){
            BIT=new int[n+1];
        }
       public static int sum(int i){
           return get_sum(i);
       }
       public static int get_sum(int i){
           int index=i+1;
           int sum=0;
           while(index>0){
            sum+=BIT[index];
            index=index-(index&(-index));
           }
           return sum;
       }
       public static void update(int[]arr,int value,int i){
           int diff=value-arr[i];
           arr[i]=value;
           int n=arr.length;
        update_diff(diff,i);
       }
       public static void update_diff(int value,int i){
           int index=i+1;
           int n=BIT.length;
           while(index<n){
               BIT[index]+=value;
               index+=index&(-index);
           }
       }
       public static void construct(int[]arr){
           int n=arr.length;
           for(int i=0;i<n;i++)
           update_diff(arr[i],i);
       }
       public static void display(){
        for(int i=0;i<BIT.length;i++)
        System.out.print(BIT[i]+" ");
        System.out.println();
    }
    }
}
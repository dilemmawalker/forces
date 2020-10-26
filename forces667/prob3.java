import java.io.*;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String []args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int x=scn.nextInt();
            int y=scn.nextInt();

            int c=n-1;
            int diff=y-x;
            while(c>0){
                if(diff%c==0){
                    break;
                }
                c--;
            }
            diff=diff/c;
            PriorityQueue<Integer>pq=new PriorityQueue<>();
            int no=x;
            while(no<=y && n>0){
                pq.add(no);
                no+=diff;
                n--;
            }
            no=x-diff;
            while(no>0 && n>0){
                pq.add(no);
                no=no-diff;
                n--;
            }
            no=y+diff;
            while(n-->0){
                pq.add(no);
                no=no+diff;
            }
            while(pq.size()!=0){
                int a=pq.remove();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
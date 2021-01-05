import java.util.*;
import java.io.*;
public class prob2 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) {
       int  t=scn.nextInt();
       while(t-->0){
        int n=scn.nextInt();
        int x=scn.nextInt();
        long c=0l;
        ArrayList<pair>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            c+=a;
           arr.add(new pair(a,1));
        }
        int i=0;
       while(i<arr.size()){
            pair aa=arr.get(i);
            if((aa.a)%x!=0)
            break;

            
            c+=(((aa.a)/x)*(x*(aa.b)));
           arr.add(new pair((aa.a)/x,x*(aa.b)));
           i++;
        }
        System.out.println(c);
    }
    }
    public static class pair{
        int a=0;
        int b=0;
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}
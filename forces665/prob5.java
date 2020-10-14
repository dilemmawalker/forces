import java.util.*;
import java.io.*;
public class prob5{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        // ArrayList<Integer>[]arr=new ArrayList[1000001];
        TreeSet<Integer>[]arr=new TreeSet[1000001];

        int n1=n;
        int count=1;
        for(int i=0;i<1000001;i++){
        // arr[i]=new ArrayList<>();
        arr[i]=new TreeSet<>();
        }
        while(n1-->0){ 
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if((b==0 && c==1000000)||(b==1000000 && c==0))
            count++;
            for(int i=b;i<=c;i++)
            arr[i].add(a);
        }
        while(m-->0){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if((b==0 && c==1000000)||(b==1000000 && c==0))
            count++;
            for(Integer aa:arr[a]){
                if(aa>=b && aa<=c)
                count++;
            }}
        System.out.println(count);
    }
}
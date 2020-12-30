import java.io.*;
import java.util.*;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           String str=scn.next();
           int n=str.length();
           if(n==1){
           System.out.println(0);
           continue;
        }
           ArrayList<Integer>arr=new ArrayList<>();
           char ch1=str.charAt(0);
           char ch2=str.charAt(1);
           int c=0;
           if(ch1==ch2){
            c++;
            arr.add(ch1-'a');
            arr.add(99);
           }
           
           else{
               arr.add(ch1-'a');
               arr.add(ch2-'a');
           }

           for(int i=2;i<n;i++){
               int v=str.charAt(i)-'a';
                int s=arr.size();
                int j=0;
                for( j=0;j<s;j++){
                    if(arr.get(j)==v){
                        c++;
                        arr.add(99);
                        break;
                    }
                }
                if(j==s)
                arr.add(v);
                arr.remove(0);
           }
           System.out.println(c);
        }
    }
}
import java.io.*;
import java.util.*;
public class prob4{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
      
            String str=scn.next();
            int x=scn.nextInt();
            int y=scn.nextInt();
            int lz=0,rz=0,lo=0,ro=0;
            int n=str.length();
            for(int i=0;i<n;i++){
                char ch=str.charAt(i);
                if(ch=='0'){
                    rz++;
                }
                if(ch=='1'){
                    ro++;
                }
            }

            StringBuilder strr = new StringBuilder(str);
                long c=0l;
            for(int i=0;i<n;i++){
                char ch=str.charAt(i);
                if(ch=='0'){
                    lz++;
                    rz--;
                    // c+=x*ro;
                }
                if(ch=='1'){
                    lo++;
                    ro--;
                    // c+=y*rz;
                }
                if(ch=='?'){
                    long val1=0l;
                    long val2=0l;

                    val1=lo*y + ro*x;
                    val2=lz*x + rz*y;
                
                if(val1<=val2)
                strr.setCharAt(i, '0');
                else
                strr.setCharAt(i, '1');
                }
            }
            rz=0;
            ro=0;
            for(int i=0;i<n;i++){
                char ch=strr.charAt(i);
                if(ch=='0'){
                    rz++;
                }
                if(ch=='1'){
                    ro++;
                }
            }
            long cc=0l;
            for(int i=0;i<n;i++){
                char ch=strr.charAt(i);
               if(ch=='0'){
                   rz--;
                cc+=(x*ro);
               }
               else if(ch=='1'){
                   ro--;
                   cc+=(y*rz);
               }
            }
            System.out.println(cc);
    }
}
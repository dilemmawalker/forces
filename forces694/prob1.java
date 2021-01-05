import java.util.*;
public class prob1 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) {
       int  t=scn.nextInt();
       while(t-->0){
        int n=scn.nextInt();
        int x=scn.nextInt();
        long c=0l;
        long cc=0l;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            c+=a;
            cc+=(a/x);
            if(a%x!=0)
            cc++;
        }
        long ans=0l;
        ans=c/x;
        if(c%x!=0)
        ans++;
        System.out.println(Math.min(cc,ans)+" "+ Math.max(cc,ans));

    }
    }
}
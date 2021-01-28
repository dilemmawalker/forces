import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            
            int d=scn.nextInt();
            
            int c=1;
            while(n-->0){
                int a=scn.nextInt();
                int n1=a;
                boolean ans=false;
                while(n1>0){
                    if(n1%10==d){
                        ans=true;
                        break;
                    }
                    n1/=10;
                }
                if(!ans)
                ans=solve(a,d);
                if(ans)
                System.out.println("yes");
                else
                System.out.println("no");
            }
        }
    }
    public static boolean solve(int n,int d){
        
        while(n>0){
            if((n%10)==d ||(n>9 && ((n/10)%10)==d)){
                return true;
            }
            n-=d;
        }
        return false;
    }
}
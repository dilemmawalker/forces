import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            if(k>=n){
            int ans=k%n!=0?(k/n)+1:(k/n);
            System.out.println(ans);
            }
            else{
                int ans=1;
                
                if(n%k==0){
                    ans=1;
                }
                else
                ans=2;
                System.out.println(ans);
            }
        }
    }
}
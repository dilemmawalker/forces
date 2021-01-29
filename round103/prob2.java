import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int[]arr1=new int[n];
            int[]arr2=new int[n];
            long max=0l;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr1[i]=a;
                arr2[i]=a+ (i!=0?arr2[i-1]:0);
                if(i==0)
                continue;

                double ll=(a*100.0)/arr2[i-1];
                if(ll<=k)
                continue;

                long r=0l;
                r=(a*100)-(k*arr2[i-1]);
                max=Math.max(r,max);
            }
            System.out.println(max);
        }
    }
}
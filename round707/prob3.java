import java.util.Scanner;
import java.util.Arrays;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){  
      
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
            }
            Arrays.sort(arr);

            int p1=0;int p2=n-1;
            while(p1<p2-2){
                int sum=arr[p1]+arr[p2];
                boolean res=false;
                res=calcsum(arr,p1+1,p2-1,sum);
                if(res){
                   
                    break;
                }
                p1++;
            }
            if(p1>=p2)
            System.out.println("NO");

    }
    public static boolean calcsum(int[]arr,int p1,int p2,int sum){
        
        for(int i=p1;i<p2;i++){
            for(int j=i+1;j<=p2;j++){
                int s=arr[i]+arr[j];
                if(s==sum){
               
                System.out.println("YES");
                    System.out.println((p1-1)+" "+i+" "+j+" "+(p2+1));
                    return true;
                }
            }
        }
        return false;
    }
}
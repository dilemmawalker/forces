import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
           int n=scn.nextInt();
           int k=scn.nextInt();
           int[]arr=new int[n];
           int max=0;
           for(int i=0;i<n;i++){
               int a=scn.nextInt();
               arr[i]=a;
               max=Math.max(a,max);
           }
           int c=0;
           int i=0;
           while(c<k){
               int a=arr[i];
               if(a<arr[i+1]){
                int b=arr[i+1]-a;
                c+=b;
                if(c>=k){
                    System.out.println(i);
                    break;
                }
               }
               i++;
               else{
                   i++;
                   while(i<n-1){
                       
                       if(arr[i]>=arr[i+1])
                       i++;
                       else
                       break;
                   }
               }
               i++;
               if(i==n)
               i=0;
           }

        }
    }
}
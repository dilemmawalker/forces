import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int[]arr=new int[n];

            int c=1;
            int p1=0, p2=n-1;
            while(p1<p2){
                arr[p1]=c;
                c++;

                arr[p2]=c++;

                p1++;p2--;
            }
            if(p1==p2){
                arr[p1]=c;
            }
            for(int i=0; i<n;i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
}
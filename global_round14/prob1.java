import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class prob1 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int w=scn.nextInt();
            int[]arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                arr[i]=a;
                sum+=a;
            }
            Arrays.sort(arr);

            int p1=0;
            int p2=n-1;
            if(sum==w){
                System.out.println("NO");
                continue;
            }
            sum=0;
            ArrayList<Integer>ar=new ArrayList<>();
            while(p1<p2){
                int val=arr[p1];
                if((val+sum)!=w){
                    p1++;
                    ar.add(val);
                }
                else if((arr[p2]+sum)!=w){
                    val=arr[p2];
                    p2--;
                    ar.add(val);
                }
                else{
                    System.out.println("NO");
                    break;
                }
            }
            ar.add(arr[p1]);
            if(p1==p2){
                System.out.println("YES");
                for(int i=0;i<n;i++){
                    System.out.print(ar.get(i)+" ");
                }
                System.out.println();
            }
        }
    }
}
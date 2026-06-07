import java.util.Scanner;
import java.util.Arrays;

public class prob1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[]args) {
        int t = scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            int[]arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }

            Arrays.sort(arr);
            int ans = 0;

            for(int i=n-1; i>=2; i--) {
                int x = arr[i-2];
                int y = arr[i-1];
                int z = arr[i];

                if(z%y != x){
                    ans = -1;
                    break;
                }
            }

            if(ans == 0) {
                System.out.println(arr[n-1] + " "+ arr[n-2]);
            } else {
                System.out.println(-1);
            }
        }
    }
}
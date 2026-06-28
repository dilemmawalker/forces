import java.util.Scanner;
import java.util.Arrays;

public class prob1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[]args) {
        int t = scn.nextInt();

        while(t-->0) {
            int n = scn.nextInt();
            int c = scn.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for(int i=0; i<n; i++) {
                arr1[i] = scn.nextInt();
            }

            for(int i=0; i<n; i++) {
                arr2[i] = scn.nextInt();
            }

            //way 2
            int ans2 = findTotal(arr1, arr2);


            //way 1
            sortArray(arr1, arr2);

            int ans1 = findTotal(arr1, arr2) + c;

            int min = Math.min(ans1, ans2);

            if(min >= 100000)
            System.out.println(-1);
            else
            System.out.println(min);
        }
    }

    public static void sortArray(int []arr1, int[]arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static int findTotal(int[]arr1, int[]arr2) {
        int n = arr1.length;
        int ans = 0;

        for(int i=0; i<n; i++) {
            int a = arr1[i];
            int b = arr2[i];

            if(a<b) {
                return 100000;
            } else {
                ans += a-b;
            }
        }
        return ans;
    }
}
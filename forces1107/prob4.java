import java.util.Scanner;

public class prob4 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[]args) {
        int t = scn.nextInt();
        while(t-->0) {

            int n = scn.nextInt();
            int[]arr1 = new int[n];
            int[]arr2 = new int[n];

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0; i<n; i++) {
                arr1[i] = scn.nextInt();
            }
            for(int i=0; i<n; i++) {
                arr2[i] = scn.nextInt();

                int diff = arr2[i] - arr1[i];

                max = Math.max(max, diff);
                min = Math.min(max, diff);
            }

            // System.out.println("this is: "+ max + " "+ min);

            if(max - Math.abs(min) == 0) {
                System.out.println("yes");
            } else {
            System.out.println("no");
            }
        }
    }
}
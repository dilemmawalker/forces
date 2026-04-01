import java.util.Scanner;

public class prob3 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String args[]) {
        int t = scn.nextInt();
        while(t-->0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();

            int ans = (a*2) & (20260401);

            System.out.println(ans);
        }
    }
}
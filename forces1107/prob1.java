import java.util.Scanner;

public class prob1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[]args) {
        int t = scn.nextInt();

        while(t-->0) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            if(x%y==0)
            System.out.println("yes");
            else
            System.out.println("no");
        }
    }
}
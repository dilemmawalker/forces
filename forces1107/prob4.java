import java.util.Scanner;

public class prob4 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[]args) {
        int t = scn.nextInt();
        while(t-->0) {

        int n = scn.nextInt();
        String s = scn.next();
        int change = 0;

        for(int i=0; i<n-1; i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);

            if(ch!=ch2)
            change++;
        }

        if(change == 1)
        System.out.println(2);
        else
        System.out.println(1);
    }}
}
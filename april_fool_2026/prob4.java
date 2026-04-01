import java.util.Scanner;

public class prob4 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String args[]) {
        int n = scn.nextInt();

        String ans;

switch (n) {
    case 1:
        ans = "walk";
        break;
    case 2:
    case 3:
    case 4:
        ans = "no";
        break;
    case 5:
    case 6:
        ans = "yes";
        break;
    case 7:
        ans = "sdrawkcab";
        break;
    case 8:
        ans = "8";
        break;
    default:
        ans = "invalid";
}

        System.out.println(ans);
    }
}
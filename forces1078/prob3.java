import java.util.Scanner;

public class prob3 {
    public static Scanner scn = new Scanner(System.in);

    public static int fvalue = 0;
    public static String finalAns = "";

    public static void main(String[]args) {
        int t = scn.nextInt();

        while(t-->0){
            int n = scn.nextInt();
            int m = scn.nextInt();

            int[][]arr = new int[n][m];
             recursion(arr, n, m, 0, 0, n, m, "", 0);
             return finalAns;
        }
    }

    public static void recursion(int[][]arr, int rights, int downs, int sr, int sc, int er, int ec, String ans) {
        if(sr>er || sc>ec || rights<0 || downs<0)
        return;

        if(sr == er && sc ==ec) {
            //get left & right 1 count & multiply
            int value = getMultiplyValue(arr, ans);
            if(value > fvalue){
                //update final ans & val
                fvalue = value;
                finalAns = ans;
                return;
            }
        }
        
        recursion(arr, rights-1, downs, sr, sc+1, er, ec, ans+"R");
        recursion(arr, rights, downs-1, sr+1, sc, er, ec, ans+"D");

    }

    public static int getMultiplyValue(int[][]arr, String ans) {
        int leftCount=0, rightCount=0;

        
    }
}
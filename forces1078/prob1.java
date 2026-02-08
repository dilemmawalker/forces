import java.util.Scanner;

public class prob1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[]args) {
        int t = scn.nextInt();
        while(t-->0) {
            int boardsCount = scn.nextInt();
            int lawnmoverWidth = scn.nextInt();

            int noOfSet = boardsCount/lawnmoverWidth;
            int removeBoardCount = noOfSet * (lawnmoverWidth-1);

            removeBoardCount += boardsCount-(noOfSet*lawnmoverWidth);
            System.out.println(removeBoardCount);
        }
    }
}
import java.util.Scanner;

public class prob3 { 
    BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[]args) {
        int t = scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            int[]arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }

            findWinner(arr, n);
        }
    }

    public static int findWinner(int[]arr, int n){
        int tk=1;
        int pos=0;

        for(int i=0; i<n; i++){
            int ai = arr[i];

            //current move status:
            if(ai + pos + tk <= n) {
                tk+=ai;//main logic(how much to actually add!!)
                pos += tk;
            } else {
                tk+=ai;//dosen't matter
                pos = n;
            }

            if(pos == n){
                //winner state
            }
        }
    }
}
import java.util.Scanner;

public class prob2 { 
    public static Scanner scn = new Scanner(System.in);

    public static void main(String args[]) {
        int t = scn.nextInt();

        while(t-->0) {
            long n = scn.nextLong();
            int ans = 0;

                        //odd
                        for (long i = 0; ; i++) {
                        long a = createPalindrome(i, true);

                            if (a > n) {
                                break;
                            }

                            long b = n-a;
                            if(b%12==0) {
                                System.out.println(a+" "+ b);
                                ans = -1;
                                break;
                            }
                        }

                        //even
                        if(ans!=-1)
                        for (long i = 0; ; i++) {
                            long a = createPalindrome(i, false);

                            if (a > n) {
                                break;
                            }

                            long b = n-a;
                            if(b%12==0) {
                                System.out.println(a+" "+ b);
                                ans = -1;
                                break;
                            }
                        }

                if(ans == 0)
                System.out.println(-1);
        }
    }

    static long createPalindrome(long seed, boolean oddLength) {
    long pal = seed;

    if (oddLength) {
        seed /= 10;
    }

    while (seed > 0) {
        pal = pal * 10 + seed % 10;
        seed /= 10;
    }

    return pal;
}

}
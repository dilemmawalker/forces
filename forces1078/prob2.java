import java.util.Scanner;

public class prob2 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[]args) {
        int t = scn.nextInt();
        while(t-->0) {
            int noOfBanks = scn.nextInt();
            int maxTransferAmount = scn.nextInt();
            int maxCreditAmount = scn.nextInt();

            int[]bankAmount = new int[noOfBanks];
            int totalAmt = 0;
            for(int i=0; i<noOfBanks; i++){
                int currBankAmount = scn.nextInt();
                bankAmount[i] = currBankAmount;
                totalAmt+=currBankAmount;
            }
            int[]lossArray = new int[noOfBanks];

            createLossArray(lossArray, bankAmount, maxTransferAmount, maxCreditAmount);
            int lossAmt = 0;
            for(int i=0; i<noOfBanks; i++) {
                lossAmt += lossArray[i];
            }
            int maxLoss = findMaxLoss(lossArray);
            int finalAns = totalAmt - lossAmt + maxLoss;

            System.out.println(finalAns);
        }
    }

    public static void createLossArray(int[]lossArray, int[]bankAmount, int transferAmount, int creditAmount) {
        int n = lossArray.length;

        for(int i=0; i<n; i++) {
            int currAmount = bankAmount[i];
            int noOfTransfers = currAmount/transferAmount;

            //transfer loss + remaining untransferable amt
            int totalAmount = (noOfTransfers*(transferAmount-creditAmount)) + (currAmount - (noOfTransfers * transferAmount ));
            lossArray[i] = totalAmount;
        }
    }

    public static int findMaxLoss(int[]lossArray) {
        int n = lossArray.length;

        int ans = Integer.MIN_VALUE;
        for(int ele: lossArray) {
            ans = Math.max(ans, ele);
        }
        return ans;
    }
}
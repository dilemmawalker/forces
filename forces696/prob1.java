import java.util.Scanner;
public class prob1{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            String str=scn.next();
            int l=str.length();
            System.out.print(1);
            int num=1;
            for(int i=1;i<l;i++){
                char ch=str.charAt(i);
                if(ch==str.charAt(i-1))
                    num=(num+1)%2;
                else{
                    if(ch=='1')
                    num=1;
            }
                    System.out.print(num);
            }
            System.out.println();
        }
    }
}
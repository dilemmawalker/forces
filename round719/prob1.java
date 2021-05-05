import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            String str=scn.next();
            String s="";
            // if(n==0){
            //     System.out.println("YES");
            //     continue;
            // }
            char p=str.charAt(0);
            int i=0;
            for(i=1;i<n;i++){
                char ch=str.charAt(i);
                if(p!=ch){
                    s=s+p;
                    if(i==n-1)
                    s=s+ch;
                }
                p=ch;
            }
            // System.out.println(s);
            boolean arr[]=new boolean[26];
            n=s.length();
            for(i=0;i<n;i++){
                char ch=s.charAt(i);
                if(arr[ch-'A']){
                    System.out.println("NO");
                    break;
                }
                else{
                    arr[ch-'A']=true;
                }
            }
            if(i==n){
                System.out.println("YES");
            }
        }
    }
}
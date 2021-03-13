import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            boolean[]ans=new boolean[n];
            int[]pos=new int[n];
            int cpos=0;
            int lpos=-1;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                pos[i]=lpos;
                if(a!=0){
                    ans[i]=true;
                    lpos=set(ans,pos,i,lpos,a,i-a);
                }
                else{
                    pos[i]=lpos;
                    lpos=i;
                }
            }
            for(int i=0;i<n;i++){
                if(ans[i])
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static int set(boolean[]ans, int[]pos,int i,int lpos,int a,int lpossible){

        while(i>=0 && i>lpossible){
            ans[i]=true;
            i=pos[i];
            a--;
        }
        return i;
    }
}
import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    // public static int[][]dir=new int{{-1,0},{0,1},{1,0},{0,-1}};
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int px=scn.nextInt();
            int py=scn.nextInt();
            String str=scn.next();
            
            // boolean a=solve(0,0,0,px,py,str);
            // System.out.println(a==true?"YES":"NO");
            int l=0,u=0,d=0,r=0;
            int n=str.length();
            for(int i=0;i<n;i++){
                char ch=str.charAt(i);
                if(ch=='L'){
                    l++;
                }
                if(ch=='U'){
                    u++;
                }
                if(ch=='D'){
                    d++;
                }
                if(ch=='R'){
                    r++;
                }
            }
            boolean f1=false,f2=false;
            if(px>=0){
                if(r>=px)
                f1=true;
            }
            else{
                if(l>=(-px))
                f1=true;
            }

            if(py>=0){
                if(u>=py)
                f2=true;
            }
            else{
                if(d>=(-py))
                f2=true;
            }
            if(f1 && f2)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
    // public static boolean solve(int i,int idx1,int idx2,int px,int py,String str){
    //     if(idx1==px && idx2==py){
    //         return true;
    //     }
    //     if(i==str.length())
    //     return false;

    //     boolean res=false;

    //     int r=0,c=0;
    //     char ch=str.charAt(i);
    //     if(ch=='L'){
    //         r=-1;
    //         c=0;
    //     }
    //     else if(ch=='U'){
    //         r=0;
    //         c=1;
    //     }
    //     else if(ch=='R'){
    //         r=1;
    //         c=0;
    //     }
    //     else if(ch=='D'){
    //         r=0;
    //         c=-1;
    //     }
    //     res=res||solve(i+1,idx1+r,idx2+c,px,py,str);
    //     res=res||solve(i+1,idx1,idx2,px,py,str);

    //     return res;
    // }
}
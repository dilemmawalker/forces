import java.util.Scanner;
import java.util.HashSet;
public class prob3{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
        String str=scn.next();
        int n=str.length();

        HashSet<Integer>map1=new HashSet<>();
        HashSet<Integer>map2=new HashSet<>();

        int col=0;
        
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int val=ch-'a';
            col=Math.min(map1.size(),map2.size());
            if(map1.size()==col)
            col=0;
            else
            col=1;   //0-> map1,   1-> map2

            if(col==0){
            if(map1.contains(ch-'a')){
                col=1;
                if(!map2.contains(ch-'a')){
                    map2.add(ch-'a');
                }
            }
            else{
                map1.add(ch-'a');
            }
        }
        else{
            if(map2.contains(ch-'a')){
                if(!map1.contains(ch-'a')){
                    map1.add(ch-'a');
                }
            }
            else{
                map2.add(ch-'a');
            }
        }

        }
        System.out.println(Math.min(map1.size(),map2.size()));
    }
    }
}
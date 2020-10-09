import java.util.*;
import java.io.*;
public class prob2{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int x1=scn.nextInt();
            int y1=scn.nextInt();
            int z1=scn.nextInt();
            int x2=scn.nextInt();
            int y2=scn.nextInt();
            int z2=scn.nextInt();

            int cost=0;
                cost=Math.min(z1,y2)*2;
                if(z1>y2){
                    z1-=y2;
                    y2=0;

                    if(z1>z2){
                        z1-=z2;
                        z2=0;
                    }
                    else{
                        z2-=z1;
                        z1=0;
                        if(x1>z2){
                            x1-=z2;
                            z2=0;
                        }
                        else{
                            z2-=x1;
                            x1=0;
                            cost=cost-Math.min(y1,z2)*2;
                        }
                    }
                }
                else{
                    y2-=z1;
                    z1=0;
                    if(x1>z2){
                        x1-=z2;
                        z2=0;
                    }
                    else{
                        z2-=x1;
                        z1=0;
                        cost=cost-Math.min(y1,z2)*2;
                    }
                }
                System.out.println(cost);
            }
        }
    }
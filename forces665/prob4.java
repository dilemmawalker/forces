import java.util.*;
import java.io.*;
public class prob4{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static class pair{
        int v=0;
        int w=0;
        pair(int v,int w){
            this.v=v;
            this.w=w;
        }
    }
    public static ArrayList<pair>[]graph;
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            graph=new ArrayList[n];
            for(int i=0;i<n;i++){
                graph[i]=new ArrayList<>();
            }
            for(int i=0;i<n-1;i++){
                int u=scn.nextInt()-1;
                int v=scn.nextInt()-1;
                graph[u].add(new pair(v,0));
                graph[v].add(new pair(u,0));
            }
            PriorityQueue<Long>pq=new PriorityQueue<>();
            dfs(0,new boolean[n],pq,n);

            int m=scn.nextInt();
            long ans=0;
            long mod=(long)1e9 +7;
            if(m<=n-1){
                int[]arr=new int[n-1];
                int i=0;
                for( i=0;i<(n-1-m);i++){
                    arr[i]=1;
                }
                for(;i<n-1;i++){
                    arr[i]=scn.nextInt();
                }
                Arrays.sort(arr);
                for( i=0;i<n-1;i++){
                    ans=(ans+(arr[i]*pq.remove())%mod)%mod;
                }
            }else{
                int[]arr=new int[m];
                for(int i=0;i<m;i++){
                    arr[i]=scn.nextInt();
                }
                Arrays.sort(arr);
                int i=0;
                while(pq.size()!=0){
                    if(pq.size()==1){
                        long c=1;
                        for(;i<m;i++){
                            c=(c*arr[i])%mod;
                        }
                        // c=c%mod;
                        ans=(ans+(c*pq.remove())%mod)%mod;
                    }
                    else{
                    ans=(ans+(arr[i++]*pq.remove())%mod)%mod;
                    }
                }
            }
            System.out.println(ans%mod);
        }
    }
    public static int dfs(int src,boolean[]vis,PriorityQueue<Long>pq,int n){
        vis[src]=true;
        int c=0;
        int co=0;
        for(int i=0;i<graph[src].size();i++){
            pair e=graph[src].get(i);
            if(!vis[e.v]){
                co=dfs(e.v,vis,pq,n);
                c+=co;
                // graph[src].get(i).w=co;
                long mod=(long)1e9 +7;
                long a=(co*(n-co))%mod;
                pq.add(a);
            }
        }
        return c+1;
    }
}
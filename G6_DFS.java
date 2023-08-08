package Striver_Graph;

import java.util.ArrayList;

public class G6_DFS {
    public static void dfs1(int node,ArrayList <ArrayList<Integer>> l, boolean vis[],ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        for(Integer it:l.get(node)){
            if(!vis[it]){
                vis[it]=true;
                dfs1(it,l,vis,ls);
            }
        }
    }

    public static ArrayList<Integer> dfs2(ArrayList <ArrayList<Integer>> l,int n){
        ArrayList <Integer> ls=new ArrayList<>();
        boolean vis[]=new boolean[n+1];
        vis[0]=true;
        dfs1(0,l,vis,ls);
        return ls;
    }

    public static void main(String args[]){
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
            for (int i = 0; i < 5; i++) {
                adj.add(new ArrayList < > ());
            }
            adj.get(0).add(1);
            adj.get(1).add(0);
            adj.get(0).add(4);
            adj.get(4).add(0);
            adj.get(1).add(2);
            adj.get(2).add(1);
            adj.get(1).add(3);
            adj.get(3).add(1);

            System.out.println(dfs2(adj, 5));
    }
}

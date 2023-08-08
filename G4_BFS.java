package Striver_Graph;
import java.util.*;
public class G4_BFS {
    public static ArrayList<Integer> g5(int v, ArrayList <ArrayList<Integer>> l){
        ArrayList <Integer> bfs=new ArrayList<>();
        boolean vis[]=new boolean[v];
        Queue <Integer> q= new LinkedList<>();

        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer node= q.poll();
            bfs.add(node);
            for(Integer it:l.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }














    public static ArrayList<Integer> g25(int v, ArrayList <ArrayList<Integer>> l){
        boolean[] vis=new boolean [v];
        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>bfs=new ArrayList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer x =q.poll();
            bfs.add(x);


            for(Integer y:l.get(x)){
                if(vis[y]==false){
                    q.add(y);
                    vis[y]=true;

                }
            }
        }

        return bfs;
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
            
            
            ArrayList < Integer > ans = g25(5, adj);
            int n = ans.size(); 
            for(int i = 0;i<n;i++) {
                System.out.print(ans.get(i)+" "); 
            }
    }
}

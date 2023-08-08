package Striver_Graph;

import java.util.*;

public class G8_Islands {

    public static class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;

        }
    }

    public static void bfs(int i,int j,int [][] grid,boolean vis[][]){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j]=true;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int row1=p.row;
            int col1=p.col;
            
            for(int i1=-1;i1<2;i1++){
                for(int j1=-1;j1<2;j1++){
                    int nrow= row1+i1;
                    int ncol=col1+j1;
                    if(grid[nrow][ncol]==1 && vis[nrow][ncol]!=true){
                        vis[nrow][ncol]=true;
                        q.add(new Pair(nrow, ncol));

                    }
                }
            }
        }
    }


    public static int Islands(int [][]grid){
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        boolean vis[][]=new boolean[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]!=true && grid[i][j]==1){
                    cnt++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return cnt;
    }   
}

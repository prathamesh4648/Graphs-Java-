package Striver_Graph;
import java.util.*;

public class G9_Flood_fill {
    public static void flood(int row ,int col,int image[][],int new_color,int ini_color,int ans[][],int []delrow,int []delcol){
        ans[col][row]=new_color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 &&ncol<m && image[nrow][ncol]==ini_color && ans[nrow][ncol]!=new_color) {
                ans[nrow][ncol]=new_color;
                flood(nrow,ncol,image,new_color,ini_color,ans,delrow,delcol);

            }
        }
    }  

    public static int[][] flood2(int new_color,int image[][],int sr,int sc){
        int ans[][]=image;
        int ini_color=image[sr][sc];
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        flood(sr,sc,image,new_color,ini_color,ans,delrow,delcol);
        return ans;
    }


    public static void main(String args[]){
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        int [][]o=flood2(2,image,1,1);
        for(int a []:o ){
            System.out.println(Arrays.toString(a));
        }
    }
}

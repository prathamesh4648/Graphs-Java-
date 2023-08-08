package Striver_Graph;
import java.util.*;

public class G3_representation {
    public static ArrayList<ArrayList<Integer>>  g3(int arr[][],int n,int large){
        
            ArrayList<ArrayList <Integer>> l=new ArrayList<ArrayList <Integer>>();
        
        for(int i=0;i<=5;i++){
            l.add(new ArrayList<Integer>());

        }
        for(int j=0;j<n;j++){
            l.get(arr[j][0]).add(arr[j][1]);
            l.get(arr[j][1]).add(arr[j][0]);

        }

        for(int k=1;k<large;k++){
            for(int x=0;x<l.get(k).size();x++){
                System.out.print(l.get(k).get(x));
            }
            System.out.println("_");
        }
        return l;

    }

    public static void main(String args[]){
        int arr[][]={{1,2},{3,4},{3,5}};
        int n=3;
        g3(arr,n,6);

    }
}

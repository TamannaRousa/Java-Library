package Recursion;

public class tilingProblem {
    public static int tiling(int n){//2xn floor size
       if(n==0 || n==1){
         return 1;
       }

       //choice
       //vertical tiles
       int vt = tiling(n-1);//total width n -->vertTile width 1 --> n-1

       //horizontal tiles
       int ht = tiling(n-1);//total width n -->horzTile width 2 --> n-2
        
       int totWays = vt + ht;
       return totWays;
    }
}

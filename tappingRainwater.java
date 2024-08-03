import java.util.*;
public class tappingRainwater {
    public static int tappRainwater(int height[]) {
        int n = height.length;
        //calculate left max boundary - in the form of array
        int leftMax[]  = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[]  = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop 
        for(int i=0; i<n; i++){
        //waterLvel =  min(leftmax bndry , rightmax)
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        // trapped water = waterLvel - height[i]
        trappedWater +=waterLevel - height[i];//arae = h x w(w=1) = h(wl - h)
        }
         return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(tappRainwater(height));
    }
}
// int n = height.length;
// int leftMax[] = new int[n];

// leftMax[0] = height[0];
// for(int i=1 ; i<n ; i++){
//     leftMax[i] =  Math.max(height[i], leftMax[i-1]);
// }

// int rightMax[] = new int[n];
// rightMax[n-1] = height[n-1];
// for(int i=n-2; i<0 ; i++){
//     rightMax[i]  = Math.max(height[i], rightMax[i+1]);
// }

// int trapWatr = 0;
// for(int i=0 ;i<n;i++){
//     int waterLevel = Math.min(leftMax[i] , rightMax[i]);
//     trapWatr += waterLevel - height[i];
// }
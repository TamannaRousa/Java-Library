import java.util.*;
//brute force
public class mazSubaaraySUM {
    public static int maxSubSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum += arr[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    //prefix array --> for every subaaray (prefix = 1 + (-2) ==-1 & addding so on with new values)
    public static int prefixSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] =  new int[arr.length];// prefix array = prefix[i-1]+arr[i]
 
        prefix[0] = arr[0];
        //prefix array find
        for(int i = 0 ;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //subarray
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                // currSum=prefix[end] -  prefix[start-1]; iff start ==0 there is no changes so
                currSum = start==0 ? prefix[end] : prefix[end] -  prefix[start-1];
               
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    //kadanes approach O(n) --> small positive & big negative sum will be negative . so remove that ---> when final sum  become negative make it 0
// Current sum & max sum  only put positive one & max of both in max array

public static int kadanes(int arr[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i=0; i< arr.length;i++){//single loop
        cs = cs + arr[i];// add array element to the current sum array cs
        if(cs < 0){//no neg allowed
            cs = 0;
        }
        ms = Math.max(cs,ms);
    }
    return ms;
}

}


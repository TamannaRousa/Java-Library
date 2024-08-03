import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class arrayP2 {
    
    public List<List<Integer>> threeSum(int nums[]) {
    List<List<Integer>> result =  new ArrayList <List<Integer>> (); //unique
        int n= nums.length;
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet = new ArrayList < Integer > ();
                        triplet.add(nums[i]); 
                        triplet.add(nums[j]); 
                        triplet.add(nums[k]); 
                        Collections.sort(triplet);
                         result.add(triplet);
                    }
                }
            }
        }
     
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
        return result;
        }
    } 


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

public class rarrayC{
   //   public static void removeDuplicate(int nums[]){
   //      Set<Integer>  set = new HashSet<>();
   //      for(int i = 0; i< nums.length ; i++){
   //           set.add(nums[i]);//set doesnot allow duplicate elements
   //      }
   //      System.out.println(set.size());     
   //   }
public static void mergeSortedArray(int nums1[], int nums2[] ,int m, int n) {
   
       int i =0;
       int j= 0;
       int k= 0;

       while(i<m && j<n){
         if(nums1[i] <= nums2[j]){
            nums1[k] = nums1[i];
            i++;
         }
         else{
            nums1[k] = nums2[j];
            j++;
         }
         k++;
       }

       if(i<m){
        nums1[k] = nums1[i];
        i++;
        k++;
       }

       if(j<n){
       nums1[k] = nums2[j];
        j++;
        k++;
       }
       for(i = 0; i< m+n ;i++){
         System.out.print(nums1[i]+"");
       }
       System.out.println();
      }

      public static void missingNumber(int nums[]) {
        int n_xor = nums.length;
         for(int i=0; i<nums.length; i++){
           n_xor = n_xor ^ i; //n_xor = 3 --> 3 ^ 0,1,2,3
           n_xor = n_xor ^ nums[i];// 3 ^ 3,0,1---> 1 3 0 cancel out 2 remains
            }
            System.out.print(n_xor);
         }

         public static void printPascal(int n) {
            int[][] ans = new int[n][n];

            for(int i=0;i<n;i++){
              for(int j=0;j<=i;j++){
                if(j==0 && i==j){//first & last 1
                    ans[i][j]=1;
              }
              else{
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j]; //add above two incides element
              }
              System.out.print(ans[i][j] + " ");
            }
            System.out.println();
          }
        }

        public static int signProduct(int nums[]){
          int product = 1;
          for(int i=0;i<nums.length;i++){
            product = product * nums[i];
          }
          return product;
        }
         public static void signFunc(int x) {
            if(x == 0){
              System.out.print("0");
            }
            else if(x<0){
              System.out.print("-1");
            }

          else{
            System.out.print("1");
          }
         }
         //OR
         public static void arraySign(int num[]){
          int count = 0;
          for( int i = 0 ; i < num.length ; i++ ){
              if( num[i] == 0){
                  System.out.println("0"); 
              }
              else if(num[i] <0){
                  count++;
              }
          }
              if(count %2 ==1){
                  System.out.println("-1");
              }
              else{
                  System.out.println("1");
              }
          }

         //Palindrome-EASY 
         public static boolean palindroome(int n){
          int reverse = 0;
          int temp = n;
          while(n!=0){
              int x = n%10;
              reverse = reverse*10+x;
              n=n/10;
          }
          if(reverse==temp){
            return true;
          }
          else{
            return false;
          }
         
         }
    public static void main(String[] args) {
      //   int nums[] = {0,1,1,1,2,2,3};
      //   removeDuplicate(nums);

      //   int nums1[] = {1,2,3};
      //   int nums2[] = { 2,5,6};
      // mergeSortedArray(nums1,nums2,3,3);

      // int nums[] = {3,0,1};
      // missingNumber(nums);

      // int n=5;
      // printPascal(n);

      // int nums[] = {-1,-2,0};
      // int x = signProduct(nums);
      // signFunc(x);
      // arraySign(nums);

      System.out.println(palindroome(121));
        
    }
  }


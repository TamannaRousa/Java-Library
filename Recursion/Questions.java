package Recursion;

public class Questions {
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        // int fnm1 = fact(n-1);
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(sumFirstn(3));
        System.out.println(fibbSeries(5));

        int arr[] = { 3,1,2,3,6,5};
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOccur(arr, 0, 3));
        System.out.println(lastOccur(arr, 0, 3));
    }

    public static int sumFirstn(int n) {
        int sum=0;
        if(n==1){
            return 1;
        }
        sum = n + sumFirstn(n-1);
        return sum;
    }

    public static int fibbSeries(int n) {
       
        if(n==0){
          return 0; 
        }
        if(n==1){
            return 1;
        }
        // int fb1 = fibbSeries(n-1);
        // int fb2 = fibbSeries(n-2);
        int fb = fibbSeries(n-1) + fibbSeries(n-2);
        return fb;
    }

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
         
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);

    }

    public static int firstOccur(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, i+1, key);
    }

    public static int lastOccur(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccur(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;

    }
}

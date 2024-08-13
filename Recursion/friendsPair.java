package Recursion;

public class friendsPair {
    public static int pairing(int n) {
        if(n==1 || n==2){
            return n;
        }

        //choice of Pairing 
        //single
        int p1 = pairing(n-1);

        //pair
        int p2 = pairing(n-2);
        int pairWays = (n-1) * p2;

        //total ways or single and double
        int totalWays = p1+pairWays;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(pairing(4));
    }
}

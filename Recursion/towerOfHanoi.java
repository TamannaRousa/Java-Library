package Recursion;

public class towerOfHanoi {
    public static void hanoiProblem(int n, String rod1, String rod2, String rod3){
        if(n==1){
            System.out.println("Move disk 1 from "+rod1+" to " +rod3);
            return;
        }
        
        hanoiProblem(n-1, rod1, rod3, rod2);
        System.out.println("Move disk" +n+ " from " +rod1+ " to " + rod3);
        hanoiProblem(n-1, rod2, rod1, rod3);

    }
    public static void main(String[] args) {
       hanoiProblem(2, "A", "B", "C");
    }
}

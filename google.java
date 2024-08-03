public class google {
    public static int[] pascalKth(int n){
        int[] ans = new int[n+1];
        ans[0]=1;
        for(int i=0;i<=n;i++){
            for(int j=i;j>0;j--){
                ans[j] +=ans[j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pascalKth(2));
    }
}


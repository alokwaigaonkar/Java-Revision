
public class PS2 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n ; row ++){
            for(int col = 1; col<=n ; col++){
                int min1 = Math.min(row, col);
                int min2 = Math.min(n-row+1,n-col+1);
                int minDistnace = Math.min(min1,min2);

                int value = minDistnace;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}

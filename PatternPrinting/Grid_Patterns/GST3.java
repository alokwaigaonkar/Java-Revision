public class GST3 {
    public static void main(String[] args) {
        int n = 7;

        for(int row = 1; row <= n ; row++){
            for(int col = 1; col <= n ; col++){
                if(row == 1 || row == n || col == 1 || col == n || row == col || row + col == n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

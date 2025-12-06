
public class TS8 {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row <= n ; row++){

            for(int spaces = 1 ; spaces <= n- row ;spaces++){
                System.out.print(" ");
            }
            for(int col =1;col <= 2*row -1;col++){
                
                if(row == 1 || col ==1 || col == 2*row -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int row = n-1; row >=1;row--){
            for(int spaces = 1; spaces <=n-row;spaces++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= 2*row -1;col++){
                if(row == 1 || col ==1 || col == 2*row-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

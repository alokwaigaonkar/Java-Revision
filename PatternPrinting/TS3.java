

public class TS3 {
    public static void main(String[] args) {
        int n = 5;
        
        for(int row = 1; row <= 5; row++){
            for(int j = 1;j<= n-row;j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j<=row ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

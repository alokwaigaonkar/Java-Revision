
public class TS9 {
    public static void main(String[] args) {
        int n = 5;
        
        for(int row = 1; row <=n;row++){
            for(int spaces = 1; spaces <= n-row;spaces++){
                System.out.print(" ");
            }
            for(int numbers = 1; numbers<=row;numbers++){
                System.out.print(numbers);
            }
            for(int numbers = row-1;numbers>=1;numbers--){
                System.out.print(numbers);
            }
            System.out.println();
        }
    }
}


public class TS10 {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1 ; row <= n ; row++){
            for(int leftStars = 1; leftStars <=row;leftStars++){
                System.out.print("*");
            }
            for(int spaces = 1 ; spaces <= 2*n - 2*row ; spaces++){
                System.out.print(" ");
            }
            for(int rightStars = 1 ; rightStars<=row ; rightStars++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row = n-1;row>=1;row--){
            for(int leftStars = 1; leftStars<= row ; leftStars++){
                System.out.print("*");
            }
            for(int spaces = 1 ; spaces <= 2*n - 2*row ; spaces++){
                System.out.print(" ");
            }
            for(int rightStars = 1 ; rightStars <= row ; rightStars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

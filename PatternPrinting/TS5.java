
public class TS5 {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1 ; row <= n ; row ++){
            for(int spaces = 1; spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            for(int stars = 1; stars <= 2 * row -1 ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

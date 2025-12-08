
public class PS5 {
    public static void main(String [] args){

        int n = 4;

        int top = 0;
        int left =0;
        int bottom = n-1;
        int right = n-1;
        int val = 1;
        int [][] matrix = new int[n][n];

        while(val<=n*n){

            for(int col = left ; col<=right;col++){
                matrix[top][col] = val++;
            }
            top++;
            for(int row = top ; row <= bottom ; row ++){
                matrix[row][right] = val++;
            }
            right--;
            if(top<=bottom){
                for(int col = right ; col>=left;col--){
                    matrix[bottom][col] = val++; 
                }
                bottom--;
            }
            
            if(left<=right){
                for(int row = bottom ; row>=top ; row--){
                    matrix[row][left]= val++;
                }
                left++;
            }
            
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]);
                if (col < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

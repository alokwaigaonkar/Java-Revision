
public class PS6 {
    public static void main(String [] args){

        int n = 4;

        int top = 0;
        int left =0;
        int bottom = n-1;
        int right = n-1;
        int val = 1;
        int[][] matrix = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
        };


        while(top<=bottom && left<=right){

            for(int col = left ; col<=right;col++){
                System.out.print(matrix[top][col]+" ");
            }
            
            top++;
            for(int row = top ; row <= bottom ; row ++){
                System.out.print(matrix[row][right]+" "); 
            }
            
            right--;
            if(top<=bottom){
                for(int col = right ; col>=left;col--){
                    System.out.print(matrix[bottom][col]+" ");
                }
                bottom--;
            }
            
            if(left<=right){
                for(int row = bottom ; row>=top ; row--){
                    System.out.print(matrix[row][left]+" ");
                }
                left++;
            }
            
        }
    }
}

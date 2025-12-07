
public class PS3 {
    public static void main(String[] args) {
        int n =5;
        for(int row = 1; row <= n ; row ++){
            if(row <n){
                for(int spaces = 1; spaces <= n- row; spaces++){
                    System.out.print(" ");
                }
                for(int col = 1 ; col <= 2*row-1 ; col++){
                    if(row == 1 || col ==1 || col == 2*row -1 ){
                        System.out.print(row);
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
            }else{
                for(int i = 1; i<=n;i++){
                    System.out.print(row);
                    if(i<n){
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println();
        }
    }
}

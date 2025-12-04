

public class EquiIdx {
    public static int solution(int [] arr){
        int totalSum = 0;
        for(int i =0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        
        int leftSum = 0;
        for(int i=0;i<arr.length;i++){
            if(leftSum == (totalSum -leftSum - arr[i])){
                return i;
            }
            leftSum+=arr[i];
        }
    return -1;
    }

    public static void main(String [] args){
        int[] arr = {1,2,3,1,2};
        System.out.println(solution(arr));
        
    }

}

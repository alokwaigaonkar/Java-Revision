
public class FindMax {

    public static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String [] args){
        int [] arr = {5, 9, 1, 7, 3};
        System.out.println(findMax(arr));
    }
}
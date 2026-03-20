public class SearchInsertPosition {

    public static int searchInsertPosition(int [] arr , int target){

        if(arr == null || arr.length == 0 ){
            return 0;
        }

        int low =0;
        int high = arr.length-1;
        int mid =low + (high - low)/2;

        while(low <= high){
            mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid-1;
            } else{
                low = mid +1;
            }
        }
        return low;
    }
    public static void main(String [] args){
        int arr [] = {1,3,4,5,6};
        System.out.println(searchInsertPosition(arr, 2)); // output 1
        System.out.println(searchInsertPosition(arr, 7)); // output 4
        System.out.println(searchInsertPosition(arr, 0)); // output 0
        System.out.println(searchInsertPosition(arr, 1)); // output 0
    }
}
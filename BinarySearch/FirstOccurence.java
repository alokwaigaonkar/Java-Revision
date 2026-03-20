
public class FirstOccurence {

    public static int  firstOccurence(int [] arr , int target){
        int low = 0, high = arr.length-1;
        int first = -1;

        while(low <= high){
            int mid = low + (high -low )/2;

            if(arr[mid ] == target){
                first = mid ;
                high = mid -1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int arr [] = {5,7,7,8,8,10};
        System.out.println(firstOccurence(arr, 8));
    }
    
}

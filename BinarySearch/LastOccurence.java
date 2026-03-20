
public class LastOccurence {

    public static int lastOccurence(int [] arr , int target){
        int low = 0, high = arr.length-1;
        int last =-1;

        while(low <= high){
            int mid = low + (high -low )/2;

            if(arr[mid ] == target){
                last = mid ;
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int arr [] = {5,7,7,8,8,10};
        System.out.println(lastOccurence(arr, 8));
    }
}

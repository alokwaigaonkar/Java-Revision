

public class FirstAndLastOccurence {

    public static int[] firstAndLastOccurence(int [] arr , int target){
        int [] result = {-1,-1};
        result[0] = firstOccurence(arr ,target);
        result[1] = lastOccurence(arr,target);
        return result;
        
    }
    public static int firstOccurence(int [] arr , int target){
        int low = 0 ,high = arr.length-1;
        int first =-1;

        while(low <= high){
            int mid = low + (high - low )/2;
            if(arr[mid ] == target){
                first = mid ;
                high = mid-1;
            }else if (arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return first ;
    }
    public static int lastOccurence(int [] arr ,  int target){
        int low = 0 ,high = arr.length-1;
        int last =-1;

        while(low <= high){
           int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                last = mid ;
                low = mid +1;
            }else if (arr[mid] < target){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int arr [] = {5,7,7,8,8,10};
        int [] result = firstAndLastOccurence(arr, 8);
        for(int i : result ){
            System.out.println(i);
        }
    }
}

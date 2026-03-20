
public class SqrtUsingBinarySearch {

    public static int sqrtUsingBinarySearch( int x){
        if ( x== 0){
            return 0;
        }
        int low = 1;
        int high = x;
        int sqrt = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(mid == x/mid){
                sqrt = mid;
                return sqrt;
            }
            else if (mid < x/mid ){
                sqrt = mid ;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return sqrt;
    }
    public static void main(String [] args){
        System.out.println(sqrtUsingBinarySearch(1));
    }
}

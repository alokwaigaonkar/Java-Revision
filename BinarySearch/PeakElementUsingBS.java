
public class PeakElementUsingBS {

    public static int peakElementUsingBruteForce(int [] arr){
        int n = arr.length;
        for(int i =0; i< arr.length;i++){
            if(i==0){
                if(arr[i] > arr[i+1])return i;
            }
            else if(i==n-1){
                if(arr[n-1]>arr[n-2]) return i;
            }
            else {
                if(arr[i]>arr[i-1] && arr[i]>arr[i-2]) return i; 
            }
            
        }
        return -1;
    } 

    public static int peakElementUsingBS(int [] arr){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid = low + (high -low)/2;
            if(arr[mid] < arr[mid +1]) {
                low = mid +1;
            }else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,1,3,5,6};
        System.out.println(
            peakElementUsingBS(arr)
        );
    }
}



public class SecondLargest {

    public static int secondLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
                
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest= arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    public static void main(String [] args){
        int [] arr = {10, 5, 8, 10, 2};
        System.out.println(secondLargest(arr));
        int arr1 [] = {3, 3, 3};
        System.out.println(secondLargest(arr1));
    }
}

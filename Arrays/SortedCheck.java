
public class SortedCheck {

    public static boolean isSorted(int [] arr){
        if(arr.length == 1)return true;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i])return false;
        }
        return true;
    }
    public static void main(String [] args){
        int [] arr1={1, 2, 2, 3};
        int [] arr2={3, 2, 1};
        int [] arr3={5};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr3));
    }
}

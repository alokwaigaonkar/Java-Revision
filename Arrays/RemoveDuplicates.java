
public class RemoveDuplicates {

    public static int removeDuplicates(int [] arr){
        if(arr.length ==0)return 0;
        int slow = 0;
        int fast =1;
        while(fast<arr.length){
            if(arr[slow] != arr[fast]){
                slow+=1;
                arr[slow]= arr[fast];
            }
            fast++;
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(removeDuplicates(arr));
    }
}

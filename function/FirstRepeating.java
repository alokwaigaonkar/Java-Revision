public class FirstRepeating {

    public static int solution(int [] arr){
        int i =0;
        while(i<arr.length){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
            i++;
        }
        return -1;
    }
    public static void main(String [] args){
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(solution(arr));
    }
}

public class ReverseString2 {

    public static String reverseString(String str){
        if(str == null || str.isEmpty()){
            return "Invalid Input";
        }
        int n = str.length();
        int left = 0;
        int right = n-1;

        char [] collector = str.toCharArray();

        while(left < right){
            char temp = collector[left];
            collector[left] = collector[right];
            collector[right] = temp;

            left++;
            right--;

        }
        return new String(collector);
    }
    public static void main(String args[]){
        System.out.println(reverseString("programming"));
    }
}

public class ReverseOnlyAplhabets {

    public static String reverseOnlyAplhabets(String str){
        if(str == null || str.isEmpty()){
            return "Invalid String";
        }

        int n = str.length();
        int left = 0;
        int right = n-1;

        char [] collector = str.toCharArray();

        while(left < right){
            if (!Character.isLetter(collector[left])){
                left++;
            }
            else if(!Character.isLetter(collector[right])){
                right--;
            }else{
                char temp = collector[left];
                collector[left] = collector[right];
                collector[right] = temp;
                left++;
                right--;
            }
        }

        return new String(collector);
    }
    public static void main(String[] args) {
        System.out.println(reverseOnlyAplhabets("A-l-ok"));
    }
}

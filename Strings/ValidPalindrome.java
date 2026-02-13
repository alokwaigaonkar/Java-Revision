public class ValidPalindrome {

    public static boolean isValidPalindrome(String str){

        if(str == null){
            return false;
        }

        str = str.toLowerCase();
        int left =0;
        int right = str.length()-1;

        while(left < right){
            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            }else{
                if(leftChar!=rightChar){
                    return false;
                }else{
                    left++;
                    right--;
                }
            }
        }
        return true;

    }
    public static void main(String [] args){
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isValidPalindrome("race a car"));
        System.out.println(isValidPalindrome(" "));
    }
}

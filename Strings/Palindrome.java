public class Palindrome {

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left)!= s.charAt(right)){
                return false ;
            }
            left++;
            right--;
           
        }
        return true;

    }
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "hello";
        String s3 = "12121";
        String s4 = "a";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
    }
}

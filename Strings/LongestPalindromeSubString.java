public class LongestPalindromeSubString {
    public static String longestPalindrome(String s){
        if(s == null ){
            return "Invalid Input";
        }
        if(s.isEmpty()){
            return "";
        }
        int n = s.length();

        int maxLength = Integer.MIN_VALUE;
        int startIndex = Integer.MIN_VALUE;
        
        for(int i =0;i<n;i++){
            int oddLen = expansionHelper(s, i, i);
            int evenLen = expansionHelper(s, i, i+1);
            
            int length = Math.max(oddLen, evenLen);
            if(length>maxLength){
                maxLength=length;
                startIndex = i-(maxLength-1)/2;
            }
            
            
        }
        return s.substring(startIndex,startIndex+maxLength);
        
    }

    private static int  expansionHelper(String s , int left , int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));
    }
}

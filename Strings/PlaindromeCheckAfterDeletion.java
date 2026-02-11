public class PlaindromeCheckAfterDeletion {

    public static boolean checkSubstring(String s , int left , int right ){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }

    public static boolean check(String s){ // abca
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return checkSubstring(s, left+1, right) || checkSubstring(s, left, right-1);
            }
        }
        return true;
    }
    public static void main(String []args){
        System.out.println(check("abcdef"));
    } 
}

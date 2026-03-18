import java.util.HashSet;

public class LongestSubstringWithoutReapeatingChars {

    public static int solution(String str){
        if(str == null || str.isEmpty()){
            return -1;
        }

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right ;
        int maxLength =0;

        for(right = 0; right < str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            
            maxLength = Math.max(maxLength, right-left +1);
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(solution("abcabcdf"));
        //AAAAAAA
    }
}

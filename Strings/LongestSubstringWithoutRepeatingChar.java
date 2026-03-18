

public class LongestSubstringWithoutRepeatingChar {

    public static int solution(String str ){
        if(str == null || str.isEmpty()){
            return -1;
        }

        int maxLength = 0;

        for(int i = 0 ; i<str.length();i++){
            boolean [] seen = new boolean[26];

            for(int j = i;j<str.length();j++){
                char ch = str.charAt(j);
                if(seen[ch-'a']){
                    break;
                }
                seen[ch-'a'] = true;
                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(solution("abab"));
        
    }
}

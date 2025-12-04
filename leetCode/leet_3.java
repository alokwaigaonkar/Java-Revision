import java.util.ArrayList;

public class leet_3 {

    public static ArrayList<String> getAllSubstrings(String str) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                sb.append(str.charAt(j));
                result.add(sb.toString());  // store substring
            }
        }
        return result;
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength =0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(allUniqueSub(sub)){
                    maxLength = Math.max(maxLength, sub.length());
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }

    public static boolean allUniqueSub(String str){
        boolean [] seen = new boolean[256];
        for(char c :str.toCharArray()){
            if(seen[c]) return false;
            seen[c] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
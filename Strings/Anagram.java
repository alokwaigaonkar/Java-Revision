public class Anagram {
    public static boolean areAnagrams(String s1 , String s2){

        if(s1==null || s2==null)return false;

        if(s1.length()!=s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2=s2.toLowerCase();

        int freq [] = new int[26];
        for(int i =0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 <'a'||ch1>'z'||ch2<'a'||ch2>'z'){
                return false;
            }
            freq[ch1 - 'a']++;
            freq[ch2 - 'a']--;
        }

        for(int count : freq){
            if(count!=0)return false;
        }
        

        return true;


    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("triangle", "integral"));
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("hello", "world"));
    }
}

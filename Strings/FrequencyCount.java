public class FrequencyCount {
    public static void solution(String str){
        int[] freq = new int[26];

        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i =0;i<26;i++){
            if(freq[i]>0){
                char ch = (char)(i+'a');
                System.out.println(ch + "-->"+freq[i]);
            }
        }
    }

    public static void main(String [] args){
        String str = "programming";
        solution(str);
    }
}

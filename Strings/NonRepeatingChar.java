public class NonRepeatingChar {

    public static void solution(String str){
        if(str == null || str.isEmpty()){
            System.out.println("Invalid Input");
            return;
        }

        int [] freq = new int[26];
        str = str.toLowerCase();
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch : str.toCharArray()){
            if(freq[ch-'a']==1){
                System.out.print(ch );
                return;
            }
        }
    }
    public static void main(String [] args){
        solution("swiss");
    }
}

public class VowelConsonants {

    public static void countVowelConsonants(String s , int vowels , int consonants){

        for(char ch : s.trim().toLowerCase().toCharArray()){
            if(!Character.isLetter(ch)){
                continue;
            }
            if(ch == 'a' || ch =='e'||ch =='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels = "+ vowels);
        System.out.println("Consonants = "+ consonants);

    }
    public static void main(String[] args) {
        String s = "alok waigaonkar";
        int vowels = 0;
        int consonants = 0;
        countVowelConsonants(s, vowels, consonants);

    }
}

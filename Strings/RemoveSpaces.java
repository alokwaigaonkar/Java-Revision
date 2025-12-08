public class RemoveSpaces {

    public static String removeSpaces(String s){
        char [] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            if(ch!=' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeSpaces("a l o k  waig aon kar"));
    }
}

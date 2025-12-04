public class leet_166 {


    public static String  checkString(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                int len = j - i;
                if (j + len <= str.length()) {
                    String sub1 = str.substring(i, j);
                    String sub2 = str.substring(j, j + len);
                    if (sub1.equals(sub2)) {
                        return sub1;
                    }
                }
            }
        }
        return "";
    }


    public static void main(String[] args) {
        double result = (double) 4/333;
        String str = Double.toString(result);
        
        String str1 = checkString(str);
        System.out.println(str1);
        
        
    }
}
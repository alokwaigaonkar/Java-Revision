
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {

    public static void solution(String str){
        Queue<Character> q = new LinkedList<>();
        char [] freq = new char[26];
        for(char c : str.toCharArray() ){
            freq[c-'a']++;
            q.add(c);
            while(!q.isEmpty() && (freq[q.peek()-'a']>1)){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1"+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        solution(str);
    }
}

import java.util.HashMap;

public class leet_165 {

    public static int versionCompare(String str1 , String str2){
        String [] arr = str1.split("\\.");
        String [] arr2 = str2.split("\\.");
        if(arr.length != arr2.length){
            return 0;
        }
        else{
            for(int i =0;i<arr.length;i++){
                int v1 = Integer.parseInt(arr[i]);
                int v2 = Integer.parseInt(arr2[i]);
                if(v1 < v2){
                    return -1;
                }
                else if(v1>v2){
                    return 1;
                }
            }
            return 0;
        }
       
    }
    public static void main(String[] args) {
        String str1 = "1.0";
        String str2 = "1.0.0.0";
        System.out.println(versionCompare(str1, str2));
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(1, 1);
        System.out.println(h.getOrDefault(2, 0));        
    }
}

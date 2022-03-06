package String;

import java.util.HashMap;
import java.util.Map;




public class duplicate {
    public static void countDuplicate(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (Map.Entry mapElement : map.entrySet()) {
            char key = (char) mapElement.getKey();
            int value = ((int) mapElement.getValue());
            if (value > 1) {
                System.out.println("count of " + key + " is " + value);
            }
        }
    }



    public static void main(String[] args) {
        String str = "test string";
        countDuplicate(str);
        
    }
    
}

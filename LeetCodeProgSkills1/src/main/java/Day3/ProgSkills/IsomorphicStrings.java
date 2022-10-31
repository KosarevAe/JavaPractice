package Day3.ProgSkills;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {
       String s = "paper";
       String t = "title";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t){
        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(map.containsKey(s1)){
                if(map.get(s1) != t1){
                    return false;
                }
            } else {
                if(set.contains(t1)){
                    return false;
                }
                map.put(s1, t1);
                set.add(t1);
            }
        }
        return true;
    }
}

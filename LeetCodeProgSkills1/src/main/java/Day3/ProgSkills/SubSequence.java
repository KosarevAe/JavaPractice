package Day3.ProgSkills;

public class SubSequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";

        System.out.println(isSequence(s,t));
    }

    public static boolean isSequence(String s, String t){
        int i = 0;
        int j = 0;

        if(s == null) return false;
        if(s.length() == 0) return true;

        if(s.length() > t.length()){
            return false;
        }

        while(i < s.length() && j < t.length()){
            char cs = s.charAt(i);
            char ct = t.charAt(j);

            if(cs == ct){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}

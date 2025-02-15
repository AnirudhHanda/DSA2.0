import java.util.*;

public class O24RemoveDuplicates {

    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean[] seen) {
        // base case
        if(idx == str.length()) {
            System.out.println(sb);
            return;
        }
        
        char ch = str.charAt(idx);
        if(!seen[ch - 'a']) {
            sb.append(ch);
            seen[ch-'a'] = true;
        }
        removeDuplicates(str, idx+1, sb, seen);
    }

    public static void main(String[] args) {
        String str = "homi bhabha";

        System.out.println("Before: "+str);
        str = str.replaceAll("\\s+", "");
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    /* Think of array approach
    * sort both inputs and compare them
    * O(1) */
//    public static boolean isAnagram(String s, String t) {
//        char[] sortedInputA = s.toCharArray();
//        char[] sortedInputB = t.toCharArray();
//
//        Arrays.sort(sortedInputA);
//        Arrays.sort(sortedInputB);
//
//        return Arrays.equals(sortedInputA, sortedInputB);
//    }

    /* use HashMap for input A to count each letter
    * decrease the count of each letter of A by comparing each letter of B if existed
    * if any of letter of A is not 0, return false otherwise, true
    * O(n) but space-wise it is worse*/
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> lettersInputA = new HashMap<>();

        for (char c : s.toCharArray()) {
            lettersInputA.put(c, lettersInputA.getOrDefault(c, 0) + 1);
        }

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : t.toCharArray()) {
            if (!lettersInputA.containsKey(c)) {
                return false;
            } else {
                lettersInputA.put(c, lettersInputA.get(c) - 1);
            }
        }

        for (char c : lettersInputA.keySet()) {
            if (lettersInputA.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aacc";
        String b = "ccca";
        System.out.println(isAnagram(a,b));
    }
}

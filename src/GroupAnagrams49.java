import java.util.*;

public class GroupAnagrams49 {
    /* with HashMap, reorder of each string of strs alphabetically as a key
    * then add to the list if it is the same order found
    * otherwise, create the new list and add.
    * return all the values O(n)*/
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answers = new ArrayList<>();
        Map<String, List<String>> orderWords = new HashMap<>();

        if (strs.length <= 1) {
            answers.add(Arrays.asList(strs));
        } else {
            for (String str : strs) {
                char[] tmpChars = str.toCharArray();
                Arrays.sort(tmpChars);
                String tmpStr = String.valueOf(tmpChars);
                orderWords.computeIfAbsent(tmpStr, k -> new ArrayList<>());
                orderWords.get(tmpStr).add(str);
            }
            answers = new ArrayList<>(orderWords.values());
        }
        return answers;
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a", "b"};
        System.out.println(groupAnagrams(strs1));
        System.out.println(groupAnagrams(strs2));
        System.out.println(groupAnagrams(strs3));
    }
}

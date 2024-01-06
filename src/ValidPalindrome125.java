public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] chars = s.toCharArray();
        int lastP = s.length() - 1;
        for (int i = 0; i < s.length()/2; i++) {
            if (chars[i] != chars[lastP]) {
                return false;
            }
            lastP--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = " ";
        System.out.println(isPalindrome(s));
    }
}

package interview;

public class SubSequence_String {
    /**
     * Give two string s & t return true if  s is subsequence of t
     * s="ace" t="abcde" o/p=true while "aec" is not
     */
    public static boolean isSubsequent(String s, String t) {
        int left = 0;
        int right = 0;
        while (right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                if (left == s.length())
                    return true;
            }
            right++;
        }
       return  false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequent("ace", "abcde"));
        System.out.println(isSubsequent("ace", "abedc"));
        System.out.println(isSubsequent("ace", "aacde"));
    }
}


package arraystring;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, sl and s2, write code to check if s2 is a rotation of s1
 * using only one call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */
class _01_09_StringRotation {
    boolean rotated(String original, String result) {
        if (original.length() != result.length()) {
            return false;
        }
        if (original == "" && result == "") return true;
        for (int i = result.length() - 1; i > -1; --i) {
            if (result.charAt(i) == original.charAt(0)) {
                return isSubstring(original, result.substring(i, result.length()));
            }
        }
        return false;
    }

    // runtime: O(length of longer string)
    boolean isSubstring(String word1, String word2) {
        if (word1.equals(word2)) return true;
        String longer, shorter;
        if (word1.length() > word2.length()) {
            longer = word1;
            shorter = word2;
        } else {
            longer = word2;
            shorter = word1;
        }
        for (int i = 0 ; i < longer.length() - shorter.length(); ++i) {
            if (longer.substring(i, shorter.length() + i).equals(shorter)) {
                return true;
            }
        }
        return false;
    }

}

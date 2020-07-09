package arraystring;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 *
 * runtime: O(n)
 */
class _01_06_StringCompression {
    String compress(String s) {
        if (s == null || s.length() == 0) return s;
        char prev = s.charAt(0);
        int countRepetition = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(prev);
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == prev) {
                ++countRepetition;
            } else {
                builder.append(countRepetition);
                builder.append(s.charAt(i));
                prev = s.charAt(i);
                countRepetition = 1;
            }
        }
        builder.append(countRepetition);
        return s.length() > builder.toString().length() ? builder.toString() : s;
    }
}

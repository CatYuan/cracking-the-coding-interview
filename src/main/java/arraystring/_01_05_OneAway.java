package arraystring;

/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 * runTime: O(n)
 */
class _01_05_OneAway {
    boolean isOneAway(String a, String b) {

//          2 cases.
//          1) a.length == b.length --> replace a character, or no edits
//          2) the difference in length is 1 --> insert/remove a character

        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }
        int[] map = new int[128];
        int countDiff = 0;
        for (int i = 0; i < a.length(); ++i) {
            ++map[a.charAt(i)];
        }
        for (int i = 0; i < b.length(); ++i) {
            if (--map[b.charAt(i)] < 0) {
                ++countDiff;
            }
        }
        return countDiff == 0 || countDiff == 1;
    }

}

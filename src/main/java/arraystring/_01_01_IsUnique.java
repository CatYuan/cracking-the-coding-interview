package arraystring;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique {

    // runtime O(n)
    boolean isUnique(String str) {
        int map[] = new int[128];
        for (int i = 0; i < str.length(); ++i) {
            if (++map[str.charAt(i)] > 1) return false;
        }
        return true;
    }

}

package arraystring;

import java.util.HashMap;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */
class _01_02_CheckPermutation {
    boolean check(String a, String b) {
        if (a.length() != b.length()) return false;
        int map[] = new int[128];
        for (int i = 0; i < a.length(); ++i) {
            ++map[a.charAt(i)];
        }
        for (int i = 0; i < b.length(); ++i) {
            if (--map[b.charAt(i)] < 0) return false;
        }
        return true;
    }
}

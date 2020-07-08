package arraystring;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */
class _01_04_PalindromePermutation {
    boolean check(String s) {
        int length = s.length();
        int arr[] = new int[128];
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                --length;
                continue;
            }
            ++arr[s.charAt(i)];
            if (arr[s.charAt(i)]%2 != 0) {
                ++count;
            } else {
                --count;
            }
        }
        return length%2 == 0 ? count==0 : count==1;
    }
}

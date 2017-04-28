package stringarray;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by jelenadrzaic on 19/03/2017.
 */
public class PalindromePermutation {

    public static boolean isPalindromePermutation(char[] toCheck) {
        HashMap<Character, Boolean> lettersCount = new HashMap<>();
        for (char c : toCheck) {
            if (lettersCount.containsKey(c) && lettersCount.get(c)) {
                lettersCount.put(c, false);
            } else {
                lettersCount.put(c, true);
            }
        }
        boolean foundOdd = false;
        Set<Character> keys = lettersCount.keySet();
        for (Character key : keys) {
            if (!lettersCount.get(key)) continue;
            if (foundOdd) return false;
            foundOdd = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("aba".toCharArray()));
        System.out.println(isPalindromePermutation("abab".toCharArray()));
        System.out.println(isPalindromePermutation("aabaabaab".toCharArray()));
    }
}

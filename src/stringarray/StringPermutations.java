package stringarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by jelenadrzaic on 19/03/2017.
 */
public class StringPermutations {

    public static boolean checkIfPermutations(char[] first, char[] second) {
        if (first.length != second.length) return false;
        HashMap<Character, Integer> firstLetters = new HashMap<>();
        HashMap<Character, Integer> secondLetters = new HashMap<>();
        for (int i = 0; i < first.length; ++i) {
            if (firstLetters.containsKey(first[i])) {
                firstLetters.put(first[i], firstLetters.get(first[i]) + 1);
            } else {
                firstLetters.put(first[i], 1);
            }
            if (secondLetters.containsKey(second[i])) {
                secondLetters.put(second[i], secondLetters.get(second[i]) + 1);
            } else {
                secondLetters.put(second[i], 1);
            }
        }
        if (secondLetters.keySet().size() != firstLetters.keySet().size()) return false;
        Set<Character> keys = firstLetters.keySet();
        for (char key : keys) {
            if(!secondLetters.containsKey(key) || !(firstLetters.get(key).equals(secondLetters.get(key)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfPermutationsSorting(char[] first, char[] second) {
        if (first.length != second.length) return false;
        Arrays.sort(first);
        Arrays.sort(second);
        for (int i = 0; i < first.length; ++i) {
            if (first[i] != second[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPermutations(new char[]{'a', 'b', 'c'}, new char[]{'c', 'b', 'a'}));
        System.out.println(checkIfPermutationsSorting(new char[]{'a', 'b', 'c'}, new char[]{'c', 'b', 'a'}));
    }
}

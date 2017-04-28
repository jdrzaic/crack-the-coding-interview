package stringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by jelenadrzaic on 19/03/2017.
 */
public class UniqueElements {

    private static boolean checkUnique(String toCheck) {
        HashSet<Character> elems = new HashSet<>();
        for (char c : toCheck.toCharArray()) {
            if (elems.contains(c)) return false;
            elems.add(c);
        }
        return true;
    }

    private static boolean checkUniqueNoAdditional(String toCheck) {
        for (int i = 0; i < toCheck.length(); ++i) {
            for (int j = i + 1; j < toCheck.length(); ++j) {
                if (toCheck.charAt(i) == toCheck.charAt(j)) return false;
            }
        }
        return true;
    }

    private static boolean checkUniqueNoAdditional2(String toCheck) {
        char[] ar = toCheck.toCharArray();
        Arrays.sort(ar);
        toCheck = String.valueOf(ar);
        for (int i = 0; i < toCheck.length() - 1; ++i) {
            if (toCheck.charAt(i) == toCheck.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkUnique("aaaaaa"));
        System.out.println(checkUnique("abcde"));
        System.out.println(checkUniqueNoAdditional2("aaaaaa"));
        System.out.println(checkUniqueNoAdditional2("abcde"));
    }
}

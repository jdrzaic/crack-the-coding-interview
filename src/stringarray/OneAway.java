package stringarray;

/**
 * Created by jelenadrzaic on 19/03/2017.
 */
public class OneAway {

    private boolean check(char[] first, char[] second) {
        if (first.length > second.length || first.length < second.length - 1) return false;
        int i = 0;
        while (first[i] == second[i]) {
            ++i;
            if (i == second.length) break;
        }
        if (first.length < second.length) {
            ++i;
        }
        ++i;
        while(first[i - 1] == second[i]) {
            ++i;
            if (i == second.length) break;
        }
        return i == second.length;
    }

    private boolean isOneAway(char[] first, char[] second) {
        return check(first, second) || check(second, first);
    }

    public static void main(String[] args) {

    }
}

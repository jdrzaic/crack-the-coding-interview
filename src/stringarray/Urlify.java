package stringarray;

/**
 * Created by jelenadrzaic on 19/03/2017.
 */
public class Urlify {

    private static char[] urlify(char[] toChange, int realLen) {
        for (int i = realLen - 1; i >= 0; --i) {
            if (i > realLen + 1) continue;
            if (toChange[i] == ' ') {
                for (int j = toChange.length - 3; j > i; --j) {
                    toChange[j + 2] = toChange[j];
                }
                toChange[i] = '%';
                toChange[i + 1] = '2';
                toChange[i + 2] = '0';
            }
        }
        return toChange;
    }

    public static void main(String[] args) {
        System.out.println(urlify("maja majic je pametna      ".toCharArray(), 21));
    }
}

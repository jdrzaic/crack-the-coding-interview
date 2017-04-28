package stringarray;

/**
 * Created by jelenadrzaic on 28/04/2017.
 */
public class StringComperhension {

    public static String compressString(String toCompress) {
        if (!isCompressable(toCompress)) return toCompress;
        StringBuilder compressed = new StringBuilder();
        int toCompressLength = toCompress.length();
        int consecutiveCount = 1;
        for (int i = 1;  i < toCompressLength; ++i) {
            if(toCompress.charAt(i) == toCompress.charAt(i - 1)) ++consecutiveCount;
            else {
                compressed.append(toCompress.charAt(i - 1));
                compressed.append(String.valueOf(consecutiveCount));
                consecutiveCount = 1;
            }
            if (i == toCompressLength - 1) {
                compressed.append(toCompress.charAt(i));
                compressed.append(String.valueOf(consecutiveCount));
            }
        }
        return compressed.toString();

    }

    public static boolean isCompressable(String toCompress) {
        int toCompressLength = toCompress.length();
        int consecutiveCount = 1;
        for (int i = 1;  i < toCompressLength; ++i) {
            if(toCompress.charAt(i) == toCompress.charAt(i - 1)) ++consecutiveCount;
            else {
                if (String.valueOf(consecutiveCount).length() + 1 < consecutiveCount) return true;
                consecutiveCount = 1;
            }
            if (i == toCompressLength - 1) {
                if (String.valueOf(consecutiveCount).length() + 1 < consecutiveCount) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaabbbcccd"));
        System.out.println(compressString("aabcd"));
    }
}

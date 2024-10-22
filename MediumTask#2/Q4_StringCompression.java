public class Q4_StringCompression {
    public static String compress(char[] chars) {
        StringBuffer compreseed = new StringBuffer();
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                compreseed.append(chars[i]);
                if (count > 1) {
                    compreseed.append(count);
                }
                count = 1;
            }
        }
        return compreseed.toString();
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        String compressedString = compress(chars);

        System.out.println(compressedString);
    }
}

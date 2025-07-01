class Solution {
    public int compress(char[] chars) {
        int start = 0;
        int count = 0;
        int i = 0;
        for (i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                if (count == 0) {
                    chars[start++] = chars[i];
                } else {
                    String add = Integer.toString(count + 1);
                    chars[start++] = chars[i];
                    for (char t : add.toCharArray()) {
                        chars[start++] = t;
                    }
                }
                count = 0;
            }
        }

        if (count == 0) {
            chars[start++] = chars[i];
        } else {
            String add = Integer.toString(count + 1);
            chars[start++] = chars[i];
            for (char t : add.toCharArray()) {
                chars[start++] = t;
            }
        }
        return start;
    }
}
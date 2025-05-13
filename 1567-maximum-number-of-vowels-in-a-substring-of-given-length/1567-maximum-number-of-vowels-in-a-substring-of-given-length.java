class Solution {
    public int maxVowels(String s, int k) {
        int max = 0, count = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                count++;
            if (i>=k && isVowel(s.charAt(i-k))) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else
            return false;
    }
}
class CanConstruct {
    public static void main(String[] args) {
        CanConstruct obj = new CanConstruct();
        String s = "leetcode";
        int k = 3;
        System.out.println(obj.canConstruct(s, k));
    }
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        // If the string length is less than k, it's impossible to create k substrings.
        if (n < k) {
            return false;
        }

        // If the string length equals k, each character can form its own palindrome.
        if (n == k) {
            return true;
        }

        // Frequency array for characters 'a' to 'z'.
        int[] vec = new int[26];
        for (char ch : s.toCharArray()) {
            vec[ch - 'a']++;
        }

        // Count characters with odd frequencies.
        int oddFreqCharCount = 0;
        for (int i = 0; i < 26; i++) {
            if (vec[i] % 2 != 0) {
                oddFreqCharCount++;
            }
        }

        // To form k palindromes, odd frequency characters must not exceed k.
        return oddFreqCharCount <= k;
    }
}

package Day1;

public class LongestsubstringWithAtleastKRepeat {
    //Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k.
    //
    //if no such substring exists, return 0.
    //
    public int longestSubstring(String s, int k) {
        if (k == 1)
            return s.length();
        int res = 0;
        for (int uniqueLettersTarget = 1; uniqueLettersTarget <= 26; uniqueLettersTarget++) {
            int len = longestSubstring(s, k, uniqueLettersTarget);
            res = Math.max(res, len);
        }
        return res;
    }
    private int longestSubstring(String s, int k, int uniqueLettersTarget) {
        final int N = s.length();
        int[] counts = new int[26];
        int uniqueLetters = 0;
        int repeatKLetters = 0; // Counts how many letters repeat >= k times in the window.
        int windowSize = 0;
        int start = 0, end = 0;
        while (end < N) {
            int endChar = s.charAt(end) - 'a';
            end++;
            counts[endChar]++;
            if (counts[endChar] == 1) {
                uniqueLetters++;
            }
            if (counts[endChar] == k) {
                repeatKLetters++;
            }
            while (uniqueLetters > uniqueLettersTarget) {  // while
                int startChar = s.charAt(start) - 'a';
                start++;
                if (counts[startChar] == 1) {
                    uniqueLetters--;
                }
                if (counts[startChar] == k) {
                    repeatKLetters--;
                }
                counts[startChar]--;
            }
            // If unique letters number == uniqueLettersTarget, and all the letters in the window are repeated at least K times,
            // then update max window size.
            if (uniqueLetters == uniqueLettersTarget && uniqueLetters == repeatKLetters) {
                windowSize = Math.max(windowSize, end - start);
            }
        }
        return windowSize;
    }
}


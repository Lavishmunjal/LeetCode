// Source: https://leetcode.com/problems/count-different-palindromic-subsequences/
import java.util.*;
// public class CountPalindromicSubsequence {
//     public static void main(String[] args) {
//         CountPalindromicSubsequence obj = new CountPalindromicSubsequence();
//         String s = "aabca";
//         System.out.println(obj.countPalindromicSubsequence(s));
//     }
//     public static int countPalindromicSubsequence(String s) {
//         int n = s.length();
//         Set<Character> uniqueLetters = new HashSet<>();
//         for(char letters:s.toCharArray()){
//             uniqueLetters.add(letters);
//         }
//         int result =0;
//         for(char letter:uniqueLetters){
//             int firstIndex =-1, lastindex=-1;
//             for(int i=0; i<n; i++){
//                 if(s.charAt(i)==letter){
//                     if(firstIndex==-1){
//                         firstIndex=i;
//                     }
//                     lastindex=i;
//                 }
                
//             }
//             Set<Character> set = new HashSet<>();
//             for(int middle = firstIndex+1; middle<=lastindex-1; middle++){
//                 set.add(s.charAt(middle));
//             }
//             result+=set.size();
//         }
//         return result;
//     }
// }

// approach 2
// Source: https://leetcode.com/problems/count-different-palindromic-subsequences/
 class CountPalindromicSubsequence {
    public static void main(String[] args) {
        // CountPalindromicSubsequence obj = new CountPalindromicSubsequence();
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }
    public static int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        
        for (int i = 0; i < n; i++) {
            int curr = s.charAt(i) - 'a';
            if (first[curr] == - 1) {
                first[curr] = i;
            }
            
            last[curr] = i;
        }
        
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (first[i] == -1) {
                continue;
            }
            
            Set<Character> st = new HashSet<>();
            for (int middle = first[i] + 1; middle < last[i]; middle++) {
                st.add(s.charAt(middle));
            }
            
            ans += st.size();
        }
        
        return ans;
    }

 }
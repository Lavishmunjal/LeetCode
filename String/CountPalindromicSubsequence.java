// Source: https://leetcode.com/problems/count-different-palindromic-subsequences/
import java.util.*;
public class CountPalindromicSubsequence {
    public static void main(String[] args) {
        CountPalindromicSubsequence obj = new CountPalindromicSubsequence();
        String s = "aabca";
        System.out.println(obj.countPalindromicSubsequence(s));
    }
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<Character> uniqueLetters = new HashSet<>();
        for(char letters:s.toCharArray()){
            uniqueLetters.add(letters);
        }
        int result =0;
        for(char letter:uniqueLetters){
            int firstIndex =-1, lastindex=-1;
            for(int i=0; i<n; i++){
                if(s.charAt(i)==letter){
                    if(firstIndex==-1){
                        firstIndex=i;
                    }
                    lastindex=i;
                }
                
            }
            Set<Character> set = new HashSet<>();
            for(int middle = firstIndex+1; middle<=lastindex-1; middle++){
                set.add(s.charAt(middle));
            }
            result+=set.size();
        }
        return result;
    }
}
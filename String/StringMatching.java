//source: https://leetcode.com/problems/string-matching-in-an-array/
import java.util.*;

class StringMatching {
    public static void main(String[] args) {
        StringMatching obj = new StringMatching();
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(obj.stringMatching(words));
    }
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i==j) continue;
                if(words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}

// Time Complexity: O(n^2*max(m,n)) where n is the number of words and m is the length of the longest word)

//approach 2
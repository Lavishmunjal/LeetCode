class MinimumLength {
    public static void main(String[] args) {
        MinimumLength obj = new MinimumLength();
        String s = "aabccabba";
        System.out.println(obj.minimumLength(s));
    }
    public int minimumLength(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int deleted =0;
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'a']+=1;

            
        }
        int result =0;
        for(int i=0; i<26; i++){
            if(freq[i]==0) continue;
            if(freq[i]%2!=0) result+=1;
            else result+=2;
        }
        
        
        return result;
    }
}
//approach 2

class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int deleted =0;
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'a']+=1;

            if(freq[s.charAt(i)-'a'] == 3){
                freq[s.charAt(i)-'a'] -=2;
                deleted+=2;
            }
        }
        
        
        return n-deleted;
    }
}
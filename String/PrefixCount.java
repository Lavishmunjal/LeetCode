public class PrefixCount {

    public static void main(String[] args) {
        String[] words = {"hello", "hell", "he", "h"};
        String pref = "he";
        System.out.println(prefixCount(words, pref));
    }
    public static int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;

    }
    
}

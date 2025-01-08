class CountPrefixSuffixPairs {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                String str1 = words[i];
                String str2 = words[j];
                if(str1.length()> str2.length()) continue;
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    ++count;
                }
            }
        }
        return count;
    }
}
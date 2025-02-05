public class AreAlmostEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int n1=s1.length();
        int n2 = s2.length();
        int i=0,count=0;
        int first=-1, second=-1;
        if(s1.equals(s2)) return true;
        while(i<n1) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1!=ch2) {
                count++;
                if(count==1) {
                    first =i;
                }else if(count==2){
                    second=i;
                }else {
                    return false;
                }
                
            }
            i++;
        }
        
        return count == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
    }
}

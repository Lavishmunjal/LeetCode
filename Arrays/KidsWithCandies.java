import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++) {
            if(candies[i]>max) {
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++) {
            if((candies[i]+extraCandies)<max) {
                ls.add(false);
            }else {
                ls.add(true);
            }
        }
        return ls;
    }
    
}

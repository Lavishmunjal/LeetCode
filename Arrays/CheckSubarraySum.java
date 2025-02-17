import java.util.HashMap;
import java.util.Map;

public class CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            
            int remainder = sum % k;
            
            if (remainder < 0) {
                remainder += k; // To handle negative remainders correctly
            }
            
            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        
        return false;
    }
}

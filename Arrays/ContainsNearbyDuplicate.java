import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(mpp.containsKey(nums[i]) && i-mpp.get(nums[i])<=k) {
                return true;
            }
            mpp.put(nums[i], i);
        }
        return false;

    }
}

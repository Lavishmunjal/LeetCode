public class MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int currsum =nums[0];
        int maxisum =0;
        int n = nums.length;
        for(int i=1; i<n; i++) {
            if(nums[i]>nums[i-1]) {
                currsum+=nums[i];
            }
            else {
                maxisum = Math.max(currsum, maxisum);
                currsum = nums[i];
            }
            
            
        }
        return Math.max(maxisum, currsum);
    }
}

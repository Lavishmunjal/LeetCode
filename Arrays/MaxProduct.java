public class MaxProduct {
    public int maxProduct(int[] nums) {
        int largest =0;
        int sec_largest=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest)  {
                sec_largest = largest;
                largest = nums[i];
            }
            else {
                sec_largest = Math.max(sec_largest, nums[i]);
            }
        }
        return (largest-1)*(sec_largest-1);
    }
}

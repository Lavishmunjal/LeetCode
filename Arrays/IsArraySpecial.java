public class IsArraySpecial {
    public boolean isArraySpecial(int[] nums) {
        int n= nums.length;
        if(n==1) return true;
        int i=0;
        while(i<n-1){
            if(nums[i]%2==0) {
                if(nums[i+1]%2!=0) {
                    i++;
                }else {
                    return false;
                }
            }
            else {
                if(nums[i+1]%2==0) {
                    i++;
                }else return false;
            }
        }
        return true;
    }

}

// Approach 2
public boolean isArraySpecial(int[] nums) {
    int n= nums.length;
    for(int i=0; i<n-1; i++){
        if(nums[i]%2 == nums[i+1]%2) {
            return false;
        }
    }}


// Approach 3 by bitwise 
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n= nums.length;
        for(int i=0; i<n-1; i++){
            if((nums[i]&1) == (nums[i+1]&1)) return false;
        }
        return true;
    }
}

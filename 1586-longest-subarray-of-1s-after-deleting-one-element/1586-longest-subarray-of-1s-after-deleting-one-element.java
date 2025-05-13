class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,right=0,zero=0,one=0,max=0;
        while(right<nums.length) {
            if(nums[right]==1)
            one++;
            if(nums[right]==0)
            zero++;
            if(zero>1) {
                if(nums[left]==0)
                zero--;
                else if(nums[left]==1)
                one--;
                left++;
            }
            max=Math.max(max,one);
            right++;
        }
        return zero==0?max-1:max;
    }
}
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int c=0,zero=0,sum=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<0 && k>0) {
                nums[i]=-nums[i]; k--;
            }
            min=Math.min(min,nums[i]);
            sum+=nums[i];
        }
        if(k%2!=0)
        sum -= 2*min;

        return sum;
    }
}
        
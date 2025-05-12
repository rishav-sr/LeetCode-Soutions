class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = 0;
        double temp = 0.0, max = Double.NEGATIVE_INFINITY;
        while (r < nums.length) {
                temp += nums[r];
            if(r-l+1==k) {
                max = Math.max(max, temp / (double) k);
                temp = temp - nums[l];
                l++;
            }
            r++;
        }
        return max;
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int left[]= new int[nums.length];
        int right[]= new int[nums.length];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++) {
            a+=nums[i];
            left[i]=a;
            b+=nums[nums.length-i-1];
            right[nums.length-i-1]=b;
        }
        for(int i=0;i<nums.length;i++) {
            if(left[i]==right[i])
            return i;
        }
        return -1;
    }
}
//[1,7,3,6,5,6]
//[1,8,11,17,22,28]
//[28,27,20,17,11,6]

//2,1,-1
//0,2,3
//0,-1,0
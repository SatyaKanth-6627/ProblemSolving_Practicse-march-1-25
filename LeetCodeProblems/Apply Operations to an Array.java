// Problem Link
// https://leetcode.com/problems/apply-operations-to-an-array/description/

// Source Code
class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0;i < n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }


        int i = 0, j = 0;
        for(i = 0;i < n;i++){
            if(nums[i] != 0){
                res[j++] = nums[i];
            }
        }
        while(j < n){
            res[j++] = 0;
        }

        return res;
        
    }
}
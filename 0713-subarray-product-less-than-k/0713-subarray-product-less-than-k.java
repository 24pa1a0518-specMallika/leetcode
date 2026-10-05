class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int temp=1;
        int n=nums.length;
        int ans=0;
        if(k<=1){
            return 0;
        }
        for(int r=0;r<n;r++){
            temp*=nums[r];
            while(temp>=k&&l<=r){
                temp/=nums[l];
                l++;
            }
            ans+=(r-l+1);
        }
        return ans;
    }
}
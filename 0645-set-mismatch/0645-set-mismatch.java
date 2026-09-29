class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int dup=-1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(!hs.contains(val)){
                hs.add(val);
            }else{
                dup=val;
            }
        }
        int n=nums.length;
        int m=-1;
        for(int i=0;i<=n;i++){
            if(!hs.contains(i)){
                m=i;
            }
        }
        int[] ans={dup,m};
        return ans;
    }
}
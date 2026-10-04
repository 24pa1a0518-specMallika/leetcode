class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total=0;
        for(int i=cost.length-1;i>=0;i--){
            int pos=(cost.length-1)-i+1;
            if(pos%3==0){
                continue;
            }
            total+=cost[i];
        }
        return total;
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uq=new HashSet<>();
        for(int c : candyType){
            uq.add(c);
        }
        int n=candyType.length/2;
        return Math.min(uq.size(),n);
    }
}
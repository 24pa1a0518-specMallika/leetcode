class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int rm=-1;
        for(int i=n-1;i>=0;i--){
            int prev=arr[i];
            arr[i]=rm;
            rm=Math.max(prev,rm);
        }
        return arr;
    }
}
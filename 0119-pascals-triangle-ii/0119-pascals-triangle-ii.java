class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> fs=new ArrayList<>();
        fs.add(1);
        ans.add(fs);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> fr=new ArrayList<>();
            fr.add(1);
            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                fr.add(val);
            }
            fr.add(1);
            ans.add(fr);
        }
        return ans.get(rowIndex);
    }
}
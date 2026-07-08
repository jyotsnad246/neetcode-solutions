class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] freq=new int[26];
        Arrays.fill(freq,-1);
        int ans=-1;
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(freq[index]==-1) freq[index]=i;
            else ans=Math.max(ans, i-freq[index]-1);
        }
        return ans;
    }
}
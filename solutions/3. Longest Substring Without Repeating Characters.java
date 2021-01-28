class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> allah = new HashMap<Character,Integer>();
        int pointer = 0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(allah.containsKey(s.charAt(i))){
                pointer = Math.max(pointer,allah.get(s.charAt(i))+1);
            }
            allah.put(s.charAt(i),i);
            max = Math.max(max,(i-pointer)+1);
        }
        return max;
    }
}

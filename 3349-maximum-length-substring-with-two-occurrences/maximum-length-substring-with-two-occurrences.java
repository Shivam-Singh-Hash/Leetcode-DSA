class Solution {
    public int maximumLengthSubstring(String s) {
        int size = s.length();
        int j=0;
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch)>2){
                char left = s.charAt(j);
                 map.put(left, map.get(left) - 1);
                j++;
            } 
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
    
}
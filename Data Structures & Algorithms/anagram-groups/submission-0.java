class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> fin = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            fin.putIfAbsent(key, new ArrayList<>());
            fin.get(key).add(s);
        }

        return new ArrayList<>(fin.values());
    }
}

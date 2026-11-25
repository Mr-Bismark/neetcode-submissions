class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sC = s.toLowerCase().toCharArray();
        char[] tC = t.toLowerCase().toCharArray();

        Arrays.sort(sC);
        Arrays.sort(tC);

        return Arrays.equals(sC, tC);
    }
}

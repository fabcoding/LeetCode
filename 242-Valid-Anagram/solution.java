public class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> exists = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            exists.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (exists.isEmpty()) {
                return false;
            }
            if (exists.contains(c)) {
                exists.remove(Character.valueOf(c));
            }
        }
        return exists.isEmpty();
    }
}
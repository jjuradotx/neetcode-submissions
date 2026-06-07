class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> firstWord = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            firstWord.put(current, firstWord.getOrDefault(current, 0) + 1);
        }
        

        for (int j = 0; j < t.length(); j++) {
            char current = t.charAt(j);
            if (!firstWord.containsKey(current)) { return false; }

            int count = firstWord.get(current) - 1;
            if (count <= 0) { firstWord.remove(current); }
            else { firstWord.put(current, count); }
           
        }

        if (firstWord.size() !=0 ) { return false; }
        
        return true;

    }
}

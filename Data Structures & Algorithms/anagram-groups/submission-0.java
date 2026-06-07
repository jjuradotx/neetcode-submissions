class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<Map<Character, Integer>, List<String>> wordMap = new HashMap<>();

        for(String word : strs) {
            String current = word;

            Map<Character, Integer> freq = new HashMap<>();

            for(int i = 0; i < current.length(); i++) {
                freq.put(current.charAt(i), freq.getOrDefault(current.charAt(i), 0) + 1);
            }

            wordMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(word);

        }

        for (Map<Character, Integer> key : wordMap.keySet()) {
            List<String> words = wordMap.get(key);
            result.add(words);
        }

        return result;
    }
}

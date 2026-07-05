class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       HashMap<String, List<String>> group = new HashMap<>();

       for(String str: strs){
        char[] words = str.toCharArray();
        Arrays.sort(words);

        String key = new String(words);

        if(!group.containsKey(key)){
            group.put(key, new ArrayList<>());
        }
        group.get(key).add(str);


       }  

       return new ArrayList<>(group.values());
        
    }
}

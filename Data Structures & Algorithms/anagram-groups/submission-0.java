class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> mapa = new HashMap<>();

        for(String str: strs){
            int[] brojacPojavljivanjaKaraktera = new int[26];

            for(char c:str.toCharArray()){
                brojacPojavljivanjaKaraktera[c-'a']++;
            }

            String potpis = Arrays.toString(brojacPojavljivanjaKaraktera);

            if (!mapa.containsKey(potpis)) {
                mapa.put(potpis, new ArrayList<>());
            }

            mapa.get(potpis).add(str);
        }

        return new ArrayList<>(mapa.values());
    }
}

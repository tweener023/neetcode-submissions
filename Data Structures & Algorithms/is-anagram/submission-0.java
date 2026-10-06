class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapaS = new HashMap<>();
        Map<Character, Integer> mapaT = new HashMap<>();

        for(char c: s.toCharArray()){
            if(mapaS.containsKey(c)){
                Integer trenutno = mapaS.get(c);
                mapaS.put(c, trenutno+1);
            }else{
                mapaS.put(c,1);
            }
        }
        for(char c: t.toCharArray()){
            if(mapaT.containsKey(c)){
                Integer trenutno = mapaT.get(c);
                mapaT.put(c, trenutno+1);
            }else{
                mapaT.put(c,1);
            }
        }

        if(mapaT.equals(mapaS)){
            return true;
        }
        else {
            return false;
        }
    }
}

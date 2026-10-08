class Solution {

    public String encode(List<String> strs) {
        StringBuilder buildString = new StringBuilder();
        
        // 6#string2#je9#enkodiran
        // 5#nisam2#se3#sam5#setio4#ovog
        for (String str : strs) {
            buildString.append(str.length()).append("#").append(str);
        }

        return buildString.toString();
    }

    public List<String> decode(String str) {

        List<String> strList = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;

            String word = str.substring(start, start + length);
            strList.add(word);

            i = start + length;
        }

        return strList;
    }
}

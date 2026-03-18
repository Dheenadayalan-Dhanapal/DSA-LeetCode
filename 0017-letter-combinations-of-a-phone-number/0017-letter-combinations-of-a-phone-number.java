class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        LetterCombinations(map, 0, digits, result, new StringBuilder());
        return result;
    }
    public void LetterCombinations(String[] map, int idx, String digits, List<String> result, StringBuilder sb){
        if(idx == digits.length()){
            result.add(sb.toString());
            return;
        }
        char[] ch = map[digits.charAt(idx) - '0'].toCharArray();
        for(int i = 0; i < ch.length; i++){ // i refers to characters
            // Include
            sb.append(ch[i]);
            // Backtracking
            LetterCombinations(map, idx + 1, digits, result, sb); // idx refers to digits
            // Exclude
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
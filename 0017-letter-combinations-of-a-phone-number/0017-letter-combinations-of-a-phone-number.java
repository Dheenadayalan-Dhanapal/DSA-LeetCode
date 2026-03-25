class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        Backtracking(digits, 0, map, res, new StringBuilder());
        return res;
    }
    private void Backtracking(String digits, int idx, String[] map, List<String> res, StringBuilder sb){
        if(sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }
        char[] ch = map[digits.charAt(idx) - '0'].toCharArray();
        for(int i = 0; i < ch.length; i++){
            sb.append(ch[i]);
            Backtracking(digits, idx + 1, map, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
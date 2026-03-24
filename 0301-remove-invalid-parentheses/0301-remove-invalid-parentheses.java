class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int leftRem = 0; 
        int rightRem = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                leftRem++;
            } else if(c == ')'){
                if(leftRem > 0) leftRem--;
                else rightRem++;
            }
        }
        Set<String> result = new HashSet<>();
        Backtracking(s, 0, 0, 0, leftRem, rightRem, new StringBuilder(), result);
        return new ArrayList<>(result);
    }
    private void Backtracking(String s, int idx, int leftCount, int rightCount, int leftRem, int rightRem, StringBuilder sb, Set<String> result){
        // Base Case
        if(idx == s.length()){
            if(leftRem == 0 && rightRem == 0){
                result.add(sb.toString());
            }
            return;
        }

        char c = s.charAt(idx);
        // Skip
        if(c == '(' && leftRem > 0){
            Backtracking(s, idx + 1, leftCount, rightCount, leftRem - 1, rightRem, sb, result);
        } else if(c == ')' && rightRem > 0){
            Backtracking(s, idx + 1, leftCount, rightCount, leftRem, rightRem - 1, sb, result);
        }
        // Pick
        sb.append(c);
        if(c != '(' && c != ')'){
            Backtracking(s, idx + 1, leftCount, rightCount, leftRem, rightRem, sb, result);
        } else if(c == '('){
            Backtracking(s, idx + 1, leftCount + 1, rightCount, leftRem, rightRem, sb, result);
        } else if(c == ')' && (rightCount < leftCount)){
            Backtracking(s, idx + 1, leftCount, rightCount + 1, leftRem, rightRem, sb, result);
        }
        sb.setLength(sb.length() - 1);
    }
}
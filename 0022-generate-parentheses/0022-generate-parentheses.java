class Solution {
    // Three Conditions to Consider
    // Open && Close == N 
    // Open < N -> Add (Open)
    // Close < Open -> Add( Close)
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Backtracking(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    public void Backtracking(List<String> result, StringBuilder sb, int open, int close, int n){
        if(sb.length() == n * 2){
            result.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append("(");
            Backtracking(result, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open){
            sb.append(")");
            Backtracking(result, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
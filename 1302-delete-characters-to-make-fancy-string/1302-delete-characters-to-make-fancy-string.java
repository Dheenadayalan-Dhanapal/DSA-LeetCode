class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        ans.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                if(count < 3){
                    ans.append(s.charAt(i));
                }
            }
            else{
                ans.append(s.charAt(i));
                count = 1;
            }
        }
        return ans.toString();
    }
}
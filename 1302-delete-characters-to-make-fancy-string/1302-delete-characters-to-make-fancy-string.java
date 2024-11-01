class Solution {
    public String makeFancyString(String s) {
        // char[] str = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int count = 1;
        // List<Character> chr = new ArrayList<Character>();
        // chr.add(str[0]);
        ans.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                if(count < 3){
                    // chr.add(str[i]);
                    ans.append(s.charAt(i));
                }
            }
            else{
                // chr.add(str[i]);
                ans.append(s.charAt(i));
                count = 1;
            }
        }
        return ans.toString();
    }
}
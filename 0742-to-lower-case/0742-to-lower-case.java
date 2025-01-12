class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            if(val >= 65 && val <= 90){
                str.append((char)(val + 32));
            } else {
                str.append((char)val);
            }
        }
        return str.toString();
    }
}
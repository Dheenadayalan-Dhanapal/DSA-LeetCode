class Solution {
    public String reverseWords(String s) {
        ArrayList<String> str = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            } else {
                if(sb.length() > 0){
                    str.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if(sb.length() > 0){
            str.add(sb.toString());
        }
        sb.setLength(0);
        for(int i = str.size() - 1; i >= 0; i--){
            sb.append(str.get(i));
            if(i > 0){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
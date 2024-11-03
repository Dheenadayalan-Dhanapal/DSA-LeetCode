class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        while(n > 0){
            char temp = s.charAt(s.length() - 1);
            s = temp + s;
            s = s.substring(0,s.length() - 1);
            if(s.equals(goal)){
                return true;
            }
            n--;
        }
        return false;
    }
}
class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char i : arr){
            Character c = new Character(i);
            if(c.equals('(') || c.equals('{') || c.equals('[')){
                st.push(c);
            } else {
                Character t = null;
                if(!st.isEmpty()){
                    t = new Character(st.peek());
                }
                if(st.isEmpty()){
                    return false;
                }
                if(c.equals(')') && t.equals('(')){
                    st.pop();
                } else if(c.equals('}') && t.equals('{')){
                    st.pop();
                } else if(c.equals(']') && t.equals('[')){
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
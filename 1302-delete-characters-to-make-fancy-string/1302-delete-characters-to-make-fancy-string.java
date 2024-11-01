class Solution {
    public String makeFancyString(String s) {
        char[] str = s.toCharArray();
        int count = 1;
        List<Character> chr = new ArrayList<Character>();
        chr.add(str[0]);
        for(int i = 1; i < str.length; i++){
            if(str[i] == str[i-1]){
                count++;
                if(count < 3){
                    chr.add(str[i]);
                }
            }
            else{
                chr.add(str[i]);
                count = 1;
            }
        }
        s = chr.stream().map(String::valueOf).collect(Collectors.joining());
        // for(char ch : chr){
        //     s += ch;
        // }
        return s;
    }
}
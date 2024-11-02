class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split(" ");
        int count = 0;
        for(int i = 1; i < str.length; i++){
            String x1 = str[i-1];
            String x2 = str[i];
            int n1 = x1.length();
            int n2 = x2.length();
            if(x1.charAt(n1-1) == x2.charAt(0)){
                count++;
            }
        }
        String lastWord = str[str.length - 1];
        String firstWord = str[0];
        int n = lastWord.length();
        if(firstWord.charAt(0) == lastWord.charAt(n - 1)){
            count++;
        }
        if(str.length == count){
            return true;
        }
        else{
            return false;
        }
    }
}
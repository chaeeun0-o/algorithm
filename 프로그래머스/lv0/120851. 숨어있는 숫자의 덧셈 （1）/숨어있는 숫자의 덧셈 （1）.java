class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String replace = my_string.toLowerCase().replaceAll("[^0-9]","");
        
        String[] arry = replace.split("");
        
        for(int i=0; i<arry.length; i++){
            answer += Integer.parseInt(arry[i]);
        }
        return answer;
    }
}
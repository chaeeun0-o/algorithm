class Solution {
    public String solution(int age) {
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'};
        String answer = "";
        String Str = Integer.toString(age);
        
     for (int i = 0; i < Str.length(); i++) {
            int abc = Str.charAt(i) - '0';
            answer += arr[abc];
    }
        return answer;
    }
}
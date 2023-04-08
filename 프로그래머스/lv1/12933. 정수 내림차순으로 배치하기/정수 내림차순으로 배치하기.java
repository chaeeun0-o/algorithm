import java.util.Collections;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        
        
        Integer arr[] = new Integer [s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
            }
       
        Arrays.sort(arr,Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i);
        }

        answer = Long.parseLong(sb.toString());
        
      
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++){
            String person = participant[i];
            map.put(person, map.getOrDefault(person, 0)+1);
        }
        
        for(int i=0; i<completion.length; i++) {
            String finish = completion[i];
            map.replace(finish, map.getOrDefault(finish, map.get(finish))-1);
        }
        
        for(String s : map.keySet()){
            if(map.get(s)==1) answer = s;
        }
        return answer;
    }
}
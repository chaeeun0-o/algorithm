import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String>list = new ArrayList<String>();
        
        String[] index = new String[strings.length];
        
        for(int i=0; i<strings.length; i++){
            index[i]=Character.toString(strings[i].charAt(n));
        }
        
        Arrays.sort(index);
        Arrays.sort(strings);
        
        for(int i =0; i<index.length; i++){
            for(int j =0; j<strings.length; j++){
                if(list.contains(strings[j])){
                    continue;
                }else{
                    if(index[i].charAt(0)==strings[j].charAt(n)){
                        list.add(strings[j]);
                        break;
                    }
                }
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
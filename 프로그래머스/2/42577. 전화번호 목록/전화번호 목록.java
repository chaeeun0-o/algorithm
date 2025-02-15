import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, String> map = new HashMap<>();
        
        for(String phone : phone_book) {
            map.put(phone, phone);
        }
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++) {
                String str = phone_book[i].substring(0, j);
                if(map.containsKey(str)) return false;
            }
        }
        return true;
    }
}
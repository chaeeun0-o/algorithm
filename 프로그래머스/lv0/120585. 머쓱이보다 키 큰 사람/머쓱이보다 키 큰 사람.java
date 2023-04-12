import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        
    for (int i = 0 ; i<array.length ; i++){
        int a = array[i];
        if(a > height){
            b.add(a);
        }
    }
     return b.size();   
    }
}
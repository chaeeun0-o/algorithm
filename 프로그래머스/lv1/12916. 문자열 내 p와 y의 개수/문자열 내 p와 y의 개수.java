class Solution {
    boolean solution(String s) {
        int p=0;
        int y=0;
        boolean answer = true;
        
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            
            if(a == 'p'){
                 p++;
            }
            else if(a =='y'){
                y++;
            }
        }
         if(p==y){
             answer = true;
         }else{
             answer = false;
         }

    

        return answer;
    }
}
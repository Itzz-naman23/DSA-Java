class Solution {
    public boolean isPalindrome(String s) {
      if(s.length()==0){
          return true;
      }
        int i =0,j = s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(!Character.isLetterOrDigit(c)){
                i++;
            }
            else if(!Character.isLetterOrDigit(d)){
                j--;
            }
            else{
                if(c != d){
                    return false;
                }
                i++;j--;
            }
        }
        return true;
        
    }
}
Rotate String problem:
Approch: concatanate the string s with again string s and check whether the  goal string contains it.
  class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length()==goal.length()&&(s+s).contains(goal));
        
    }
}

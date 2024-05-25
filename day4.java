Rotate String problem:
Approch: concatanate the string s with again string s and check whether the  goal string contains it.
  class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length()==goal.length()&&(s+s).contains(goal));
        
    }
}
//the anagrams string problem:
Approch:
Anagrams:Which strings can be equal after rearranging the characters
1.convert them into the character array.
2.sort the arrays
3.check whether the arrays are equal or not
  class Solution {
    public boolean isAnagram(String s, String t) {
            // Your code here
       char []ch1=s.toCharArray();
       char []ch2=t.toCharArray();
       if(s.length()==t.length()){
           Arrays.sort(ch1);
           Arrays.sort(ch2);
           if(Arrays.equals(ch1,ch2))
           {
               return true;
           }
       }
       return false;
    }
}

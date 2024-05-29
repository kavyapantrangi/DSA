Permutation Difference between:
class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer>map=new HashMap<>();
        Map<Character,Integer>map1=new HashMap<>();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),i);
            map1.put(t.charAt(i),i);
        }
        for(char c:map.keySet())
        {
            sum+=Math.abs(map.get(c)-map1.get(c));
        }
        return sum;
    }
}
//Jewels and stones:https://leetcode.com/problems/jewels-and-stones/
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>je=new HashSet<>();
        for(int i=0;i<jewels.length();i++)
        {
            je.add(jewels.charAt(i));
        }
        int c=0;
        for(int i=0;i<stones.length();i++)
        {
            if(je.contains(stones.charAt(i)))
            c++;
        }
        return c;
        
    }
}

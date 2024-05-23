2.Rotation of Array by k elements
  Approach:
1.reverse the first n-k elememnts
2.Reverse the last k elements
3.reverse the whole array
first we have to check the value of k ,if k value is greater than n there might me a failure of the testcase.
  k=k%n;
Code:
     class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
      
       rotattion(nums,0,n-k-1);
       rotattion(nums,n-k,n-1);
       rotattion(nums,0,n-1);
        
        
}
public static void rotattion(int []arr,int s,int e)
{
    while(s<=e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
}
}

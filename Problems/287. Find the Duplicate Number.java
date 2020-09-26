// This is, Floyd's Tortoise and hair problem 
// It basically detects cycle in the list.
// Now you may think, where is the cycle in here.. 
// since we know numbers are from 1-n and one number is duplicated multiple times, in array of size n+1
// so we use number and use same number as index to get another number.. we will find a loop if there is any duplicate number.
// so basically it is a problem where we find start point of cycle in linked list
// Time Complexity: O(n) & Space Complexity: O(1)


class Solution {
  public int findDuplicate(int[] nums) {
    // Find the intersection point of the two runners.
    int tortoise = nums[0];
    int hare = nums[0];
    do {
      tortoise = nums[tortoise];
      hare = nums[nums[hare]];
    } while (tortoise != hare);

    // Find the "entrance" to the cycle.
    tortoise = nums[0];
    while (tortoise != hare) {
      tortoise = nums[tortoise];
      hare = nums[hare];
    }

    return hare;
  }
}

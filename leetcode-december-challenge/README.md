# leetcode-december-challenge

[leetcode-december](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/)  
This repo contains solution to the problems in LeetCode December Challenge.

## About the challenge

This Challenge is beginner-friendly and available to both Premium and non-Premium users. It consists of 31 daily problems over the month of December. A problem is added here each day, and you have 24 hours to make a valid submission for it in order to be eligible for rewards.

## Day 1

* Problem [Maximum Depth of Binary Tree](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3551/)
* Given the root of a binary tree, return its maximum depth.
* A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
* Solution [link](SolutionDay1.java)
* Example 1:

![day1](https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg)

```text
Input: root = [3,9,20,null,null,15,7]
Output: 3
```

* Example 2:

```text
Input: root = [1,null,2]
Output: 2
```

* Constraints:  
  * The number of nodes in the tree is in the range [0, 10<sup>4</sup>].
  * -100 <= Node.val <= 100

## Day 2

* Problem [Linked List Random Node](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3552/)
* Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
* Solution [link](SolutionDay2.java)
* Example:

```text
// Init a singly linked list [1,2,3].?
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
solution.getRandom();
```

## Day 3

* Problem [Increasing Order Search Tree](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3553/)
* Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
* Solution [link](SolutionDay3.java)
* Example 1:  

![day3_0](https://assets.leetcode.com/uploads/2020/11/17/ex1.jpg)

```text
Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
```

* Example 2:

![day3_1](https://assets.leetcode.com/uploads/2020/11/17/ex2.jpg)

```text
Input: root = [5,1,7]
Output: [1,null,5,null,7]
```

* Constraints:
  * The number of nodes in the given tree will be in the range [1, 100].
  * 0 <= Node.val <= 1000

## Day 4

* Problem [The kth Factor of n](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3554/)
* Given two positive integers n and k.
* A factor of an integer n is defined as an integer i where n % i == 0.
* Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
* Solution [link](SolutionDay4.java)
* Example 1:

```text
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
```

* Example 2:

```text
Input: n = 7, k = 2
Output: 7
Explanation: Factors list is [1, 7], the 2nd factor is 7.
```

* Example 3:

```text
Input: n = 4, k = 4
Output: -1
Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
```

* Constraints:
  * 1 <= k <= n <= 1000

## Day 5

* Problem [Can Place Flowers](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3554/)
* You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
* Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
* Solution [link](SolutionDay5.java)
* Example 1:

```text
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
```

* Example 2:

```text
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
```

* Constraints:
  * 1 <= flowerbed.length <= 2 * 10<sup>4</sup>
  * flowerbed[i] is 0 or 1.
  * There are no two adjacent flowers in flowerbed.
  * 0 <= n <= flowerbed.length

## Day 6

* Problem [Populating Next Right Pointers in Each Node II](https://leetcode.com/explore/featured/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3556/)
* Given a binary tree

```c
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

* Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
* Initially, all next pointers are set to NULL.
* Solution [link](SolutionDay6.java)
* Example 1:

![day6_0](https://assets.leetcode.com/uploads/2019/02/15/117_sample.png)

```text
Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
```

* Constraints:
  * The number of nodes in the given tree is less than 6000.
  * -100 <= node.val <= 100

## Day 7

* Problem [Spiral Matrix II](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3557/)
* Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
* Solution [link](SolutionDay7.java)
* Example 1:

![day7](https://assets.leetcode.com/uploads/2020/11/13/spiraln.jpg)

```text
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
```

* Example 2:

```text
Input: n = 1
Output: [[1]]
 ```

* Constraints:
  * 1 <= n <= 20

## Day 8

* Problem [Pairs of Songs With Total Durations Divisible by 60](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3559/)
* You are given a list of songs where the ith song has a duration of time[i] seconds.
* Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
* Solution [link](SolutionDay8.java)
* Example 1:

```text
Input: time = [30,20,150,100,40]
Output: 3
Explanation: Three pairs have a total duration divisible by 60:
(time[0] = 30, time[2] = 150): total duration 180
(time[1] = 20, time[3] = 100): total duration 120
(time[1] = 20, time[4] = 40): total duration 60
```

* Example 2:

```text
Input: time = [60,60,60]
Output: 3
Explanation: All three pairs have a total duration of 120, which is divisible by 60.
```

* Constraints:
  * 1 <= time.length <= 6 * 10<sup>4</sup>
  * 1 <= time[i] <= 500

## Day 9

* Problem [Binary Search Tree Iterator](https://leetcode.com/explore/featured/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3560/)
* Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):
  * BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
  * boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
  * int next() Moves the pointer to the right, then returns the number at the pointer.
* Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.
* You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.
* Solution [link](SolutionDay9.java)
* Example 1:

![day9](https://assets.leetcode.com/uploads/2018/12/25/bst-tree.png)

```text
Input
["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
Output
[null, 3, 7, true, 9, true, 15, true, 20, false]

Explanation
BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
bSTIterator.next();    // return 3
bSTIterator.next();    // return 7
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 9
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 15
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 20
bSTIterator.hasNext(); // return False
```

* Constraints:

  * The number of nodes in the tree is in the range [1, 105].
  * 0 <= Node.val <= 106
  * At most 105 calls will be made to hasNext, and next.

## Day 10

* Problem [Valid Mountain Array](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3561/)
* Given an array of integers arr, return true if and only if it is a valid mountain array.
* Recall that arr is a mountain array if and only if:
  * There exists some i with 0 < i < arr.length - 1 such that:
  * arr.length >= 3
    * arr[0] < arr[1] < ... < arr[i - 1] < A[i]
    * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
* Solution [link](SolutionDay10.java)

![day10_0](https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png)

* Example 1:

```text
Input: arr = [2,1]
Output: false
```

* Example 2:

```text
Input: arr = [3,5,5]
Output: false
```

* Example 3:

```text
Input: arr = [0,3,2,1]
Output: true
```

* Constraints:
  * 1 <= arr.length <= 10<sup>4</sup>
  * 0 <= arr[i] <= 10<sup>4</sup>

## Day 11

* Problem [Remove Duplicates from Sorted Array II](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3562/)
* Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
* Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
* Clarification:
* Confused why the returned value is an integer, but your answer is an array?
* Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller.  
Internally you can think of this:

```text
// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
```

* Solution [link](SolutionDay11.java)
* Example 1:

```text
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3]
Explanation: Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively. It doesn't matter what you leave beyond the returned length.
```

* Example 2:

```text
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3]
Explanation: Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively. It doesn't matter what values are set beyond the returned length.
```

* Constraints:
  * 0 <= nums.length <= 3 * 10<sup>4</sup>
  * -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
  * nums is sorted in ascending order.

## Day 12

* Problem [Smallest Subtree with all the Deepest Nodes](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3563/)
* Given the root of a binary tree, the depth of each node is the shortest distance to the root.
* Return the smallest subtree such that it contains all the deepest nodes in the original tree.
* A node is called the deepest if it has the largest depth possible among any node in the entire tree.
* The subtree of a node is tree consisting of that node, plus the set of all descendants of that node.  

Note: This question is the same as [1123:](https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/)
* Solution [link](SolutionDay12.java)
* Example 1:

![day12](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/01/sketch1.png)

```text
Input: root = [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation: We return the node with value 2, colored in yellow in the diagram.
The nodes coloured in blue are the deepest nodes of the tree.
Notice that nodes 5, 3 and 2 contain the deepest nodes in the tree but node 2 is the smallest subtree among them, so we return it.
```

* Example 2:

```text
Input: root = [1]
Output: [1]
Explanation: The root is the deepest node in the tree.
```

* Example 3:

```text
Input: root = [0,1,3,null,2]
Output: [2]
Explanation: The deepest node in the tree is 2, the valid subtrees are the subtrees of nodes 2, 1 and 0 but the subtree of node 2 is the smallest.
 ```

* Constraints:
  * The number of nodes in the tree will be in the range [1, 500].
  * 0 <= Node.val <= 500
  * The values of the nodes in the tree are unique.

## Day 13

* Problem [Burst Balloons](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3564/)
* Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.
* Find the maximum coins you can collect by bursting the balloons wisely.  

Note:
* You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
* 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
* Solution [link](SolutionDay13.java)
* Example:

```text
Input: [3,1,5,8]
Output: 167 
Explanation: nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
             coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
```
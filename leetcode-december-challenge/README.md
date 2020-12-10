# leetcode-december-challenge

[leetcode-december](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/)  
This repo contains solution to the problems in LeetCode December Challenge.

## About the challenge

This Challenge is beginner-friendly and available to both Premium and non-Premium users. It consists of 31 daily problems over the month of December. A problem is added here each day, and you have 24 hours to make a valid submission for it in order to be eligible for rewards.

## Day 1

* Problem [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3551/)
* Given the root of a binary tree, return its maximum depth.
* A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
* Solution [link](SolutionDay1.java)
* Example 1:

![day1](jpg/day1.jpg)

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
  * The number of nodes in the tree is in the range [0, 104].
  * -100 <= Node.val <= 100

## Day 2

* Problem [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3552/)
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

* Problem [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3553/)
* Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
* Solution [link](SolutionDay3.java)
* Example 1:  

![day3_0](jpg/day3.jpg)

```text
Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
```

* Example 2:

![day3_1](jpg/day3_1.jpg)

```text
Input: root = [5,1,7]
Output: [1,null,5,null,7]
```

* Constraints:
  * The number of nodes in the given tree will be in the range [1, 100].
  * 0 <= Node.val <= 1000

## Day 4

* Problem [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3554/)
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

* Problem [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3554/)
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
  * 1 <= flowerbed.length <= 2 * 104
  * flowerbed[i] is 0 or 1.
  * There are no two adjacent flowers in flowerbed.
  * 0 <= n <= flowerbed.length

## Day 6

* Problem [link](https://leetcode.com/explore/featured/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3556/)
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

![day6_0](jpg/day6_0.png)

```text
Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
```

* Constraints:
  * The number of nodes in the given tree is less than 6000.
  * -100 <= node.val <= 100

## Day 7

* Problem [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/569/week-1-december-1st-december-7th/3557/)
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

* Problem [link](https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3559/)
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
  * 1 <= time.length <= 6 * 104
  * 1 <= time[i] <= 500

## Day 9

* Problem [link]()
* Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):

* BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
* boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
* int next() Moves the pointer to the right, then returns the number at the pointer.
* Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.

* You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.

 

* Example 1:

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

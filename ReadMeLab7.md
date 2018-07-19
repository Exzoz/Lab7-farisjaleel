Lab 7 Questions

1. What is the purpose of the various auxiliary methods `populateList`, `populateFifoList`, and `ReverseLines.printReverse`?

- The idea of recursion is to divide the problem into sub-problems of the same type as the original. These methods are solving those sub-problems, and combining the results. 

2. Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?

- They need to have these arguments in order to solve the original problem which is simplified in each recursive call in such a way that eventually the base case must be reached. 

3. What are the time and space complexity of each of the `populateList`  `populateFifoList` methods, as well as `ReverseLines.printReverse`?

- The time and space complexity is O(2^n)

4. Which of these methods can be implemented using  `while`  loops?

- populateList can be implemented using a while loop.

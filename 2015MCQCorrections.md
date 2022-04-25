# Score: 21/39
## Question 4
### Correct Answer: C
### What I Answered: D
### Reasoning: I chose C without acknowledging that negative values can be a part of the int array too. I immediately thought that the largest value in arr being 0 would cause and ArrayIndexOutOfBounds exception, when in reality that's not true. With negative numbers, the logic of if val > maxVal would not function correctly.

## Question 5
### Correct Answer: A
### What I Answered: C
### Reasoning: As per DeMorgan's laws, x or y and x "cancels out" the y. I on the other hand just switched out the or operator for the and operator.

## Question 6
### Correct Answer: A
### What I Answered: E
### Reasoning: This was one of the questions I ended up guessing on due to a time constraint. Now that I have fully read the question, I now understand why the answer is A, since none of the strings have the "art" substring in it, yet when the strings are concatenated, the ar in in similar and the t in today would have art, and the method would incorrectly return true.

## Question 9
### Correct Answer: E
### What I Answered: A
### Reasoning: I guessed on this question. The correct answer is E because you need the casting to int for each of the numbers obtained from rolling each cube. Then you need to add 2, as there are 2 cubes.

## Question 13
### Correct Answer: A
### What I Answered: E
### Reasoning: I did this in my head, so that was probably where the error was. I just redid the problem by having my calculations typed out and I got the right answer this time.

## Question 16
### Correct Answer: E
### What I Answered: C
### Reasoning: I saw the iteration for the rows and immediately thought that the answer would return the row index, when in reality, when you iterate for rows, you're finding the column index as the column index can be found in each row.

## Question 19
### Correct Answer: E
### What I Answered: A
### Reasoning: I understand why statement I works, but I didn't consider how statements II and III also work. II works because x = 1 will not fit the if condition of modulus 2 == 0 anyway. III works because x is incremented by 2 in the while loop, so only odd numbers will be what x is equal to, resulting in the printing of nothing.

## Question 20
### Correct Answer: E
### What I Answered: B
### Reasoning: It's not the maximum value that we're returning the index of. Since we're keeping track of the count and updating index based on the increment of the count variable, we're returning the index of the value that occurs most often in the nums array.

## Question 22
### Correct Answer: A
### What I Answered: D
### Reasoning: Option A actually goes through each individual element of the array, but having n be an element of each row. D however, is not concerning the length of numbers, but the length of numbers at row index 0, which doesn't make sense in the context of the problem, since all rows need to be considered.

## Question 26
### Correct Answer: E
### What I Answered: B
### Reasoning: We went over this question in class. If we correctly understand the method changeIt, we can see that it's not 5 0's being printed before 6, but the first five counting numbers being printed subsequently.

## Question 28
### Correct Answer: B
### What I Answered: C
### Reasoning: I got the correct value for the compare values part. For the assign to temp part, I guessed due to time constraints. Assign to temp will execute 5 times because the array length is 6 and therefore there are 5 total comparisons.

## Question 30
### Correct Answer: B
### What I Answered: D
### Reasoning: II is correct. The reason why I also allows the method getCost to work as intended is because the conditions for the if statements, just like statement II, match up with the different possibilities (>= 10, >= 5, and > 0). Greater than 0 is the default condition as per the precondition.

## Question 31
### Correct Answer: E
### What I Answered: C
### Reasoning: Another question I guessed on. I just went through the code segment and I figured out the pattern of when X's occur on the board, which matches with Option E. Option B has a similar pattern, but only the first 6 X's are what are supposed to be displayed on the board.

## Question 34
### Correct Answer: D
### What I Answered: C
### Reasoning: C is correct because we're concerned with indexing, so our maximum index is the size of listOfWords - 1, not the size itself.

## Question 35
### Correct Answer: C
### What I Answered: E
### Reasoning: I had to guess on this question. Now that I actually went through the method with the int array of values, I got the correct answer of 5.

## Question 36
### Correct Answer: D
### What I Answered: B
### Reasoning: The answer is 11 because 11 is the maximum number of times the array can be divided in half while the start continues to be less than or equal to the end.

## Question 37
### Correct Answer: E
### What I Answered: C
### Reasoning: Both answers confirm that III works. The reason why II also works is because k is being decremented at the end of the while loop, so the words are also being printed backwards just like III is doing.

## Question 38
### Correct Answer: C
### What I Answered: B
### Reasoning: B is incorrect because this method is not just considered with the last element of the array numbers, but all elements that are equal to val.

{% include navigation.html %}

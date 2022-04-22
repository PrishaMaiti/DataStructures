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

{% include navigation.html %}

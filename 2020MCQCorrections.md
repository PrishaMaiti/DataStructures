# Score: 18/40

## Question 3
### Correct Answer: C
### What I Answered: E
### Reasoning: The distance between the two markers is what should be positive, since we're dealing with distance which is a scalar quantity, before finally doing division by double 60.0.

## Question 6
### Correct Answer: A
### What I Answered: D
### Reasoning: In Statement I, it's only the int 2 where the double casting applies, so when we do the math, we would get 3.5. 2/4 and 2/4 + 3 are not the expressions that should be casted to double, since mathematically statements II and III do not yield the result 3.5.

## Question 7
### Correct Answer: E
### What I Answered: B
### Reasoning: E is correct because the conditions of num being between 0 and 100 exclusive allows b2 to remain true. Every other condition has turned b1 false.

## Question 8
### Correct Answer: D
### What I Answered: B
### Reasoning: For B, it's the other way around. Doubles cannot be assigned to ints but ints can still be assigned to doubles. However, n1 and n2 are not defined, but are rather only used for the Points class constructor.

## Question 9
### Correct Answer: B
### What I Answered: C
### Reasoning: I made a calculation mistake with the final digit. I just redid it and got 1 for the final digit.

## Question 10
### Correct Answer: D
### What I Answered: B
### Reasoning: If 5 and 10 were num1 and num2 respectively, only 0 will be printed. 20 and 5 however, the first output will still be 0, and when i = 10, 10 will be printed.

## Question 12
### Correct Answer: B
### What I Answered: C
### Reasoning: III is incorrect because we need the object itself to not equal null, not just the attribute of its name. Hence II is correct.

## Question 14
### Correct Answer: D
### What I Answered: A
### Reasoning: The reason why III works as well is because in this context, not having the else keyword the way it's implemented in I would not affect the code's logic. Once again, statement II will not work because a static method cannot have a return type.

## Question 16
### Correct Answer: B
### What I Answered: D
### Reasoning: The number of asterisks are printed the other way around as per the order of where the recursive method call is in the method.

## Question 17
### Correct Answer: D
### What I Answered: B
### Reasoning: 50 + 10 * 2 = 70.

## Question 18
### Correct Answer: E
### What I Answered: C
### Reasoning: I accidentally put the wrong starting value for p. It should be 1 and not 0.

## Question 21
### Correct Answer: D
### What I Answered: B
### Reasoning: By the nature of k = j + 1, the words are printed in a backwards order starting from "of".

## Question 24
### Correct Answer: D
### What I Answered: C
### Reasoning: The code segment would print 11 if the someClass constructor did not increment y. If we redo the math, we get 14 as the final result. I think I made a calculation error.

## Question 26
### Correct Answer: C
### What I Answered: D
### Reasoning: A would be printed n more times than B if the outer and inner for loop Boolean conditions for II were j < m and k <= n, respectively. Redoing the math, A is printed m more times than B.

## Question 27
### Correct Answer: E
### What I Answered: B
### Reasoning: If b were true, the Boolean logic wouldn't work, and hence c would never be assigned false. Since b can be false, c will be false under that circumstance by DeMorgan's laws.

## Question 29
### Correct Answer: E
### What I Answered: A
### Reasoning: 16 + 8 + 4 + 2 + 1 + 10 = 41. We have to acknowledge all recursive steps, not just the final value of num.

## Question 31
### Correct Answer: A
### What I Answered: D
### Reasoning: I works but III doesn't work because it doesn't account for the -1.

## Question 33
### Correct Answer: E
### What I Answered: C
### Reasoning: I had to guess on this question out of time constraints. Redoing the traversal in my head, I got the output shown in option E.

## Question 34
### Correct Answer: E
### What I Answered: B
### Reasoning: The method will still return an empty ArrayList when no matches are found, not through a NullPointerException. Instead, the method is skipping elements of numList during the traversal.

## Question 35
### Correct Answer: A
### What I Answered: A
### Reasoning: I got the correct first missing condition, but valCount must be greater than modeCount, not just not equal to modeCount, in order for valCount to be correctly incremented.

## Question 39
### Correct Answer: D
### What I Answered: C
### Reasoning: Calling recurMethod on "edcba" will correctly compare the letters, so that recurMethod is recursively called, ultimately resulting in the Boolean value of true.

## Question 40
### Correct Answer: A
### What I Answered: C
### Reasoning: Line 3 will cause a compiler error because obj1 of class type B cannot guarantee which message method to use, the one from class A or the one from class B.

{% include navigation.html %}

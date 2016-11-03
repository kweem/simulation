# Simulation Scenario

## One Candidate
1. The candidate gets 30 minutes to implement the first exercise. Afterwards the candidate explains his solution. Interviewer gives feedback.
2. The candidate gets another 30 minutes to implement the second exercise. Afterwards the candidate explains his solution. 
3. Technical interview: candidate explains to the interviewer what the program does and fixes the failing unit tests.

## Multiple Candidates *(experimental)*
1. Make sure the candidates are in different rooms. Candidate A and Candidate B both get 30 minutes to solve a **different** exercise. Afterwards each candidate explains his solution to the interviewer.
2. Afterwards they switch laptops. Each candidate now needs to analyze and explain the other candidate's solution. What would they do different? Why? (Backup plan in case the candidate did not manage to complete the exercise: have a messy solution prepared.)
3. Technical interview: candidate explains to the interviewer what the program does and fixes the failing unit tests.

## Setup
- Laptop with AZERTY keyboard
- Eclipse IDE with Java and jUnit (no other libraries)
- No internet connection

## Interviewer checklist
- Clean code + object oriented principles?
- Test driven approach?
- Does the candidate pick up feedback from the interviewer and put it into practice?
- Is the candidate not afraid to speak up during the technical interview?

---

# Possible Exercises

## The Anagram Detector
Write a program to detect if two strings are anagrams. An anagram is a word or phrase formed by rearranging the letters of another.
For example:
- "night" and "thing"
- "a perfectionist" and "I often practice"

## The FizzBuzz
Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Pascal's Triangle
For a given integer K, print the first K rows of Pascal's Triangle. Print each row with each value separated by a single space. The value at the n<sup>th</sup> row and r<sup>th</sup> column of the triangle is equal to `n!/(r! * (n-r)!)` where indexing starts from 0.

##### Aditional information
- The factorial of n: `n! = 1 * 2 * ... * n`

##### Constraints
2 <= K <= 10

##### Sample Input
4

##### Sample Output
1  
1 1  
1 2 1  
1 3 3 1  


---

# Technical Interview

## The Aquarium
The Aquarium is a magical world for fishes with all kinds of colors. However, all unit tests of The Aquarium are failing. Can you fix them so all the fish can live happily ever after?

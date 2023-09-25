# Homework Assignment 1
Matriculation Number: 7218924 <br />
GitHub Link: https://github.com/haarsh85/homework-assignment-1.git

# Development Environment:
- java 20.0.2 2023-07-18
Java(TM) SE Runtime Environment (build 20.0.2+9-78)
Java HotSpot(TM) 64-Bit Server VM (build 20.0.2+9-78, mixed mode, sharing)

-	IDE
Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
Version: 2023-06 (4.28.0)


# Solution Description
## Problem 1: Language Basics
Code: MathCalc.java <br />
Description: <br />
Used given diameter miles of the sun and earth to calculate the radius by dividing by 2. Then use `Math.PI` and `Math.pow` to calculate volumes of sun and earth seperately. <br />

Output: 
```
The volume of the Earth is 2.2984729611703882E11 cubic miles, the volume of the sun is 3.388807851993121E17 cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is 1474373.5990122468.
```

## Problem 2: Language Basics
Code: Primes.java <br />
Description: <br />
Initialized `nValues` to 50. There are 02 for loops in the code. The outer loop iterates from number 02 to nValues. It starts at 02 because it is the smallest prime number. `int sqrt = (int) Math.sqrt(i);` calculates the square root of each number, cast it to an integer and store in variable `sqrt`. It is used in the inner for loop when testing whether an integer is prime or not, to try and divide by integers up to the square root of the number being tested. If the number is evenly divisible by any number smaller than or equal to the square root of that number it is not a prime number. In this case, the inner loop will skip processing and the control is given to the outer for loop to check the next number. Finally, only the prime numbers will be printed. <br />

Output (for nValues = 50):
```
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
```

## Problem 3: Object Basics
Code: StringCharacters.java <br />
Description: <br />
The given text is analyzed charachter by character to determine the vowels, consonants and spaces. During the implementation the given text has been converted to lower case for simplicity. <br />

Output:
```
The text contained vowels: 60
consonants: 39
spaces: 37
```

## Problem 4: Object Basics
Code: WordSort.java <br />
Definition of 'words': I have defined words as sequence of only characters seperated by white spaces. Therefore, I have removed punctuation marks (i.e. ,;?') available in the soliloquy to retain only characters. <br />
Description: <br />
This program extracts the words from the text and sorts them into alphabetical order. There are two methods each for extracting words and sorting (bubble sort). 
 - The `extractWords` method: If the text contains any punctuation marks (,;?') they will be replaced by spaces. Also, all text is converted to lower case to avoid comparison issues during sorting. Then, the code takes the modified text and split it into an array of words using spaces.
 - The `bubbleSort` method: Compare elements and if the first element is greater than the second interchange two elements using the ascending order <br />
 
 Output:
```
Sorted Word list
a
against
and
and
arms
arrows
be
be
by
end
fortune
in
is
mind
nobler
not
of
of
opposing
or
or
outrageous
question
sea
slings
suffer
take
that
the
the
the
them
tis
to
to
to
to
troubles
whether
```

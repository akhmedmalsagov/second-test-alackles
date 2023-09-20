In binary representation, negative numbers are typically represented in two ways: 
- using the Two's Complement representation for integers
- using IEEE 754 standard for double-precision which are floating-point numbers.

In Two's Complement, negative integers are represented by flipping all the bits in the binary representation of the corresponding positive integer and 
then adding 1 to the result:
- +7 in binary is 0111. When use Two's Complement, we start with the binary representation of +7: 0111, then flipping all the bits: 1110, then
  adding 1 to the result: 1111. That means that -7 in binary is 1111, 1 at the right end means that the number is negative.

I was searching the information about IEEE 754 method for float point numbers, but the information I found was too complicated and I could not 
understand it to make an examples of it. 

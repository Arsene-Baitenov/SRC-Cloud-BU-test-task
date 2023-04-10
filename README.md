# About The Project

There are implemented two functions for working with roman numbers.

First of them, `isValid`, checks the correctness of the conveyed roman number.
The function takes a string as input and produces the following results:

- return `true` if roman number is correct;
- return `false` if roman number isn't correct;
- throw `IllegalArgumentException` if passed string contains not only roman numerals
  or the length of the string not from 1 to 15.

Second function, `convert`, converts roman number to arabic form.
It takes a string as input and return the arabic number or throws `IllegalArgumentException` if passed roman number
isn't correct
or passed string the passed string raises an exception in the function `isValid`.

## Roman Number Structure

- In the number notation you can use only digits: `I`(`i`), `V`(`v`), `X`(`x`), `L`(`l`), `C`(`c`), `D`(`d`), `M`(`m`).
  They match 1, 5, 10, 50, 100, 500, 1000.
- To correctly write numbers in Roman numerals, you must first write down the number of thousands, then hundreds, then
  tens, and finally ones.
- Places can be skipped, but there must be at least one.
- Some numbers (I, X, C, M) can be repeated, but not more three times in a row.
- The smaller numeral can be written to the left of the larger one, then it should be subtracted from the larger one.
  This rule The rule only works in the following cases:
  - `IV` = 4
  - `IX` = 9
  - `XL` = 40
  - `XC` = 90
  - `CD` = 400
  - `CM` = 900
- Otherwise, the numeral is added.

Examples: `XXIII` = 23, `MMCDII` = 2402, `LXXXIV` = 84.

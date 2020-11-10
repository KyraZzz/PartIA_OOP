## Q1. (W) Set up SSH, git, and IDE and your account on Chime
## Q2. (W) Complete the Fibonacci task on Chime
[Fibonacci Task on Chime](https://chime.cl.cam.ac.uk/page/repos/yz709/fibonacci/code})
#### (a) Why would one argue that the provided tests for Fibonacci are not sufficient?
* If the tests have not go through all the branches in the codes, then it is not sufficient 
to say the code is robust because without testing all the branches, one of them might have
unexpected bugs remaining.

#### (b) Why would it be a bad idea to write a test that times whether FibonacciTable runs faster than Fibonacci?
* The run time will differentiate if the number of test cases are relatively big, otherwise
the difference between run time is too tiny that we are not able to distinguish. Since it takes 
a lot of time to write a sufficient amount of tests, it will be a bad idea in practice.
* Even with the sufficient amount of test data, we have to iteratively do the same test on both
programs to enable us to conclude because there might be some environmental factors involved in
each test which might influence an individual test round. By multiple test rounds, we can finally
give the correct conclusion.

## Q3. What does instruction coverage mean as a test coverage metric? Give an example showing how 100% instruction coverage does not mean your program is bug free.
* Instruction coverage: The amount of instructions or branches of the program that have been gone through during testing.
For a valid input, the program will execute properly if the percentage coverage is high.
* It might still have bugs if we have not set up a path to deal with invalid inputs. For instance,
in the fibonacci program, if we receive a number that is smaller than 1, and we have no path to deal with it, we will receive an error
such as null pointer exception.

## Q4. (W) Compare and contrast a typical functional language and a typical imperative language.
* 

## Q5. Write Java code to test whether your Java environment performs tail-recursion optimisations or not.

## Q6. Write a static function lowestCommon that takes two long arguments and returns the position of the first set bit in common, where position 0 is the LSB. If there is no common bit, the function should return -1. For example lowestCommon(14,25) would be 3. Your solution should use at least one break statement.
















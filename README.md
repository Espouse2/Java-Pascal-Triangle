# Java-Pascal-Triangle
This is my project I have created for Introduction to Programming in Java course. 

This project is divided into 4 classes:

### Main:
This class is the controller of my project. Here everything comes to life and everything is put together to form a working project. 

### Model:
This class is the brain of my project. Whole math behind creation of the Pascals Triangle is done. There are two methods, from which we can choose, that create the Pascal's Triangle: method of binomial coefficient and method of summation of 2 'above' numbers. 

The binomial coefficient method calculates the value of each node of Pascal's Triangle by using nCr formula of node's position. For example, let x determine vertical position and y horizontal position, when we want to calculate value of second number in third row we apply x = 3 and y = 2 into nCr formula, i.e binomial coefficient formula. From that we can see, that for given position, node value will be 3C2 which results in: 3. 

The summation of 2 'above' nodes is just a simple calculation which takes the value of two corresponding numbers to our node and summing them resulting in new value. For example, let be given such Pascal's Triangle with unknown x:

                                          1
                                        1   1
                                       1  x  1
                                       
We can calculate the value of x by summing the 1's in the row above, which results in 2. In the exact same manner rest of the numbers are calculated.

### View:
This class is responsible for printing everything that user sees. This class takes values from user and prints the result. 

### Exceptions:
This class is responsible for handling exceptions of my programme. I have created an exception that does not allow user to input not-positive values as number of rows to be displayed. 

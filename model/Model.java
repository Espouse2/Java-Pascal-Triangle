package com.davecoding.model;


import com.davecoding.exceptions.NoPositiveValueException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Class model is used for calculating components of Pascals Triangle as well as all required values, e.g. factorials.
 * @author Dawid Rędzia
 * @version 2.0
 */
public class Model {

    /**
     * Recursive function for calculating factorial.
     *
     * @param n - input number of which we want the factorial.
     * @return - returns value of n!
     */

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * This function is responsible for calculating binomial coefficient using simple formula: nCr = n! / r!(n-r)!
     *
     * @param n n in nCr formula
     * @param r r in nCr formula
     * @return - returns the value of nCr
     */

    public int binomialCoefficient(int n, int r) {
        return factorial(n) /( factorial(r) * factorial(n - r));
    }

    /**
     * This method calculates parameters of pascal triangle using binomial coefficients
     *
     * @param numberOfRows - it gets number of rows user wants to display
     * @return array of values to be displayed using view class
     */
/*
    public int[][] pascalTriangleBinCoeff(int numberOfRows){
        int[][] array;
        array = new int[numberOfRows][numberOfRows];

        for(int i = 0; i < numberOfRows; i++){
            for(int j = 0; j <= i; j++) {
              array[i][j] =  binomialCoefficient(i, j);
            }
        }
        return array;
    }*/

    public List<List<Integer>> pascalTriangleBinCoeff2(int numberOfRows){
        List<List<Integer>> array = new ArrayList<List<Integer>>(numberOfRows);

        ArrayList<Integer> firstElement = new ArrayList<Integer>();
        firstElement.add(1);
        array.add(firstElement);

        for (int i=1; i < numberOfRows; i++){

            ArrayList<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);

            for(int j=1; j < i; j++){
                currentRow.add(binomialCoefficient(i, j));
            }
            currentRow.add(1);
            array.add(currentRow);
        }
        return array;
    }

    /**
     * This method calculates values of pascal triangle coefficients using summation of parent node method.
     * @param numberOfRows - it gets number of rows user wants to display
     * @return array of values to be displayed using view class
     */
  
    public List<List<Integer>> pascalTriangleSum2(int numberOfRows){
        List<List<Integer>> array = new ArrayList<List<Integer>>(numberOfRows);

        ArrayList<Integer> firstElement = new ArrayList<Integer>();
        firstElement.add(1);
        array.add(firstElement);

        for (int i=1; i < numberOfRows; i++){

            List<Integer> previousRow = array.get(i-1);
            ArrayList<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);

            for(int j=1; j < i; j++){
               currentRow.add(previousRow.get(j-1) + previousRow.get(j));
            }
            currentRow.add(1);
            array.add(currentRow);
        }
        return array;
    }

    /**
     *
     * @param numberOfRows
     * @return returns true if numberOfRows is valid else returns false.
     * @throws NoPositiveValueException - throws exception for negative values.
     */
    public boolean isValid(int numberOfRows) throws NoPositiveValueException {
        if (numberOfRows < 0) throw new NoPositiveValueException();
        else return true;
    }
}

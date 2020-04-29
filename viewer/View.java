package com.davecoding.viewer;

import java.util.List;
import java.util.Scanner;

/**
 * Class view is responsible for printing results and messages as well as getting input from user.
 * @author Dawid Rędzia
 * @version 2.0
 */
public class View {

    /**
     * This method prints values of Pascals Triangle
     * @param array - gets values of single components of Pascals Triangle as two dimensional array
     * @param numberOfRows - gets value from user as to how many rows user wants to print out.
     */
    /*
    public void printingValuesOfPascalTriangle(int[][] array,int numberOfRows){

        for(int[] i:array){
            for(int elem:i) {
                if(elem != 0)
                    System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }*/

    public void printingValuesOfPascalTriangle2(List<List<Integer>> array, int numberOfRows) {

        for (List<Integer> i : array) {
            for (int elem : i) {
                if (elem != 0)
                    System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

        /*
        for(int i = 0; i < numberOfRows; i++){
            for(int j = 0; j <= i; j++){
                if(array.isEmpty())
                    System.out.print();
            }
        }
    }*/

    /**
     * Method for printing welcome message.
     */
    public void welcomeMsg(){ System.out.println("Welcome to my Pascals Triangle generating programme."); }

    /**
    * Method for getting input from user of how many rows user wants to print out.
    */
    public int getNumberOfRows(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please provide number of rows:");
            int numberOfRows = scanner.nextInt();
            return numberOfRows;

    }

    /**
     * Method for getting which method user wants to use to calculate components of Pascals Triangle
     * @return - returns int either '1' or '2' which is used in switch case in controller to choose between methods.
     */
    public int getWhichMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose which method you want to use.");
        System.out.println("For summation of two parent nodes method please type '1'");
        System.out.println("For binomial coefficients method please type '2'");
        int method = scanner.nextInt();
        return method;
    }

    /**
     * Method for displaying string
     * @param stringToPrint - string to display
     */
    public void printData(String stringToPrint)
    {
        System.out.println(stringToPrint);
    }

}

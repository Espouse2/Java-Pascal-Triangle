package com.davecoding;

import com.davecoding.exceptions.NoPositiveValueException;
import com.davecoding.model.Model;
import com.davecoding.viewer.View;

/** This is a console application for generating Pascals Triangle
 *
 * @author Dawid Rędzia
 * @version 2.0
 */
public class Main {

    /** Main method (controller) for console application - checks number of rows input value and generates values of Pascals Triangle components.
     *
     * @param args exactly 2 parameters given in order to, firstly determine size of Pascals Triangle and then to choose method of calculations.
     */
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        try {
            view.welcomeMsg();
            int numberOfRows = view.getNumberOfRows();
            model.isValid(numberOfRows);
            switch(view.getWhichMethod()) {
                case 1:
                    view.printingValuesOfPascalTriangle2(model.pascalTriangleSum2(numberOfRows), numberOfRows);
                    break;
                case 2:
                    view.printingValuesOfPascalTriangle2(model.pascalTriangleBinCoeff2(numberOfRows), numberOfRows);
                    break;
            }
        }
        catch(NoPositiveValueException exception){
            view.printData(exception.getMessage().toString());
        }
         catch(InputMismatchException exception) {
            System.out.println("Please provide a positive integer.");
        }
    }
}

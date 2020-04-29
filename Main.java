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
            //view.getWhichMethod();
            if(view.getWhichMethod() == 1) {
                view.printingValuesOfPascalTriangle2(model.pascalTriangleSum2(numberOfRows), numberOfRows);
            }else
                view.printingValuesOfPascalTriangle2(model.pascalTriangleBinCoeff2(numberOfRows), numberOfRows);
        }
        catch(NoPositiveValueException exception){
            view.printData(exception.getMessage().toString());
        }
    }
}

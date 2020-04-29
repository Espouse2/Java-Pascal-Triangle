package com.davecoding.exceptions;

/**
 * Custom exception for situation when a negative value is put in as a number of rows required.
 * @author Dawid
 * @version 1.0
 */
public class NoPositiveValueException extends Exception{

    /**
     * Default constructor without parameters
     */
    public NoPositiveValueException(){super("Please provide a positive integer");}
}


import javax.swing.*;
/**
 * CS-202 Lab 1
 * Matrix.java
 * Purpose: This program creates, compares, multiplies and prints various matrixes.
 * 
 * @author Dewey Kincheloe
 * version 1.0 8/25/2016
 */

public class Matrix
{
	//Attributes
	  int rows;
	  int columns;
	  int [][] array;

	//Constructors
	  public Matrix (int r, int c)
	  {
	    rows = r;
	    columns = c;
	    array = new int[rows][columns];
	    for (int i=0; i<rows; i++)
		for(int j=0; j<columns; j++ )
			array[i][j] = 1+(int)(Math.random()*10);

	  }

	//Methods
        public static void main(String[] args)
	{
                System.out.println("Test");
        }

}


// import 
import java.util.Arrays;  
import java.util.Random;
import java.util.*;
/**
 * Class 2D Arrays.
 * Populates 4 by 6 with grades randomly
 * generated from 0 to 100, and calculates
 * the class average
* @author  John Omage
* @version 1.0
* @since   2020-10-17
*/

public class Arrayss {
  
  /**
   * Required javadoc.
  */
  
  public static float findClassAverage() {
    
    // create the 2D array
    // 6 = column (assignments), 4 = row (student's grades)
    int[][] array = new int[4][6];
    
    // generate random number
    Random rand = new Random();
    
    // declare variables 
    float counter = 0;
    float sum = 0;
    
    // for loop row until it is less than array length
    for (int row = 0; row < array.length; row++) {
      // fill up the column unti it is less than the array's row length
      for (int column = 0; column < array[row].length; column++) {
        // assign row, column to a random number generated
        // from 0 to 100
        array[row][column] = rand.nextInt(100);
        
        // calculate sum
        sum = sum + array[row][column];
        
        // increment counter
        counter++;
        
        // print the row and column of the grades
        System.out.print(array[row][column] + " ");
      }
      // print line
      System.out.println();
    }
    
    // calculate average
    float average = (sum / counter);
    
    return average;
  }
  
  /**
   * Required javadoc.
  */
  
  public static void main(String[] args) {
    
    // call function
    float average = findClassAverage();
   
    // display the average
    System.out.println("The class average is: " + average);
    
  }
}

/**
 * Write a description of class UsingArrays here.
 * 
 * @author Alexander Hamilton
 * @version 11.28.2022
 **/
public class UsingArrays
{

  public static void main(String[] args) {
    int[] grades = {4,2,3,1,3,3,2,0,4,5,5,1,0};

    // Write the code to compute the average value
    // DO NOT hard-code the number of items to divide by!
    // What would you use to find the length of the array?
    // Use System.out.println() to print the average score to the console
    int sum = 0;
    for (int i : grades) {
      sum += i;
    }
    System.out.println(sum/grades.length);
  }
}

/* You are given a strictly increasing integer array rungs that represents the height of rungs on a ladder. You are 
currently on the floor at height 0, and you want to reach the last rung. You are also given an integer dist. You 
can only climb to the next highest rung if the distance between where you are currently at (the floor or on a rung) 
and the next rung is at most dist. You are able to insert rungs at any positive integer height if a rung is not 
already there. Return the minimum number of rungs that must be added to the ladder in order for you to climb to 
the last rung.
* Eg 1 : rungs = [1,3,5,10]         distance = 2                 Output = 2
* Eg 2 : rungs = [3,6,8,10]         distance = 3                 Output = 0
* Eg 3 : rungs = [3,4,6,7]          distance = 2                 Output = 0
*/
import java.util.*;
public class Rungs
{
      public int MinimumNumberOfRungs(int ladder[], int distance)
      {
            int count = 0;     // Variable defined...  //*  Variable -> O(1)
            for(int i = 0; i < ladder.length - 1; i++)     //! Comparison -> O(n)
            {
                  int adjacent = ladder[i + 1] - ladder[i];    // Finding the difference between adjacent rungs...
                  if(adjacent > distance)     // If distance is greater than the possible jump...
                  {
                        int floor = (int)(Math.floor(adjacent) / distance);    // Number of rungs required...
                        count = count + floor;
                  }
            }
            return count;    // Returning the number of rungs required...
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter the number of rungs in ladder : ");
            x = sc.nextInt();
            int run[] = new int[x];
            for(int i = 0; i < run.length; i++)
            {
                  System.out.print("Enter rung height from ground : ");
                  run[i] = sc.nextInt();
            }
            System.out.print("Enter the climbing height : ");
            x = sc.nextInt();
            Rungs rungs = new Rungs();              // Object creation...
            System.out.println("The Required number of Rungs : "+rungs.MinimumNumberOfRungs(run, x));
            sc.close();
      }
}



//! Time Complexity -> O(N)
//* Space Complexity -> O(1)

/** //? DEDUCTIONS -
 * ? We find the distance between adjacent rungs...
 */
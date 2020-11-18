package PaintingAWall;

import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintingAWall {

	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      
	      wallWidth = 10.0;                     
	      
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();
	      
	      // Calculate and output wall area
	      wallArea = wallWidth * wallHeight;                        // Calculate the wall's area
	      System.out.println("Wall area: " + wallArea + " square feet");     // Finish the output statement
	      
	      // Calculate and output the amount of paint in gallons needed to paint the wall
	      
	      double gallonsOfPaint = wallArea / 350;
	      System.out.println("Paint needed: " + gallonsOfPaint + " gallons");
	      
	      // Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
	      int cansOfPaint = (int)Math.ceil(gallonsOfPaint);
	      System.out.println("Cans needed: " + cansOfPaint + " can(s)");
	      
	   }
	}

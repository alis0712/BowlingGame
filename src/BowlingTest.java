/*
 * Syed F Ali
 * COSC 565 Assignment II
 * Due Nov 24th, 2020
 */


package Assignment2;

import org.junit.jupiter.api.Test;

import org.junit.Assert;
import junit.framework.TestCase;

public class BowlingTest extends TestCase
{
	
	@Test
 public void testMaxFrame()																			// Tests the max number of frames inside the bowling game
	{
		try
		{
      Assert.assertEquals(10, Bowling.MAXFRAMES);
      System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	}

	@Test
	 public void testMaxRolls()																		// Tests the max number of rolls inside the bowling game
		{
		try
		{
	      Assert.assertEquals(21, Bowling.MAXROLLS);
	      System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
		}
	
	
	
}
	
		
		

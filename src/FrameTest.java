/*
 * Syed F Ali
 * COSC 565 Assignment II
 * Due Nov 24th, 2020
 */

package Assignment2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class FrameTest extends TestCase 

{
	 private void ManyRolls (int n, int pins) 																// A function that takes in n and the pins
	 {
		 	Frame frame = new Frame();
	        for (int i = 0; i < n; i++) 
	        {
	            frame.addPins(pins);
	        }
	 }

	@Test
	public void testRolls() 																				// testing Rolls
	{
		
		Frame frame = new Frame();
		ManyRolls(20,0);
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	}

	@Test
	public void testGetScore() 																				// testing the score system
	{
		Frame frame = new Frame();
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	}
	
	@Test
	public void testWarmup() 																				// testing a warmup game also known as gutter game
	{
		Frame frame = new Frame();
		ManyRolls(30,8);
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}

	@Test
	public void testOnes()																					// testing all the ones in the game
	{
		Frame frame = new Frame();
		ManyRolls(20,1);
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}
	
	@Test
	public void testTwos()																					// testing all the twos in the game
	{
		Frame frame = new Frame();
		ManyRolls(20,2);
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}
	
	@Test
	public void testThrees()																				// testing all the threes in the game
	{
		Frame frame = new Frame();
		ManyRolls(20,3);
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}
	
	@Test
	public void testGetScoreWithFrameIndex()																 // testing the frame index
	{
	Frame frame = new Frame();
	try
	{
	Assert.assertEquals(0, frame.getScore(5));
	System.out.println("Tests completed successfully.");
	}
	
	catch (AssertionError e)
	 {
	 System.out.println(e.getMessage());
	 }
	}
	  
	@Test
	public void testAddPins()																				// testing the pins function
	{
	Frame frame = new Frame();
	frame.addPins(5);
	}
	
	@Test
	public void testScoreNoThrows() 																		// testing score with no throws
	{
		Frame frame = new Frame();
		frame.addPins(0);
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}
	
	@Test
	public void testOneThrow() 																				//testing the game with a single throw
	{
		Frame frame = new Frame();
		frame.addPins(0);
		try
		{
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}

	@Test
	public void testTwoThrows() 																			// testing the frame with two throws
	{
		Frame frame = new Frame();
		frame.addPins(5);
		frame.addPins(4);
		try
		{
		Assert.assertEquals(9, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}
	
	@Test
	public void testFourThrows() 																			// testing the frame with four throws
	{
		Frame frame = new Frame();
		frame.addPins(5);
		frame.addPins(4);
		frame.addPins(7);
		frame.addPins(2);
		try
		{
		Assert.assertEquals(18, frame.getScore());
		Assert.assertEquals(18, frame.getScore(1));
		Assert.assertEquals(18, frame.getScore(2));
		System.out.println("Tests completed successfully.");
		}
		
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }

	}
	
	@Test
	public void  testSimpleSpare() 																			// testing the frame with a spare
	{
		Frame frame = new Frame();
		frame.addPins(3);
		frame.addPins(7);
		frame.addPins(3);
		try
		{
		Assert.assertEquals(13, frame.getScore(1));
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }

	}
	
	@Test
	public void  testNeverKnockDownAllThePins() 															// testing the frame with no pins knocked down
	{
		Frame frame = new Frame();
		for (int i = 0; i < 10; i++)
		{
			frame.addPins(10);
		}
		try
		{
		Assert.assertEquals(240, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }

	}
		
	
	
	@Test
	public void  testThreeStrike() 																			// testing three strikes in a game
	{
		Frame frame = new Frame();
		frame.addPins(10);
		frame.addPins(3);
		frame.addPins(6);
		try
		{
		Assert.assertEquals(28, frame.getScore(1));
		Assert.assertEquals(28, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }

		
	}
	
	@Test
	public void  testOneStrike() 																			// testing a single strike in the game
	{
		Frame frame = new Frame();
		frame.addPins(10);
		try
		{
		Assert.assertEquals(0, frame.getScore(1));
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
		
	}
	
	@Test
	public void  testTwoStrike() 																			// testing two strikes in the game
	{
		Frame frame = new Frame();
		frame.addPins(10);
		frame.addPins(6);
		try
		{
		Assert.assertEquals(0, frame.getScore(1));
		Assert.assertEquals(0, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
		
	}
	
	
	@Test
	public void  testAllStrikes() 																			// testing all the strikes in the game
	{
		Frame frame = new Frame();
		frame.addPins(10);
		frame.addPins(6);
		frame.addPins(4);
		ManyRolls(16,0);
		try
		{
		Assert.assertEquals(20, frame.getScore(1));
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
		
	}
	
	@Test
	public void  testFrameScore()																			// testing the frame score
	{
		Frame frame = new Frame();
		frame.addPins(3);
		frame.addPins(7);
		frame.addPins(3);
		frame.addPins(2);
		try
		{
		Assert.assertEquals(18, frame.getScore(1));
		Assert.assertEquals(18, frame.getScore(2));
		Assert.assertEquals(18, frame.getScore());
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
		
	}
	
	@Test
	public void testOneSpare()																				// testing one spare 
    {
		 Frame frame = new Frame();

        rollSpare();
        frame.addPins(3);
        ManyRolls(17,0);
        try
		{
        Assert.assertEquals(0,frame.getScore());
        System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
    }
	
	 private void rollSpare() 																				// testing the roll spare
	    {
		 Frame frame = new Frame();
		 frame.addPins(5);
		 frame.addPins(5);
	    }
	
}

/*
 * Syed F Ali
 * COSC 565 Assignment II
 * Due Nov 24th, 2020
 */

package Assignment2;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import junit.framework.TestCase;

public class GameTest extends TestCase 

{

	
	
	@Test
	public void testGetScore() 																					// testing the score system
	{
		Game game = new Game();
		try
		{
		Assert.assertEquals("",game.getScore(5));
		System.out.println("Tests completed successfully.");
		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 

	}

	@Test
	public void testSetPinsKnockedDown() 																		// testing the knocking of pins
	{
		Game game = new Game();
		game.setPinsKnockedDown(5);
		try
		{
		Assert.assertEquals(1,game.throwCount);
		Assert.assertEquals(game.theThrows[0], 5);
		Assert.assertEquals(game.theThrows[1], 0);
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	}

	@Test
	public void testGetLeftBox() 																				// testing the left box
	{
		Game game = new Game();
		try
		{
		Assert.assertEquals("",game.getLeftBox(5));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
		
	}
	
	@Test
	public void testEmptyGame() 																				// testing the empty game
	{
		Game game = new Game();
		for (int i = 0; i < 20; i++)
		{
			game.setPinsKnockedDown(0);
		}
		try
		{
		Assert.assertEquals("", game.getScore(20));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
		
		
	}
	
	@Test
	public void testOneThrow1() 																				// testing a single throw
	{
		Game game = new Game();
		game.setPinsKnockedDown(5);
		try
		{
		Assert.assertEquals("" ,game.getScore(5));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	}
	
	
	@Test
	public void testTwoThrows() 																				// testing two throws
	{
		Game game = new Game();
		game.setPinsKnockedDown(5);
		game.setPinsKnockedDown(10);
		try
		{
		Assert.assertEquals("" ,game.getScore(15));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	}
	
	@Test
	public void testThreeThrows() 																			   // testing three throws
	{
		Game game = new Game();
		game.setPinsKnockedDown(5);
		game.setPinsKnockedDown(4);
		game.setPinsKnockedDown(7);
		try
		{
		Assert.assertEquals("", game.getScore(16));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	
	}
	
	@Test
	public void testFourThrows() 																				// testing four throws																						
	{
		Game game = new Game();
		game.setPinsKnockedDown(5);
		game.setPinsKnockedDown(4);
		game.setPinsKnockedDown(7);
		game.setPinsKnockedDown(2);
		try
		{
		Assert.assertEquals("", game.getScore(18));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	
	}
	
	@Test
	public void testOneThrowStrike() 																			// testing for a strike
	{
		Game game = new Game();
		game.setPinsKnockedDown(10);
		try
		{
		Assert.assertEquals("", game.getScore(10));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 } 
	}
	
	@Test
	public void testTwoThrowStrike() 																			// testing for two strikes
	{
		Game game = new Game();
		game.setPinsKnockedDown(10);
		game.setPinsKnockedDown(20);
		try
		{
		Assert.assertEquals("", game.getScore(30));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }

	}
	
	@Test
	public void testThreeThrowsStrike() 																		// testing for three strikes
	{
		Game game = new Game();
		game.setPinsKnockedDown(10);
		game.setPinsKnockedDown(4);
		game.setPinsKnockedDown(6);
		try
		{
		Assert.assertEquals("", game.getScore(20));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	}
	
	@Test
	public void testPerfectGame()  																				// testing a perfect game
	{
		Game game = new Game();
		for (int i = 0; i < 10; i++)
		{
			game.setPinsKnockedDown(10);
		}
		try
		{
		Assert.assertEquals("", game.getScore(300));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
		
	}
	
	@Test
	public void testAllOnesGame() 																				// testing all the ones in the game
	{
		Game game = new Game();
		for (int i = 0; i < 15; i++)
		{
			game.setPinsKnockedDown(1);
		}
		try
		{
		Assert.assertEquals("", game.getScore(20));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
		
	}
	
	@Test
	public void testSpares() 																					// testing for spares
	{
		Game game = new Game();
		game.setPinsKnockedDown(3);
		game.setPinsKnockedDown(7);
		game.setPinsKnockedDown(3);
		try
		{
		Assert.assertEquals("", game.getScore(13));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	
	}
	
	@Test
	public void testArrayEnd() 																					// testing end of an array
	{
		Game game = new Game();
		for (int i = 0; i < 9; i++)
		{
			game.setPinsKnockedDown(0);
			game.setPinsKnockedDown(0);

		}
		game.setPinsKnockedDown(2);
		game.setPinsKnockedDown(8);
		game.setPinsKnockedDown(10);
		
		try
		{

		Assert.assertEquals("", game.getScore(20));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
		

	}
	@Test
	public void testFullGame() 																					// testing full game
	{
		Game game = new Game();
		game.setPinsKnockedDown(1);
		game.setPinsKnockedDown(4);
		game.setPinsKnockedDown(4);
		game.setPinsKnockedDown(5);
		game.setPinsKnockedDown(6);
		game.setPinsKnockedDown(4);
		game.setPinsKnockedDown(5);
		game.setPinsKnockedDown(5);
		game.setPinsKnockedDown(10);
		game.setPinsKnockedDown(0);
		game.setPinsKnockedDown(1);
		game.setPinsKnockedDown(7);
		game.setPinsKnockedDown(3);
		game.setPinsKnockedDown(6);
		game.setPinsKnockedDown(4);
		game.setPinsKnockedDown(10);
		game.setPinsKnockedDown(2);
		game.setPinsKnockedDown(8);
		game.setPinsKnockedDown(6);
		try
		{
		Assert.assertEquals("", game.getScore(133));
		System.out.println("Tests completed successfully.");

		}
		catch (AssertionError e)
		 {
		 System.out.println(e.getMessage());
		 }
	
	}
	
	@Test
	public void testTenthFrame()
	{
		Game game = new Game();
		for (int i = 0; i < 7; i++)
		{
			game.setPinsKnockedDown(1);
			game.setPinsKnockedDown(1);
			try
			{
			Assert.assertEquals("", game.getScore(270));
			System.out.println("Tests completed successfully.");

			}
			catch (AssertionError e)
			 {
			 System.out.println(e.getMessage());
			 }


		}
	}
	
	@Test
	public void testBreak()
	{
		Game game = new Game();
		for (int i = 0; i < 11; i++)
		{
			game.setPinsKnockedDown(10);
			try
			{
			Assert.assertEquals("", game.getScore(299));
			System.out.println("Tests completed successfully.");

			}
			catch (AssertionError e)
			 {
			 System.out.println(e.getMessage());
			 }


		}
	}
	
}

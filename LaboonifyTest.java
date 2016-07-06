import static org.junit.Assert.*;

import org.junit.*;
import java.util.*;


public class LaboonifyTest {
/**
 *All returned arrays should have one more item than the input array
 */
	@Test
	public void verify_output_count() {
		Laboonify l=new Laboonify();
		Random rand;
		rand= new Random();
		int rndmlength;
		//create 100 arrays
		for (int y=0; y<100; y++)
		{
			rndmlength=rand.nextInt(99)+1;
		
			//create array with random length 1-100
			int [] new_input = new int[rndmlength];
			
			int rndmint;
			//fill array with random ints
			for (int x=0;x<rndmlength;x++)
			{
				rndmint=rand.nextInt(99)+1;
				new_input[x]=rndmint;
			}
			int [] new_output=l.laboonify(new_input);
			if (new_input.length+1 != new_output.length)
				fail();
		}
	}

/**
 *All items in the returned array, besides the last item, 
 *should add up to the value of the last item.
 */
	@Test
	public void verify_lastitem_sum() {
		Laboonify l=new Laboonify();
		Random rand;
		rand= new Random();
		int rndmlength;
		//create 100 arrays
		for (int y=0; y<100; y++)
		{
			rndmlength=rand.nextInt(99)+1;
		
			//create array with random length 1-100
			int [] new_input = new int[rndmlength];
			
			int rndmint;
			//fill array with random ints
			for (int x=0;x<rndmlength;x++)
			{
				rndmint=rand.nextInt(99)+1;
				new_input[x]=rndmint;
			}
			int [] new_output=l.laboonify(new_input);
			int sum=0;
			int lastitem=new_output.length-2;
			for (int x=0; x<=lastitem; x++)
				sum=sum+new_output[x];
			assertTrue(new_output[lastitem+1]==sum);
		}
	}
/**
 *The square of each item in the input array,
 *should be in the corresponding index of the returned array
 */
	@Test
	public void verify_eachitem_square() {
		Laboonify l=new Laboonify();
		Random rand;
		rand= new Random();
		int rndmlength;
		//create 100 arrays
		for (int y=0; y<100; y++)
		{
			rndmlength=rand.nextInt(99)+1;
		
			//create array with random length 1-100
			int [] new_input = new int[rndmlength];
			
			int rndmint;
			//fill array with random ints
			for (int x=0;x<rndmlength;x++)
			{
				rndmint=rand.nextInt(99)+1;
				new_input[x]=rndmint;
			}
			int [] new_output=l.laboonify(new_input);
			int temp=0;
			int lastitem=new_input.length-1;
			for (int x=0; x<=lastitem; x++)
			{
				temp=new_input[x];
				assertTrue(new_output[x]==(temp*temp));
			}
		}
		
	}
	
}


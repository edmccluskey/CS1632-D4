
//import java.util.*;

public class Laboonify {
	public int[] laboonify(int[] x)
	{
		int x_length = x.length;
		int temp_input=0;
		int temp_output=0;
		int sum=0;
		int [] new_x = new int[x_length+1];
		for (int count=0; count<x_length; count++)
		{
			temp_input = x[count];
			temp_output=squareIt(temp_input);
			new_x[count]=temp_output;
			sum=sum+temp_output;
		}
		new_x[x_length]=sum;
		return(new_x);
	}
	public int squareIt(int x)
	{
		int x_squared;
		x_squared = x * x;
		return (x_squared);
	}
}

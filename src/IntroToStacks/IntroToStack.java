package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	
	Stack<Double> stack = new Stack<Double>();
	Random rand = new Random();

	double n;
	
	String in1S;
	double in1;
	String in2S;
	double in2;
	
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		
		IntroToStack its = new IntroToStack();
		its.numberCreator();
		its.UI();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		
		
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
	
	public void numberCreator()
	{
		for(int i = 0; i <= 100; i++)
		{
			n = 100 * rand.nextDouble();
			stack.push(n);
		}
	}
	
	public void UI()
	{
		in1S = JOptionPane.showInputDialog("Input a number between 0 and 100");
		in2S = JOptionPane.showInputDialog("Input a SMALLER number between 0 and 100 (inclusive)");
		
		in1 = Integer.parseInt(in1S);
		in2 = Integer.parseInt(in2S);
		
		for(int k = 0; k <= 100; k++)
		{
			stack.get(k);
			if(stack.get(k) >= in2)
			{
				if(stack.get(k) <= in1)
				{
					System.out.println(stack.get(k));
				}
			}
		}
	}
}

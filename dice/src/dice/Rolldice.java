package dice;

import java.util.Random;
import java.util.Scanner;

class Dice1 {
	
	Dice1()
	{
		
	}
	int result;
	String roll2="HT";
	String roll4="1234";
	String roll6="123456";
	Random rand= new Random();
	int roll2()
	{
		result = rand.nextInt(roll2.length())+1;
		return result;
	}
	int roll4()
	{
		result = rand.nextInt(roll4.length())+1;
		return result;
	}
	int roll6()
	{
		result = rand.nextInt(roll6.length())+1;
		return result;
	}
}

public class Rolldice extends Dice1{
	public static void main(String args[])
	{
		System.out.print("enter the number of faces");
		System.out.print("choose only among 2,4,6 faced dice");
		Scanner obj=new Scanner(System.in);
		int faces=obj.nextInt();
		Dice1 obj1=new Dice1();
		int result;
		if(faces==2)
		{
			result=obj1.roll2();
			System.out.println("appeared face= "+result);
		}
		else if(faces==4)
		{
			result=obj1.roll4();
			System.out.println("appeared face= "+result);
		}
		else if(faces==6)
		{
			result=obj1.roll6();
			System.out.println("appeared face= "+result);
		}
		else
		{
			System.out.print("wrong choice");
		}

	}
}

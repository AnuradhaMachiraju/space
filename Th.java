import java.util.*;
import java.lang.*;
class Th1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good morning to all");
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		


		}
	}
}
class Th2 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Hello");
			try
			{
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Th3 extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("welcome");
			try
			{
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Th
{
	public static void main(String args[])
	{
		Th1 o=new Th1();
		Th2 o1=new Th2();
		Th3 o2=new Th3();
		o.start();
		o1.start();
		o2.start();
	}
}


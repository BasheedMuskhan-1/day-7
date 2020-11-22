package com.race;
public class CarThread1 extends Thread 
{
	public void run()
	{
		int count=0;
		for(int j=1;j<7;j++)
		{
			for(int i=1;i<101;i++)
			{
				if(i==50)
				{
					System.out.println("car1 reached petrol pump");
				}
				if(i==100)
				{
					System.out.println("car1 won the race");
				}
			}
			count=count+1;
			System.out.println("count:" +count);
			if(count==6)
			{
				System.out.println("car1 won first");
			}
		}
	}
}
class CarThread2 extends Thread
{
	public void run()
	{
		int count=0;
		for(int j=1;j<7;j++)
		{
			for(int i=1;i<101;i++)
			{
				if(i==50)
				{
					System.out.println("car2 reached petrol pump");
				}
				if(i==100)
				{
					System.out.println("car2 won the race");
				}
			}
			count=count+1;
			System.out.println("count:" +count);
			if(count==6)
			{
				System.out.println("car2 won first");
			}
		}
	}
}
class CarThread3 extends Thread
{
	public void run()
	{
		int count=0;
		for(int j=1;j<7;j++)
		{
			for(int i=1;i<101;i++)
			{
				if(i==50)
				{
					System.out.println("car3 reached petrol pump");
				}
				if(i==100)
				{
					System.out.println("car3 won the race");
				}
			}
			count=count+1;
			System.out.println("count:" +count);
			if(count==6)
			{
				System.out.println("car3 won first");
			}
		}
	}
}
class CarThread4 extends Thread
{
	public void run()
	{
		int count=0;
		for(int j=1;j<7;j++)
		{
			for(int i=1;i<101;i++)
			{
				if(i==50)
				{
					System.out.println("car4 reached petrol pump");
				}
				if(i==100)
				{
					System.out.println("car4 won the race");
				}
			}
			count=count+1;
			System.out.println("count:" +count);
			if(count==6)
			{
				System.out.println("car4 won first");
			}
		}
	}
}
class CarThread5 extends Thread
{
	public void run()
	{
		int count=0;
		for(int j=1;j<7;j++)
		{
			for(int i=1;i<101;i++)
			{
				if(i==50)
				{
					System.out.println("car5 reached petrol pump");
				}
				if(i==100)
				{
					System.out.println("car5 won the race");
				}
			}
			count=count+1;
			System.out.println("count:" +count);
			if(count==6)
			{
				System.out.println("car5 won first");
			}
		}
	}
}
class CarThread6 extends Thread
{
	public void run()
	{
		int count=0;
		for(int j=1;j<7;j++)
		{
			for(int i=1;i<101;i++)
			{
				if(i==50)
				{
					System.out.println("car6 reached petrol pump");
				}
				if(i==100)
				{
					System.out.println("car6 won the race");
				}
			}
			count=count+1;
			System.out.println("count:" +count);
			if(count==6)
			{
				System.out.println("car6 won first");
			}
		}
	}
}

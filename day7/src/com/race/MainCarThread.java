package com.race;
public class MainCarThread {
	public static void main(String[] args) 
	{
		CarThread1 ct1=new CarThread1();
		CarThread2 ct2=new CarThread2();
		CarThread3 ct3=new CarThread3();
		CarThread4 ct4=new CarThread4();
		CarThread5 ct5=new CarThread5();
		CarThread6 ct6=new CarThread6();
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		ct5.start();
		ct6.start();
	}
}

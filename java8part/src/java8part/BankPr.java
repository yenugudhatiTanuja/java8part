package java8part;

import java.util.Scanner;

class Account 
{
	int Accountno=12345;
	int balance=0;
	synchronized void  deposit(int a)
	{
		int depositmoney=a;
	    balance=balance+depositmoney;
	    System.out.println("After Deposit");
	    mainbalance();
	}
	synchronized void withdraw(int a)
	{
		int withdrawmoney=a;
		balance=balance-withdrawmoney;
		System.out.println("after withdraw");
		mainbalance();
	}
	void mainbalance()
	{
		System.out.println("MainBalance");
		System.out.println("Account number--->"+Accountno+"\tBAlance---->"+balance);
	}
	
}
class MyThread extends Thread
{
	Account t1,t3;
	MyThread(Account t1,  Account t3)
	{
		this.t1=t1;
		//this.t2=t2;
		this.t3=t3;
	}
	public void run()
	{
		t1.deposit(3000);
		//t2.mainbalance();
		t3.withdraw(1000);
		//t2.mainbalance();

	}
}
public class BankPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account obj=new Account();
      MyThread t = new MyThread(obj,obj);
      t.start();
	}

}

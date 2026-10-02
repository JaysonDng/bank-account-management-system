/* JaysonDang & HoangPham
 * December 8, 2022
 * CS A170
 */
public class BankAcountDemo {

	public static void main(String[] args)
	{
		  BankAccount AdamsAcc = new BankAccount();
			AdamsAcc.setBalance(10000);
			AdamsAcc.setAccType('C');
			AdamsAcc.setName("Adam Sandler");
			AdamsAcc.displayAccount();
			System.out.println("*****************************************");
	      BankAccount LeilasAcc=new BankAccount(500,"LeiLa", 'S');
			LeilasAcc.deposit(300);
			LeilasAcc.displayAccount();
			AdamsAcc.transfer(LeilasAcc,200);
			LeilasAcc.addinterest();
			System.out.println("******************************************");
		BankAccount SamsAcc = new BankAccount(300,"Sam", 'S');
			SamsAcc.displayAccount();
			SamsAcc.withdraw(100);
			SamsAcc.transfer(LeilasAcc, 300);


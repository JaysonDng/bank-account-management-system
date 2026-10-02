/* JaysonDang & HoangPham
 * December 8, 2022
 * CS A170
 */
public class BankAccount 
{
	private double balance;
	private String accName;
	private int accNum;
	private char accType;
	private double interestRate;
	private static int lastAccNum =0;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return accName;
	}
	public void setName(String accName) {
		this.accName  = accName;
	}
	public char getAccType() {
		return accType;
	}
	public void setAccType(char accType) {
		this.accType = accType;
	}

	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public BankAccount()
	{
	   lastAccNum++;
		this.accNum = lastAccNum;	
		if(this.accType == 'S') {
			this.interestRate = 0.03;
		}
		else
			this.interestRate=0.0;

	}
	public BankAccount(double balance, String accName, char accType)
	{
	   lastAccNum++;
		this.balance = balance;
		this.accName = accName;
		this.accType = accType;
		this.accNum = lastAccNum;

	if(this.accType == 'S') {
			this.interestRate = 3.0;
		}
		else
			this.interestRate=0.0;
		
	}
	public void withdraw(double amount) {
		
		if (amount <= this.balance) {
			this.balance -= amount;
		}
		else
			throw new IllegalArgumentException  ("insufficient funds");
			System.out.println("The balance after withdrawing is: " + this.balance);
	}
	
	
	public void addinterest(){
		if (this.accType == 'S') {
			double interest = Financial.percentOf(this.interestRate, this.balance);
			this.balance += interest;
			System.out.println("Account balance after adding interest is: " + this.balance);
			
		}
	}
	public void deposit(double deposit)
	{
		balance = balance + deposit;
	}
	public void transfer ( BankAccount accName, double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			accName.balance += amount;
			System.out.println("Balance after transfering: " + accName.balance);
		}
		else
		{
			throw new IllegalArgumentException  ("Insufficient funds to transfer");
		}
	}
	public void displayAccount()
	{
		System.out.println("The account name is: " + this.accName);
		System.out.println("The account balance is: " + this.balance);
		System.out.println("The account number is: " + this.accNum);
		System.out.println("The account interest rate is: " + this.interestRate);
	}
	}

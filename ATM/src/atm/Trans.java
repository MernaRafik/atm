package atm;

public class Trans {
	History h = new History();
	String [] history = new String [5];
	int cases,amount,B;
	int count = 0;
	private int balance=0;
	private String cardnumber="4567";
	
	public boolean validation(String card_number) {
		return (card_number.equals(cardnumber));
		
	}
	
	public void deposit(int cash) {
		cases=1;
		amount=cash;
		balance=balance+cash;
		addToHistory();
	}
	
	public boolean withdraw (int cash ) {
		cases=2;
		amount=cash;
		boolean v;
		
		if (balance>=cash) {
			balance=balance-cash;
			v=true;
			addToHistory();
		}
		else
		{
			v=false;
		}
		return v;
			
	}	
	public int getBalance () {
		cases=3;
		addToHistory();
		return balance;
	}
	
	
	public void addToHistory() {
		if(cases==1) {		
		h.enter(history,"Desposit of " + amount );
		count++;
		}
		else if (cases == 2) {
		h.enter(history,"Withdrawl of " +amount);
		count++;
		}
		else if (cases == 3) {
			
		h.enter(history, "The balance is " +balance);
		count++;
		}
}
	
	public String previousB() {
		if(count>0 ) {
		return history[--count];
		}
		return null;
		}	
	
	public String nextB() {
		if(count>=0 && count<=4) {
		return	history[count++];
		
		}
		return null;
	
	}
} 
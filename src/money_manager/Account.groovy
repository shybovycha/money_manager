package money_manager

class Account 
{
	private transactions
	
	Account()
	{
		transactions = []
	}
	
	int balance()
	{
		def sum = 0
		
		transactions.each { sum += it.amount }
		
		sum
	}
	
	void obtain(amount)
	{
		transactions.push(new Income(amount))
	}
	
	void spent(amount)
	{
		transactions.push(new Outcome(amount))
	}
}

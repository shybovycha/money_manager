package money_manager

import money_manager.Account;
import groovy.util.GroovyTestCase

class AccountTest extends GroovyTestCase 
{
	private me
	
	void setUp()
	{
		me = new Account()
	}
	
	void testConstruction() 
	{
		assert me.balance() == 0
	}
	
	void testIncome()
	{
		me.obtain(100)
		
		assert me.balance() == 100
		
		me.obtain(150)
		
		assert me.balance() == 250
	}
	
	void testOutcome()
	{
		me.obtain(100)
		
		assert me.balance() == 100
		
		me.spent(35)
		
		assert me.balance() == 65
	}
}

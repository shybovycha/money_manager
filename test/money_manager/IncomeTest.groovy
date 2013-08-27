package money_manager

import money_manager.Income;
import groovy.util.GroovyTestCase

class IncomeTest extends GroovyTestCase 
{
	void testConstructor()
	{
		def income = new Income(100)
		
		assert income.amount > 0
	}
}

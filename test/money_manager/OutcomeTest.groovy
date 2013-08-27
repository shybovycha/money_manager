package money_manager

import money_manager.Outcome;
import groovy.util.GroovyTestCase

class OutomeTest extends GroovyTestCase 
{
	void testConstructor()
	{
		def outcome = new Outcome(40)
		
		assert outcome.amount < 0
	}
}
